package Day24;

import java.util.ArrayList;

import java.util.Scanner;

public class StudentMainVer01ByHSM {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		int menu = -1;
		
		ArrayList<StudentVer01ByHSM> std = new ArrayList<StudentVer01ByHSM>();
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu, std);
			
		} while(menu != 3);
		
	}

	private static void printMenu() {
		
		System.out.println("--------메인 메뉴--------");
		
		System.out.println("1. 학생 추가");
		
		System.out.println("2. 학생 출력");
		
		System.out.println("3. 종료");
		
		System.out.println("---------------------");
		
		System.out.print("메인 메뉴를 입력하세요 : ");

	}
	
	private static void runMenu(int menu, ArrayList<StudentVer01ByHSM> std) {
		
		switch(menu) {
		
		case 1 : 
			
			System.out.println("-------------------");
			
			addStudent(std);
			
			break;
			
		case 2 :
			
			System.out.println("-------------------");
			
			printStudent(std);
			
			break;
			
		case 3 :
			
			System.out.println("-------------------");
			
			System.out.println("프로그램을 종료합니다.");
			
			break;
			
		default :
			
			System.out.println("-------------------");
			
			System.out.println("메뉴를 잘못 입력했습니다.");
			
			break;
		
		}
		
	}

	private static void addStudent(ArrayList<StudentVer01ByHSM> std) {
		
		System.out.println("-------------------");
		
		System.out.print("학생 이름 : ");
		
		String name = sc.next();
		
		System.out.print("학생 학년 : ");
		
		int grade = sc.nextInt();
		
		System.out.print("학생 반 : ");
		
		int ban = sc.nextInt();
		
		System.out.print("학생 번호 : ");
		
		int bunho = sc.nextInt();
		
		StudentVer01ByHSM stds = new StudentVer01ByHSM(name, grade, ban, bunho);
		
		std.add(stds);
		
	}
	
	private static void printStudent(ArrayList<StudentVer01ByHSM> std) {
		
		for(int i = 0; i < std.size(); i++) {
			
			System.out.println((i + 1) + "번 학생의 정보는 " + std.get(i));
			
		}
		
	}

}