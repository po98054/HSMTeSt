package Day45;

import java.sql.*;

import java.util.ArrayList;

import lombok.Data;

public class DBTest01 {
	
	static Statement stmt = null;
	
	static ResultSet rs = null;
	
	static PreparedStatement pstmt = null;
	
	public static void main(String[] args) throws Exception {
		
		Connection con = null;
		
		String url = "jdbc:mysql://localhost/university"; // localhost : 내부 로컬 주소 -> 프로그램이 실행되는 서버와 DB가 같은 PC에 있는 경우 dev : 데이터베이스 이름
		
		String id = "root";
		
		String pw = "root";
		
		ArrayList<Student> list = null;
		
		con = connect(url, id, pw); // university 데이터베이스 연결
		
		try {
			
			stmt = con.createStatement();
			
			deleteStudent(con, "2022160009");
			
			list = selectAllStudent(con);
			
			System.out.println(list);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		connectClose(con);
            
    }
		
	public static Connection connect(String url, String id, String pw) {
			
		Connection con = null;
			
		try {
				
			Class.forName("com.mysql.cj.jdbc.Driver"); // 이 이름을 가진 클래스로 지정하면 연결이 된다. mysql : DBMS 
						
			con = DriverManager.getConnection(url, id, pw);
				
			System.out.println("연결 성공");
				
			} catch(ClassNotFoundException e) {
				
			  System.out.println("드라이버 로딩 실패");
				
			} catch(SQLException e){
				
			  System.out.println("에러: " + e);
				
			}
			
			return con;
			
	}
		
	public static void connectClose(Connection con) {
			
	     try {
				
			   if(con != null && !con.isClosed()) {
					
				   con.close();
					
				   System.out.println("연결 해제");
					
			    }
				
			 }catch( SQLException e) {
				
				e.printStackTrace();
				
			}
			
		}
	
	public static ArrayList<Student> selectAllStudent(Connection con) throws SQLException {
		
		String sql = "select * from student";
		
		ResultSet rs = stmt.executeQuery(sql); // select 시에 필요합니다.
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		while(rs.next()) {
			
			String st_num = rs.getString(1);
			
			String st_name = rs.getString(2);
			
			int st_semester = rs.getInt(3);
			
			String st_state = rs.getString(4);
			
			String st_pr_num = rs.getString(5);
			
			Student std = new Student(st_num, st_name, st_semester, st_state, st_pr_num);
			
			list.add(std);
		}
		
		return list;
		
	}
	
	public static void insertStudent(Connection con, String st_num, String st_name, int st_semester, String st_state, String st_pr_num) throws SQLException{
		
		String sql = "insert into student(st_num, st_name, st_semester, st_state, st_pr_num) values(?, ?, ?, ?, ?)";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, st_num);
		
		pstmt.setString(2, st_name);
		
		pstmt.setInt(3, st_semester);
		
		pstmt.setString(4, st_state);
		
		pstmt.setString(5, st_pr_num);
		
		int count = pstmt.executeUpdate();
		
		if(count == 0) {
			
			System.out.println("추가 실패");
			
		} else {
			
			System.out.println("추가 성공");
			
		}
		
		System.out.println(count);
		
	}
	
	/*private static void updateStudent(Connection con, String st_num, String st_name) throws SQLException{
		
		String sql = "update student set st_name = ? where st_num = ?";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, st_name); // (?의 순서, 넣고 싶은 값);
		
		pstmt.setString(2, st_num);
		
		int count = pstmt.executeUpdate();
		
		if(count == 0) {
			
			System.out.println("수정 실패");
			
		} else {
			
			System.out.println("수정 성공");
			
		}
		
		System.out.println(count);
		
	}*/
	
	private static void deleteStudent(Connection con, String st_num) throws SQLException{
		
		String sql = "delete from student where st_num = ?";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, st_num);
		
		int count = pstmt.executeUpdate();
		
		if(count == 0) {
			
			System.out.println("삭제 실패");
			
		} else {
			
			System.out.println("삭제 성공");
			
		}
		
	}
		
}

@Data
class Student {
	
	private String st_num;
	
	private String st_name;
	
	private int st_semester;
	
	private String st_state;
	
	private String st_pr_num;

	public Student(String st_num, String st_name, int st_semester, String st_state, String st_pr_num) {
		
		this.st_num = st_num;
		
		this.st_name = st_name;
		
		this.st_semester = st_semester;
		
		this.st_state = st_state;
		
		this.st_pr_num = st_pr_num;
		
	}
	
	public Student(String st_num) {
		
		this.st_num = st_num;
		
	}

	@Override
	public String toString() {
		
		return st_name + "의 학기는 " + st_semester + "학기 이며 " + st_name + "의 학번은 " + st_num + "번 이며 " + st_name + "의 상태는 " + st_state + "이며 " + st_name +
				"의 담당 교수의 학번은" + st_pr_num + "입니다." + "\n";
		
	}
	
}