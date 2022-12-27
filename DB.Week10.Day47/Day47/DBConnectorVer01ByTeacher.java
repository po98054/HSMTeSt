package Day47;

import java.sql.*;

import lombok.Data;

@Data
public class DBConnectorVer01ByTeacher {
	
	public Connection con;
	
	public Statement stmt;
	
	public PreparedStatement pstmt;
	
	public ResultSet rs;
	
	public DBConnectorVer01ByTeacher(String url, String id, String pw) {
		
		try {
			
			con = DriverManager.getConnection(url, id, pw);
			
			stmt = con.createStatement();
			
		} catch (SQLException e) {
			
			System.out.println("DB 연동 실패했습니다.");
			
			e.printStackTrace();
			
		}
		
	}
	
	public void close() {
		
		try {
			
			if(con != null && !con.isClosed()) {
				
				con.close();
				
			}
			
			if(stmt != null && !stmt.isClosed()) {
				
				stmt.close();
				
			}
			
			if(pstmt != null && !pstmt.isClosed()) {
				
				pstmt.close();
				
			}
			
			if(rs != null && !rs.isClosed()) {
				
				rs.close();
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}

}