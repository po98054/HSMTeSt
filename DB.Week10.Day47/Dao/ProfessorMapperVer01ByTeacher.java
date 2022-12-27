package Dao;

import java.sql.*;

import Day47.DBConnectorVer01ByTeacher;

import Vo.ProfessorVoVer01ByTeacher;

public class ProfessorMapperVer01ByTeacher implements ProfessorDaoVer01ByTeacher{
	
	private DBConnectorVer01ByTeacher dbConnector;

	public ProfessorMapperVer01ByTeacher(DBConnectorVer01ByTeacher dbConnector) {
		
		this.dbConnector = dbConnector;
		
	}
	
	public void insertprofessor(ProfessorVoVer01ByTeacher pro) {
		
		String sql = "insert into professor(pr_num, pr_name, pr_state, pr_de_num, pr_tel) values(?, ?, ?, ?, ?)";
	
		try {
		
		dbConnector.pstmt = dbConnector.con.prepareStatement(sql);
		
		dbConnector.pstmt.setString(1, pro.getPr_num());
		
		dbConnector.pstmt.setString(2, pro.getPr_name());
		
		dbConnector.pstmt.setString(3, pro.getPr_state());
		
		dbConnector.pstmt.setString(4, pro.getPr_de_num());
		
		dbConnector.pstmt.setString(5, pro.getPr_tel());
		
		int count = dbConnector.pstmt.executeUpdate();
		
		if(count == 0) {
			
			System.out.println("교수 정보 추가 실패");
			
		} else {
			
			System.out.println("교수 정보 추가 성공");
			
		}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public void updateprofessor(ProfessorVoVer01ByTeacher pro) {
		
		String sql = "update professor set pr_name = ?, pr_state = ?, pr_de_num = ?, pr_tel = ? where pr_num = ?";
		
		try {
			
			dbConnector.pstmt = dbConnector.con.prepareStatement(sql);
			
			dbConnector.pstmt.setString(5, pro.getPr_num());
			
			dbConnector.pstmt.setString(1, pro.getPr_name());
			
			dbConnector.pstmt.setString(2, pro.getPr_state());
			
			dbConnector.pstmt.setString(3, pro.getPr_de_num());
			
			dbConnector.pstmt.setString(4, pro.getPr_tel());
			
			int count = dbConnector.pstmt.executeUpdate();
			
			if(count == 0) {
				
				System.out.println("교수 정보 수정 실패");
				
			} else {
				
				System.out.println("교수 정보 수정 성공");
				
			}
			
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
			
			}
	
}
		