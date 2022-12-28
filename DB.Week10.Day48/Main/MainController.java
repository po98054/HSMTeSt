package Main;

import java.util.ArrayList;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import Dao.StudentDaoVer03ByHSM;

import Vo.StudentVoVer02ByTeacher;

public class MainController {
	
	private SqlSession session;
	
	private StudentDaoVer03ByHSM studentDao;
	
	private Scanner sc = new Scanner(System.in);
	
	public MainController(SqlSession session) {
		
		this.session = session;
		
		studentDao = session.getMapper(StudentDaoVer03ByHSM.class);
		
	}
	
	public void run() {
		
		int menu = -1;
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
			
		} while(menu != 4);
		
	}

	private void printMenu() {
		
		System.out.println("-----------------메인 메뉴---------------");
		
		System.out.println("1. 학생 추가");
		
		System.out.println("2. 학생 수정");
		
		System.out.println("3. 학생 조회");
		
		System.out.println("4. 프로그램 종료");
		
		System.out.println("----------------------------------------");
		
		System.out.print("메인 메뉴 선택 : ");
		
	}
	
	private void runMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("-------------------------");
			
			insertStudent();
			
			System.out.println("-------------------------");
		
			break;
		
		case 2 :
			
			System.out.println("-------------------------");
			
			updateStudent();
			
			System.out.println("-------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("-------------------------");
			
			selectStudent();
			
			System.out.println("-------------------------");
			
			break;
			
		case 4 :
			
			System.out.println("-------------------------");
			
			System.out.println("프로그램을 종료합니다. ");
			
			System.out.println("-------------------------");
			
			break;
			
		default :
			
			System.out.println("-------------------------");
			
			System.out.println("메인 메뉴를 잘못 입력했습니다. ");
			
			System.out.println("-------------------------");
		
		}
		
	}

	private void insertStudent() {
		
		System.out.println("추가할 정보를 입력하세요");
		
		System.out.println("-------------------------------");
		
		sc.nextLine();
		
		System.out.print("학번 : ");
		
		String st_num = sc.nextLine();
		
		System.out.print("이름 : ");
		
		String st_name = sc.nextLine();
		
		System.out.print("학기 : ");
		
		int st_semester = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("상태(재학생/자퇴생/졸업생) : ");
		
		String st_state = sc.nextLine();
		
		System.out.print("지도 교수 번호 : ");
		
		String st_pr_num = sc.nextLine();
		
		StudentVoVer02ByTeacher std = new StudentVoVer02ByTeacher(st_num, st_name, st_semester, st_state, st_pr_num);
		
		studentDao.insertStudent(std);
		
		session.commit();
		
		System.out.println("------------------------------------");
		
	}
	
	private void updateStudent() {
		
		System.out.println("수정할 정보를 입력하세요");
		
		System.out.println("-------------------------------");
		
		sc.nextLine();
		
		System.out.print("학번 : ");
		
		String st_num = sc.nextLine();
		
		System.out.print("이름 : ");
		
		String st_name = sc.nextLine();
		
		System.out.print("학기 : ");
		
		int st_semester = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("상태(재학생/자퇴생/졸업생) : ");
		
		String st_state = sc.nextLine();
		
		System.out.print("지도 교수 번호 : ");
		
		String st_pr_num = sc.nextLine();
		
		StudentVoVer02ByTeacher std = new StudentVoVer02ByTeacher(st_num, st_name, st_semester, st_state, st_pr_num);
		
		studentDao.updateStudent(std);
		
		session.commit();
		
		System.out.println("------------------------------------");
	
	}
	
	private void selectStudent() {
		
		System.out.println("------------------------------------");
		
		ArrayList<StudentVoVer02ByTeacher> list = studentDao.selectAllStudent();
		
		System.out.println(list);
		
		System.out.println("------------------------------------");
		
	}

}