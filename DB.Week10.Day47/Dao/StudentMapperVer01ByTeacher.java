package Dao;

import java.sql.*;

import Day47.DBConnectorVer01ByTeacher;

import Vo.StudentVoVer01ByTeacher;

public class StudentMapperVer01ByTeacher implements StudentDaoVer01ByTeacher{
	
	private DBConnectorVer01ByTeacher dbConnector;

	public StudentMapperVer01ByTeacher(DBConnectorVer01ByTeacher dbConnector) {
		
		this.dbConnector = dbConnector;
		
	}
	
	public void insertStudent(StudentVoVer01ByTeacher std) {
		
		String sql = "insert into student(st_num, st_name, st_semester, st_state, st_pr_num) values(?, ?, ?, ?, ?)";
	
		try {
		
		dbConnector.pstmt = dbConnector.con.prepareStatement(sql);
		
		dbConnector.pstmt.setString(1, std.getSt_num());
		
		dbConnector.pstmt.setString(2, std.getSt_name());
		
		dbConnector.pstmt.setInt(3, std.getSt_semester());
		
		dbConnector.pstmt.setString(4, std.getSt_state());
		
		dbConnector.pstmt.setString(5, std.getSt_pr_num());
		
		int count = dbConnector.pstmt.executeUpdate();
		
		if(count == 0) {
			
			System.out.println("학생 정보 추가 실패");
			
		} else {
			
			System.out.println("학생 정보 추가 성공");
			
		}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public void updateStudent(StudentVoVer01ByTeacher std) {
		
		String sql = "update student set st_name = ?, st_semester = ?, st_state = ?, st_pr_num = ? where st_num = ?";
		
		try {
			
			dbConnector.pstmt = dbConnector.con.prepareStatement(sql);
			
			dbConnector.pstmt.setString(5, std.getSt_num());
			
			dbConnector.pstmt.setString(1, std.getSt_name());
			
			dbConnector.pstmt.setInt(2, std.getSt_semester());
			
			dbConnector.pstmt.setString(3, std.getSt_state());
			
			dbConnector.pstmt.setString(4, std.getSt_pr_num());
			
			int count = dbConnector.pstmt.executeUpdate();
			
			if(count == 0) {
				
				System.out.println("학생 정보 수정 실패");
				
			} else {
				
				System.out.println("학생 정보 수정 성공");
				
			}
			
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
			
			}
	
	public StudentVoVer01ByTeacher selectStudent(String st_num) {
		
		String sql = "select st_num, st_name, st_semester, st_state, st_pr_num from student where st_num = ?";
		
		try {
		
		dbConnector.pstmt = dbConnector.con.prepareStatement(sql);
		
		dbConnector.pstmt.setString(1, st_num);
		
		dbConnector.rs = dbConnector.pstmt.executeQuery();
		
		if(dbConnector.rs.next()) {
			
			String st_name = dbConnector.rs.getString(2);
			
			int st_semester = dbConnector.rs.getInt(3);
			
			String st_state = dbConnector.rs.getString(4);
			
			String st_pr_num = dbConnector.rs.getString(5);
			
			return new StudentVoVer01ByTeacher(st_pr_num, st_name, st_semester, st_state, st_pr_num);
			
		} else {
			
			return null;
			
		}
		
		} catch(SQLException e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}
	
}
		