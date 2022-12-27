package Day47;

import Service.*;

import java.util.*;

public class UniverSityControllerVer01ByTeacher {
	
		private DBConnectorVer01ByTeacher dbConnector;
		
		private StudentServiceImpVer01ByTeacher studentService;
		
		private ProfessorServiceImpVer01ByTeacher professorService;
		
		private CourseServiceImpVer01ByTeacher courseService;
		
		private Scanner sc = new Scanner(System.in);
		
		{
			
			String url = "jdbc:mysql://localhost/university";
			
			String id = "root";
			
			String pw = "root";
			
			dbConnector = new DBConnectorVer01ByTeacher(url, id, pw);
			
			studentService = new StudentServiceImpVer01ByTeacher(dbConnector);
			
			professorService = new ProfessorServiceImpVer01ByTeacher(dbConnector);
			
			courseService = new CourseServiceImpVer01ByTeacher(dbConnector);
			
		}

		public void run() {
			
			int menu = -1;
			
			int exit = 5;
			
			do {
				
				printMenu();
				
				menu = sc.nextInt();
				
				runMenu(menu);
				
			} while(menu != exit);
			
			dbConnector.close();
		
		}

		private void printMenu() {
			
			System.out.println("------------------메인 메뉴------------------");
			
			System.out.println("1. 학생 관리");
			
			System.out.println("2. 교수 관리");
			
			System.out.println("3. 수강 관리");
			
			System.out.println("5. 프로그램 종료");
			
			System.out.println("--------------------------------------------");
			
			System.out.print("메인 메뉴 선택 : ");
			
		}
		
		private void runMenu(int menu) {
			
			int subMenu = -1;
			
			switch(menu) {
			
			case 1 :
			
					printStudentMenu();
					
					subMenu = sc.nextInt();
					
					sc.nextLine();
					
					runStudentMenu(subMenu);
				
				break;
				
			case 2 : 
				
				printProfessorMenu();
				
				subMenu = sc.nextInt();
				
				sc.nextLine();
				
				runProfessorMenu(subMenu);
				
				break;
				
			case 3 :
				
				printCourseMenu();
				
				subMenu = sc.nextInt();
				
				sc.nextLine();
				
				runCourseMenu(subMenu);
				
				break;
				
			case 5 :
				
				System.out.println("프로그램을 종료합니다.");
				
				break;
				
			default :
				
				System.out.println("잘못된 메인 메뉴를 입력했습니다.");
				
				break;
			
			}
			
		}
		
		private void printStudentMenu() {
			
			System.out.println("----------학생 관리 메뉴-------------");
			
			System.out.println("1. 학생 추가");
			
			System.out.println("2. 학생 수정");
			
			System.out.println("3. 이전 메뉴");
			
			System.out.println("----------------------------------");
			
			System.out.print("학생 관리 메뉴 : ");
			
		}
		
		private void runStudentMenu(int subMenu) {
			
			switch(subMenu) {
			
			case 1 :
				
				studentService.insertStudent();
				
				break;
				
			case 2 :
				
				studentService.updateStudent();
				
				break;
				
			case 3 :
				
				System.out.println("이전 메뉴로 돌아갑니다.");
				
				break;
				
			default : 
				
				System.out.println("잘못된 메뉴입니다.");
				
				break;
			
			}
			
		}
		
		private void printProfessorMenu() {
			
			System.out.println("----------교수 관리 메뉴-------------");
			
			System.out.println("1. 교수 추가");
			
			System.out.println("2. 교수 수정");
			
			System.out.println("3. 지도 학생 등록");
			
			System.out.println("4. 이전 메뉴");
			
			System.out.println("----------------------------------");
			
			System.out.print("교수 관리 메뉴 : ");
			
		}
		
		private void runProfessorMenu(int subMenu) {
			
			switch(subMenu) {
			
			case 1 :
				
				professorService.insertProfessor();
				
				break;
				
			case 2 :
				
				professorService.updateProfessor();
				
				break;
				
			case 3 :
				
				professorService.updateAdvisor();
				
				break;
				
			case 4 :
				
				System.out.println("이전 메뉴로 돌아갑니다.");
				
				break;
				
			default : 
				
				System.out.println("잘못된 메뉴입니다.");
				
				break;
			
			}
			
		}
		
		private void printCourseMenu() {
			
			System.out.println("----------수강 관리 메뉴-------------");
			
			System.out.println("1. 강좌 등록");
			
			System.out.println("2. 강좌 수정");
			
			System.out.println("3. 강좌 삭제");
			
			System.out.println("4. 수강 신청");
			
			System.out.println("5. 수강 취소");
			
			System.out.println("6. 취소");
			
			System.out.println("----------------------------------");
			
			System.out.print("수강 관리 메뉴 : ");
			
		}
		
		private void runCourseMenu(int subMenu) {
			
			switch(subMenu) {
			
			case 1 :
				
				courseService.insertLecture();
				
				break;
				
			case 2 :
				
				courseService.updateLecture();
				
				break;
				
			case 3 :
				
				courseService.deleteLecture();
				
				break;
				
			case 4 :
				
				courseService.insertCourse();
				
				break;
				
			case 5 :
	
				courseService.deleteCourse();
	
				break;
	
			case 6 :
	
				System.out.println("이전 메뉴로 돌아갑니다.");
	
				break;
				
			default : 
				
				System.out.println("잘못된 메뉴입니다.");
				
				break;
			
			}
			
		}
		
}