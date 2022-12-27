package Service;

import Dao.StudentDaoVer01ByTeacher;

import Dao.StudentMapperVer01ByTeacher;

import Day47.DBConnectorVer01ByTeacher;

import Vo.StudentVoVer01ByTeacher;

import java.util.*;

public class StudentServiceImpVer01ByTeacher implements StudentServiceVer01ByTeacher{
	
	private StudentMapperVer01ByTeacher studentDao;
	
	private Scanner sc = new Scanner(System.in);

	public StudentServiceImpVer01ByTeacher(DBConnectorVer01ByTeacher dbConnector) {
		
		studentDao = new StudentMapperVer01ByTeacher(dbConnector);
		
	}
	
	public void insertStudent() {
		
		System.out.println("---------------------------------");
		
		System.out.println("추가할 학생 정보를 입력하세요");
		
		System.out.print("학번 : ");
		
		String st_num = sc.nextLine();
		
		System.out.print("이름 : ");
		
		String st_name = sc.nextLine();
		
		System.out.print("학기 : ");
		
		int st_semester = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("상태 : ");
		
		String st_state = sc.nextLine();
		
		System.out.print("지도 교수 번호 : ");
		
		String st_pr_num = sc.nextLine();
		
		System.out.println("---------------------------------");
		
		StudentVoVer01ByTeacher std = new StudentVoVer01ByTeacher(st_num, st_name, st_semester, st_state, st_pr_num);
		
		studentDao.insertStudent(std);
		
	}
	
	public void updateStudent() {
		
		System.out.println("---------------------------------");
		
		System.out.println("수정할 학생 정보를 입력하세요");
		
		System.out.print("학번 : ");
		
		String st_num = sc.nextLine();
		
		System.out.print("이름 : ");
		
		String st_name = sc.nextLine();
		
		System.out.print("학기 : ");
		
		int st_semester = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("상태 : ");
		
		String st_state = sc.nextLine();
		
		System.out.print("지도 교수 번호 : ");
		
		String st_pr_num = sc.nextLine();
		
		System.out.println("---------------------------------");
		
		StudentVoVer01ByTeacher std = new StudentVoVer01ByTeacher(st_num, st_name, st_semester, st_state, st_pr_num);
		
		studentDao.updateStudent(std);
		
	}

}