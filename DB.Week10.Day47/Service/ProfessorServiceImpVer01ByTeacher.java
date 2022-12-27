package Service;

import Dao.ProfessorDaoVer01ByTeacher;

import Dao.ProfessorMapperVer01ByTeacher;

import Dao.StudentMapperVer01ByTeacher;

import Day47.DBConnectorVer01ByTeacher;

import Vo.ProfessorVoVer01ByTeacher;
import Vo.StudentVoVer01ByTeacher;

import java.util.*;

public class ProfessorServiceImpVer01ByTeacher implements ProfessorServiceVer01ByTeacher{
	
	private ProfessorMapperVer01ByTeacher professorDao;
	
	private Scanner sc = new Scanner(System.in);
	
	private StudentMapperVer01ByTeacher studentDao;

	public ProfessorServiceImpVer01ByTeacher(DBConnectorVer01ByTeacher dbConnector) {
		
		professorDao = new ProfessorMapperVer01ByTeacher(dbConnector);
		
		studentDao = new StudentMapperVer01ByTeacher(dbConnector);
		
	}
	
	public void insertProfessor() {
		
		System.out.println("---------------------------------");
		
		System.out.println("추가할 학생 정보를 입력하세요");
		
		System.out.print("교수 번호 : ");
		
		String pr_num = sc.nextLine();
		
		System.out.print("이름 : ");
		
		String pr_name = sc.nextLine();
		
		System.out.print("상태 : ");
		
		String pr_state = sc.nextLine();
		
		System.out.print("부서명 : ");
		
		String pr_de_num = sc.nextLine();
		
		System.out.print("교수 연락처 : ");
		
		String pr_tel = sc.nextLine();
		
		System.out.println("---------------------------------");
		
		ProfessorVoVer01ByTeacher pro = new ProfessorVoVer01ByTeacher(pr_num, pr_name, pr_state, pr_de_num, pr_tel);
		
		professorDao.insertprofessor(pro);
		
	}
	
	public void updateProfessor() {
		
		System.out.println("---------------------------------");
		
		System.out.println("수정할 학생 정보를 입력하세요");
		
		System.out.print("교수 번호 : ");
		
		String pr_num = sc.nextLine();
		
		System.out.print("이름 : ");
		
		String pr_name = sc.nextLine();
		
		System.out.print("상태 : ");
		
		String pr_state = sc.nextLine();
		
		System.out.print("부서명 : ");
		
		String pr_de_num = sc.nextLine();
		
		System.out.print("교수 연락처 : ");
		
		String pr_tel = sc.nextLine();
		
		System.out.println("---------------------------------");
		
		ProfessorVoVer01ByTeacher pro = new ProfessorVoVer01ByTeacher(pr_num, pr_name, pr_state, pr_de_num, pr_tel);
		
		professorDao.updateprofessor(pro);
		
	}

	public void updateAdvisor() {
		
		System.out.print("교수 번호 : ");
		
		String st_pr_num = sc.nextLine();
		
		System.out.print("학번 : ");
		
		String st_num = sc.nextLine();
		
		StudentVoVer01ByTeacher std = studentDao.selectStudent(st_num);
		
		if(std == null) {
			
			System.out.println("없는 학번이어서 지도 교수 수정에 실패했습니다.");
			
			return;
			
		} 
		
		std.setSt_pr_num(st_pr_num);
		
		studentDao.updateStudent(std);
		
	}

}