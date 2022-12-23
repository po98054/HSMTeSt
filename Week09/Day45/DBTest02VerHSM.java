package Day45;

import java.sql.*;

import java.util.*;

import lombok.Data;

public class DBTest02VerHSM {
	
	static Statement stmt = null;
	
	static ResultSet rs = null;
	
	static PreparedStatement pstmt = null;
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		Connection con = null;
		
		String url = "jdbc:mysql://localhost/university";
		
		String id = "root";
		
		String pw = "root";
		
		ArrayList<Student2> list = null;
		
		con = connect(url, id, pw);
		
		try {
			
			stmt = con.createStatement();
			
			list = inputStudent();
			
			for(int i = 0; i < list.size(); i++) {
				
				insertStudent(con, list.get(i).getSt_num(), list.get(i).getSt_name(), list.get(i).getSt_semester(), 
						list.get(i).getSt_state(), list.get(i).getSt_pr_num());
				
			}
			
			list = selectAllStudent2(con);
			
			System.out.println(list);
			
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		connectClose(con);
		
	}
	
	public static Connection connect(String url, String id, String pw) {
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("연결 성공");
			
		} catch(ClassNotFoundException e) {
			
			System.out.println("드라이버 로딩 실패");
			
		} catch(SQLException e){
			
			System.out.println("에러 " + e);
			
		}
		
		return con;
		
	}
	
	public static void connectClose(Connection con) {
		
		try {
			
			if(con != null && !con.isClosed()) {
				
				con.close();
				
				System.out.println("연결 해제");
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
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
	
	public static ArrayList<Student2> selectAllStudent2(Connection con) throws SQLException {
		
		String sql = "select * from student";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		ArrayList<Student2> list = new ArrayList<Student2>();
		
		while(rs.next()) {
			
			String st_num = rs.getString(1);
			
			String st_name = rs.getString(2);
			
			int st_semester = rs.getInt(3);
			
			String st_state = rs.getString(4);
			
			String st_pr_num = rs.getString(5);
			
			Student2 std = new Student2(st_num, st_name, st_semester, st_state, st_pr_num);
			
			list.add(std);
			
		}
		
		return list;
		
	}
	
	public static ArrayList<Student2> inputStudent() {
		
		ArrayList<Student2> list = new ArrayList<Student2>();
		
		System.out.println("------------------------");
		
		System.out.print("학번 : ");
		
		String st_num = sc.nextLine();
		
		System.out.print("이름 : ");
		
		String st_name = sc.nextLine();
		
		System.out.print("학기 : ");
		
		int st_semester = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("상태 : ");
		
		String st_state = sc.nextLine();
		
		System.out.print("교수님 학번 : ");
		
		String st_pr_num = sc.nextLine();
		
		System.out.println("------------------------");
		
		Student2 std = new Student2(st_num, st_name, st_semester, st_state, st_pr_num);
		
		list.add(std);
		
		return list;
		
	}
	
	
}

@Data
class Student2 {
	
	private String st_num;
	
	private String st_name;
	
	private int st_semester;
	
	private String st_state;
	
	private String st_pr_num;

	public Student2(String st_num, String st_name, int st_semester, String st_state, String st_pr_num) {
		
		this.st_num = st_num;
		
		this.st_name = st_name;
		
		this.st_semester = st_semester;
		
		this.st_state = st_state;
		
		this.st_pr_num = st_pr_num;
		
	}

	@Override
	public String toString() {
		
		return st_name + "의 학기는 " + st_semester + "학기 이며 " + st_name + "의 학번은 " + st_num + "번 이며 " + st_name + "의 상태는 " + st_state + "이며 " + st_name +
				"의 담당 교수의 학번은" + st_pr_num + "입니다." + " \n";
		
	}
	
}
