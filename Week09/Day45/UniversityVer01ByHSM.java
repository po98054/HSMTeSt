package Day45;

import java.sql.*;

import java.util.*;

public class UniversityVer01ByHSM {
	
	static Scanner sc = new Scanner(System.in);
	
	static UniversityDBVer01ByHSM usDB = null;
	
	static ArrayList<Student> list = new ArrayList<Student>();
	
	//static Student std = null;
	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost/university";
		
		String id = "root";
		
		String pw = "root";
		
		try {
			
			usDB = new UniversityDBVer01ByHSM(url, id, pw);
			
		} catch(Exception e) {
			
			System.out.println("DB 연결 실패");
			
			System.out.println("프로그램 종료");
			
			return;
			
		}
		
		int menu = -1;
		
		load();
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
			
		} while(menu != 7);
		
	}
	
	private static void load() {
		
		try {
			
			list = usDB.selectAllStudent();
			
		} catch(SQLException e) {
			
			System.out.println("로딩 실패");
			
		}
		
	}
	
	private static void printMenu() {
		
		System.out.println("---------메인 메뉴---------------");
		
		System.out.println("1. 학생 메뉴 ");
		
		System.out.println("2. 학부 메뉴 ");
		
		System.out.println("3. 강좌 메뉴 ");
		
		System.out.println("4. 교수 메뉴 ");
		
		System.out.println("5. 수강 메뉴 ");
		
		System.out.println("6. 성적 메뉴 ");
		
		System.out.println("7. 프로그램 종료 ");
		
		System.out.println("--------------------------------");
		
		System.out.print("메뉴를 선택하십시오. ");
		
	}
	
	private static void runMenu(int menu) throws Exception {
		
		int subMenu = -1;
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("--------------------------------");
			
			do {
				
				printStudentMenu();
				
				subMenu = sc.nextInt();
				
				runStudentMenu(subMenu);
				
			} while(subMenu != 5);
			
			System.out.println("--------------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("--------------------------------");
			
			//printStudentList();
			
			System.out.println("--------------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("--------------------------------");
	
			System.out.println("프로그램을 종료합니다.");
			
			System.out.println("--------------------------------");
	
			break;
			
		case 4 :
			
			System.out.println("--------------------------------");
	
			System.out.println("프로그램을 종료합니다.");
			
			System.out.println("--------------------------------");
	
			break;
			
		case 5 :
	
			System.out.println("--------------------------------");

			System.out.println("프로그램을 종료합니다.");
	
			System.out.println("--------------------------------");

			break;
	
		case 6 :
	
			System.out.println("--------------------------------");

			System.out.println("프로그램을 종료합니다.");
	
			System.out.println("--------------------------------");

			break;
	
		case 7 :
	
			System.out.println("--------------------------------");
			
			System.out.println("프로그램을 종료합니다.");
	
			System.out.println("--------------------------------");

			break;
			
		default : 
			
			System.out.println("--------------------------------");
			
			System.out.println("메인 메뉴를 잘못 입력했습니다.");
			
			System.out.println("--------------------------------");
			
			break;
		
		}
		
	}
	
	private static void printStudentMenu() {
		
		System.out.println("---------메인 메뉴---------------");
		
		System.out.println("1. 학생 등록 ");
		
		System.out.println("2. 학생 수정 ");
		
		System.out.println("3. 학생 삭제 ");
		
		System.out.println("4. 학생 조회 ");
		
		System.out.println("5. 이전 메뉴로 돌아갑니다. ");
		
		System.out.println("--------------------------------");
		
		System.out.print("메뉴를 선택하십시오. ");
		
    }
	
	private static void runStudentMenu(int subMenu) throws Exception {
		
		switch(subMenu) {
		
		case 1 :
			
			System.out.println("--------------------------------");
			
			insertStudent();
			
			System.out.println("--------------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("--------------------------------");
			
			
			
			System.out.println("--------------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("--------------------------------");
			
			deleteStudent();

			System.out.println("--------------------------------");
	
			break;
			
		case 4 :
			
			System.out.println("--------------------------------");
			
			selectStudent();
			
			System.out.println("--------------------------------");
	
			break;
			
		case 5 :
	
			System.out.println("--------------------------------");

			System.out.println("메인 메뉴로 돌아갑니다.");
	
			System.out.println("--------------------------------");

			break;
			
		default :
			
			System.out.println("--------------------------------");

			System.out.println("학생 메뉴를 잘못 입력 했습니다.");
	
			System.out.println("--------------------------------");

			break;
		
		}
	
	}
	
	private static void insertStudent() throws Exception{
		
		System.out.println("------------------------");
		
		sc.nextLine();
		
		System.out.print("학번 : ");
		
		String st_num = sc.nextLine();
		
		System.out.print("이름 : ");
		
		String st_name = sc.nextLine();
		
		System.out.print("학기 : ");
		
		int st_semester = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("상태(재학/휴학/자퇴/퇴학) : ");
		
		String st_state = sc.nextLine();
		
		System.out.print("지도 교수님 학번 : ");
		
		String st_pr_num = sc.nextLine();
		
		System.out.println("------------------------");
		
		try {
			
			usDB.insertStudent(st_num, st_name, st_semester, st_state, st_pr_num);
			
			Student std = new Student(st_num, st_name, st_semester, st_state, st_pr_num);
			
			list.add(std);
			
			Collections.sort(list, (o1, o2) -> {return o1.getSt_num().compareTo(o2.getSt_num());});
			
		} catch (SQLException e) {
			
			System.out.println("학생 등록에 실패했습니다.");
			
		}
		
	}
	
	private static void deleteStudent() throws Exception {
		
		//System.out.println(std);
		
		System.out.println("------------------------");
		
		sc.nextLine();
		
		System.out.print("학번 : ");
		
		String st_num = sc.nextLine();
		
		try {
			
			usDB.removeStudent(st_num);
			
			
		} catch(Exception e) {
			
			System.out.println("학생 삭제에 실패했습니다.");
			
		}
		
	}
	
	private static void selectStudent() throws Exception {
		
		if(list.size() == 0) {
			
			System.out.println("저장된 학생 정보가 없습니다.");
			
		}
		
		for(Student std : list) {
			
			System.out.println(std);
			
		}
		
	}

}