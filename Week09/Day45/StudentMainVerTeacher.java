package Day45;

import java.sql.*;

import java.util.*;

public class StudentMainVerTeacher {
	
	static Scanner scan = new Scanner(System.in);
	
	static StudentDBVerTeacher stdDB = null;
	
	static ArrayList<Student> list = new ArrayList<Student>();
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost/university";
		
		String id = "root";
		
		String pw = "root";
		
		try {
			
			stdDB = new StudentDBVerTeacher(url, id, pw);
			
		} catch (Exception e) {
			
			System.out.println("DB 연결 실패");

			System.out.println("프로그램 종료");
			
			return;
			
		}
		
		int menu = -1;
		
		load();
		
		do {
			
			printMenu();
			
			menu = scan.nextInt();
			
			runMenu(menu);
			
		} while(menu != 3);
		
	}
	
	private static void load() {

		try {
			
			list = stdDB.selectAllStudent2();
			
		} catch (SQLException e) {
			
			System.out.println("로딩 실패");
			
		}
		
	}
	
	private static void printMenu() {
		
		System.out.println("---------메인 메뉴---------------");
		
		System.out.println("1. 학생 등록 ");
		
		System.out.println("2. 학생 조회 ");
		
		System.out.println("3. 프로그램 종료");
		
		System.out.println("--------------------------------");
		
		System.out.print("메뉴를 선택하십시오. ");
		
	}

	private static void runMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("--------------------------------");
			
			insertStudent();
			
			System.out.println("--------------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("--------------------------------");
			
			printStudentList();
			
			System.out.println("--------------------------------");
			
			break;
			
		case 3 :
			
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
	
	private static void insertStudent() {
		
		System.out.println("------------------------");
		
		scan.nextLine();
		
		System.out.print("학번 : ");
		
		String st_num = scan.nextLine();
		
		System.out.print("이름 : ");
		
		String st_name = scan.nextLine();
		
		System.out.print("학기 : ");
		
		int st_semester = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("상태(재학/휴학/자퇴/퇴학) : ");
		
		String st_state = scan.nextLine();
		
		System.out.print("지도 교수님 학번 : ");
		
		String st_pr_num = scan.nextLine();
		
		System.out.println("------------------------");
		
		try {
			
			stdDB.insertStudent(st_num, st_name, st_semester, st_state, st_pr_num);
			
			Student std = new Student(st_num, st_name, st_semester, st_state, st_pr_num);
			
			list.add(std);
			
			Collections.sort(list, (o1, o2) -> {return o1.getSt_num().compareTo(o2.getSt_num());});
			
		} catch (SQLException e) {
			
			System.out.println("학생 등록에 실패했습니다.");
			
		}
		
	}

	private static void printStudentList() {
		
		if(list.size() == 0) {
			
			System.out.println("저장된 학생 정보가 없습니다.");
			
		}
		
		for(Student std : list) {
			
			System.out.println(std);
			
		}
		
	}

}