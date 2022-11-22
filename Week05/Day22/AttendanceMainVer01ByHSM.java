package Day22;

import java.text.ParseException;

import java.util.ArrayList;

import java.util.Scanner;

public class AttendanceMainVer01ByHSM {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException {
		
		int menu = -1;
		
		ArrayList<StudentVer01ByHSM> list = new ArrayList<StudentVer01ByHSM>();
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu, list);
			
		} while(menu != 9);
		
	}

	private static void printMenu() {
		
		System.out.println("--------메뉴---------");
		
		System.out.println("1. 학생 등록");
		
		System.out.println("2. 학생 수정");
		
		System.out.println("3. 학생 삭제");
		
		System.out.println("4. 학생 출결 확인");
		
		System.out.println("5. 출석 확인");
		
		System.out.println("6. 출석 수정");
		
		System.out.println("7. 출석 삭제");
		
		System.out.println("8. 날짜별 출석 확인");
		
		System.out.println("9. 프로그램 종료");
		
		System.out.println("-------------------");
		
		System.out.print("메뉴를 입력하세요 : ");
		
	}
	
	private static void runMenu(int menu, ArrayList<StudentVer01ByHSM> list) throws ParseException {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("-------------------");
			
			inputStudent(list);
			
			break;
			
		case 2 : 
			
			System.out.println("-------------------");
			
			System.out.println("수정할 학생의 정보를 입력하세요.");
			
			int index = list.indexOf(insertStudent());
			
			System.out.println("------------------------");
			
			if(index == -1) {
				
				System.out.println("일치하는 게시글이 없습니다. ");
				
			}
			
			System.out.println(list.get(index));
			
			if(updateStudent(list, index)) {
				
				System.out.println("-------------------");
				
				System.out.println("성공적으로 수정이 왼료되었습니다.");
				
			} else {
				
				System.out.println("-------------------");
				
				System.out.println("수정이 실패하였습니다.");
				
			}
			
			break;
			
		case 3 : 
			
			System.out.println("-------------------");
			
			if(deleteStudent(list)) {
				
				System.out.println("-------------------");
				
				System.out.println("성공적으로 삭제가 왼료되었습니다.");
				
			} else {
				
				System.out.println("-------------------");
				
				System.out.println("삭제가 실패하였습니다.");
				
			}
			
			break;
			
		case 4 : 
			
			System.out.println("-------------------");
			
			ArrayList<StudentLogVer01ByHSM> slList = new ArrayList<StudentLogVer01ByHSM>();
			
			System.out.println("조회할 학생의 정보를 입력하세요.");
			
			int index2 = list.indexOf(insertStudent());
			
			System.out.println("------------------------");
			
			if(index2 == -1) {
				
				System.out.println("일치하는 게시글이 없습니다. ");
				
			}
			
			System.out.println(slList.get(index2));
			
			break;
			
		case 5 : 
			
			System.out.println("-------------------");
			
			System.out.print("이름 : ");
			
			String name = sc.next();
			
			StudentVer01ByHSM std = new StudentVer01ByHSM(name);
			
			System.out.println(std.getName() + " 출석 현황");
			
			
			
			break;
			
		case 6 : 
			
			System.out.println("-------------------");
			
			System.out.println("출석 수정하는 기능");
			
			break;
			
		case 7 : 
			
			System.out.println("-------------------");
			
			System.out.println("출석 삭제하는 기능");
			
			break;
			
		case 8 : 
			
			System.out.println("-------------------");
			
			System.out.println("날짜별 출석 확인하는 기능");
			
			break;
			
		case 9 : 
			
			System.out.println("-------------------");
			
			System.out.println("프로그램을 종료합니다.");
			
			break;
			
		default :
			
			System.out.println("-------------------");
			
			System.out.println("메뉴를 잘못 입력했습니다.");
			
			break;
		
		}
		
	}
	
	private static StudentVer01ByHSM insertStudent() throws ParseException {
		
		System.out.print("이름 : ");
		
		String name = sc.next();
		
		System.out.print("생년월일 : ");
		
		String birthday = sc.next();
		
		return new StudentVer01ByHSM(name, birthday);
		
	}

	private static void inputStudent(ArrayList<StudentVer01ByHSM> list) throws ParseException {
		
		StudentVer01ByHSM std = insertStudent();
		
		list.add(std);
		
		System.out.println(list);
		
	}
	
	private static boolean updateStudent(ArrayList<StudentVer01ByHSM> list, int index) throws ParseException {
		
		StudentVer01ByHSM temp = list.get(index);
		
		System.out.println("수정 정보를 입력하세요.");
		
		System.out.print("이름 : ");
		
		String name2 = sc.next();
		
		System.out.print("생년월일 : ");
		
		String birthday2 = sc.next();
		
		System.out.println("------------------------");
		
		temp.update(name2, birthday2);
		
		System.out.println(temp);
		
		return true;
		
	}
	
	private static boolean deleteStudent(ArrayList<StudentVer01ByHSM> list) throws ParseException {
		
		StudentVer01ByHSM std = insertStudent();
		
		int index = list.indexOf(std);
		
		System.out.println(list.get(index).toString());
		
		list.remove(index);
		
		System.out.println(list);
		
		return true;
		
	}

}

enum State{
	
	T("지각"), L("조퇴"), O("출석"), X("결석");
	
	private final String state;
	
	private State(String state) {
		
		this.state = state;
		
	}
	
	public String getState() {
		
		return state;
		
	}
	
}