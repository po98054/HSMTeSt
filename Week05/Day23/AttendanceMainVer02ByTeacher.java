package Day23;

import java.util.ArrayList;

import java.util.Scanner;

public class AttendanceMainVer02ByTeacher {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		int menu = -1;
		
		AttendanceVer02ByTeacher attendance = new AttendanceVer02ByTeacher();
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			sc.nextLine();
			
			runMenu(menu, attendance);
			
		} while(menu != 3);
		
	}
	
	private static void printBar() {
		
		System.out.println("--------------------------");
		
	}
	
	private static void printStr(String str) {
		
		printBar();
		
		System.out.println(str);
		
		printBar();
		
	}

	private static void printMenu() {
		
		System.out.println("--------메인 메뉴------------");
		
		System.out.println("1. 학생 관리");
		
		System.out.println("2. 출석 관리");
		
		System.out.println("3. 종료");
		
		System.out.println("--------------------------");
		
		System.out.print("메인 메뉴를 선택하세요. : ");
		
	}
	

	private static void runMenu(int menu, AttendanceVer02ByTeacher attendance) {
		
		ArrayList<StudentVer02ByTeacher> stds = attendance.getStds();
		
		ArrayList<LogVer02ByTeacher> logs = attendance.getLogs();
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("--------------------------");
			
			managementStudents(stds);
			
			break;
			
		case 2 :
			
			System.out.println("--------------------------");
			
			//managementLogs(logs, stds);
			
			break;
			
		case 3 :
			
			printStr("프로그램 종료!!");
			
			break;
			
		default :
			
			printStr("메뉴를 잘못 입력했습니다.");
			
			break;
		
		}
		
	}
	
	private static void printSubMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("---------학생 관리 서브 메뉴-----------");
			
			System.out.println("1. 학생 등록");
			
			System.out.println("2. 학생 수정");
			
			System.out.println("3. 학생 삭제");
			
			System.out.println("4. 취소");
			
			System.out.println("-----------------------------------");
			
			System.out.print("학생 관리 서브 메뉴를 입력하세요 : ");
			
			break;
			
		case 2 : 
			
			System.out.println("----------출석 관리 서브 메뉴------------");
			
			System.out.println("1. 출석 체크 - 전체 -");
			
			System.out.println("2. 출석 확인 - 개별 -");
			
			System.out.println("3. 출석 확인 - 날짜별 -");
			
			System.out.println("4. 출석 수정");
			
			System.out.println("5. 출석 삭제");
			
			System.out.println("6. 취소");
			
			System.out.println("------------------------------------");
			
			System.out.print("출석 관리 서브 메뉴를 입력하세요. :");
			
			break;
			
		default :
			
			printStr("잘못된 메뉴를 입력했습니다.");
		
		}
		
	}
	
	private static void managementStudents(ArrayList<StudentVer02ByTeacher> stds) {
		
		printSubMenu(1);
		
		int subMenu = sc.nextInt();
		
		sc.nextLine();
	
		switch(subMenu) {
		
		case 1 :
			
			printBar();
			
			addStudent(stds);
			
			break;
			
		case 2 : 
			
			printBar();
			
			updateStudent(stds);
			
			break;
			
		case 3 :
			
			printBar();
			
			deleteStudent(stds);
			
			break;
			
		case 4 :
			
			printStr("취소 했습니다.");
			
			break;
			
		default :
			
			printStr("메뉴를 잘못 입력했습니다.");
		
		}
		
	}

	public static void addStudent(ArrayList<StudentVer02ByTeacher> stds) {
		
		if(stds == null) {
			
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
			
		}
		
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		System.out.print("생일 : ");
		
		String birthday = sc.nextLine();
		
		StudentVer02ByTeacher std = new StudentVer02ByTeacher(name, birthday);
		
		if(stds.indexOf(std) != -1) {
			
			printStr("학생 정보를 추가하지 못했습니다.");
			
			return;
			
		}
		
		stds.add(std);
		
		printStr("학생 정보를 추가했습니다.");
		
	}
	
	public static void updateStudent(ArrayList<StudentVer02ByTeacher> stds) {
		
		if(stds == null) {
			
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
			
		}
		
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		System.out.print("생일 : ");
		
		String birthday = sc.nextLine();
		
		StudentVer02ByTeacher std = new StudentVer02ByTeacher(name, birthday);
		
		int index = stds.indexOf(std);
		
		if(index == -1) {
			
			printStr("입력 정보와 일치하는 학생이 없습니다.");
			
			return;
			
		}
		
		printBar();
		
		System.out.print("수정할 이름 : ");
		
		name = sc.nextLine();
		
		System.out.print("수정할 생일 : ");
		
		birthday = sc.nextLine();
		
		std = new StudentVer02ByTeacher(name, birthday);
		
		stds.set(index, std);
		
		printStr("학생 정보를 수정했습니다.");
		
	}
	

	private static void deleteStudent(ArrayList<StudentVer02ByTeacher> stds) {
		
		if(stds == null) {
			
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
			
		}
		
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		System.out.print("생일 : ");
		
		String birthday = sc.nextLine();
		
		StudentVer02ByTeacher std = new StudentVer02ByTeacher(name, birthday);
		
		int index = stds.indexOf(std);
		
		if(index == -1) {
			
			printStr("입력 정보와 일치하는 학생이 없습니다.");
			
			return;
			
		}
		
		stds.remove(index);
		
		printStr("학생 정보를 삭제했습니다.");
		
		System.out.println(stds);
		
	}

}