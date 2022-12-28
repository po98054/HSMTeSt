package Main;

import java.util.ArrayList;

import java.util.InputMismatchException;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import Dao.StudentDaoVer04ByTeacher;

import Vo.StudentVoVer02ByTeacher;

import Vo.StudentVoVer03ByTeacher;

public class MainControllerVer02ByTeacher {
	
	private SqlSession session;
	
	private StudentDaoVer04ByTeacher studentDao;
	
	private Scanner sc;
	
	public MainControllerVer02ByTeacher(SqlSession session) {
		
		this.session = session;
		
		studentDao = session.getMapper(StudentDaoVer04ByTeacher.class);
		
		sc = new Scanner(System.in);
		
	}
	
	public void run() {
		
		int menu = -1;
		
		do {
			
			try {
			
			printMenu();
			
			menu = sc.nextInt();
			
			sc.nextLine();
			
			runMenu(menu);
			
			} catch(InputMismatchException e) {
				
				System.out.println("------------------------------");
				
				System.out.println("잘못된 타입을 입력");
				
				System.out.println("------------------------------");
				
				sc.nextLine();
				
			} catch(Exception e) {
				
				System.out.println("------------------------------");
				
				System.out.println(e.getMessage());
				
				System.out.println("------------------------------");
				
			}
			
		} while(menu != 4);
		
	}
	
	private void printMenu() {
		
		System.out.println("--------------메인 메뉴----------------------");
		
		System.out.println("1. 학생 추가");
		
		System.out.println("2. 학생 수정");
		
		System.out.println("3. 학생 조회");
		
		System.out.println("4. 프로그램 종료");
		
		System.out.println("--------------------------------------");
		
		System.out.print("메인 메뉴 선택 : ");
		
	}
	
	private void runMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("--------------------------------------");
			
			insertStudent();
			
			System.out.println("--------------------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("--------------------------------------");
			
			updateStudent();
			
			System.out.println("--------------------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("--------------------------------------");
			
			selectAllStudent();
			
			System.out.println("--------------------------------------");
			
			break;
			
		case 4 :
			
			System.out.println("--------------------------------------");
			
			System.out.println("프로그램을 종료 합니다.");
			
			System.out.println("--------------------------------------");
			
			break;
			
		default :
			
			System.out.println("--------------------------------------");
			
			System.out.println("잘못된 메뉴를 입력했습니다.");
			
			System.out.println("--------------------------------------");
			
			break;
		
		}
		
	}
	
	private void insertStudent() {
		
		System.out.println("학생 정보를 입력하세요.");
		
		System.out.println("------------------------------------");
		
		System.out.print("학번 : ");
		
		String st_num = sc.nextLine();
		
		System.out.print("이름 : ");
		
		String st_name = sc.nextLine();
		
		System.out.print("학기 : ");
		
		int st_semester = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("상태(재학/휴학/자퇴/퇴학/졸업/수료) : ");
		
		String st_state = sc.nextLine();
		
		System.out.print("지도 교수 번호 : ");
		
		String st_pr_num = sc.nextLine();
		
		StudentVoVer02ByTeacher std = new StudentVoVer02ByTeacher(st_num, st_name, st_semester, st_state, st_pr_num);
		
		if(studentDao.insertStudent(std) != 0) {
			
			System.out.println("학생 추가 성공");
			
			session.commit();
			
		} else {
			
			System.out.println("학생 추가 실패");
			
		}
		
		System.out.println("----------------------------------------");
		
		
	}
	
	private void updateStudent() {
		
		System.out.println("수정할 학생 정보를 입력하세요.");
		
		System.out.println("------------------------------------");
		
		System.out.print("학번 : ");
		
		String st_num = sc.nextLine();
		
		System.out.print("학기 : ");
		
		int st_semester = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("상태(재학/휴학/자퇴/퇴학/졸업/수료) : ");
		
		String st_state = sc.nextLine();
		
		StudentVoVer02ByTeacher std = studentDao.selectStudent(st_num);
		
		if(std == null) {
			
			System.out.println("학생 수정 실패");
			
			return;
			
		}
		
		std.setSt_semester(st_semester);
		
		std.setSt_state(st_state);
		
		if(studentDao.updateStudent(std) != 0) {
			
			System.out.println("학생 수정 성공");
			
			session.commit();
			
		} else {
			
			System.out.println("학생 수정 실패");
			
		}
		
		System.out.println("----------------------------------------");
		
	}
	
	private void selectAllStudent() {
		
		//ArrayList<StudentVoVer02ByTeacher> list = studentDao.selectAllStudent();
		
		ArrayList<StudentVoVer03ByTeacher> list = studentDao.selectAllStudent2();
		
		if(list.size() == 0) {
			
			System.out.println("검색 결과가 없습니다.");
			
			return;
			
		}
		
		for(StudentVoVer03ByTeacher temp : list) {
			
			System.out.println(temp);
			
		}
		
	}

}