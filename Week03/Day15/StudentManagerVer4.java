package Day15;

import java.util.ArrayList;

import java.util.Scanner;

public class StudentManagerVer4 {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<StudentVer4> std = new ArrayList<StudentVer4>();
		
		int menu = -1;
		
		//반복
		
		for( ;menu != 4 ; ) {
			
			// 메뉴 출력
			
			printMenu();
			
			// 메뉴 선택
			
			menu = scan.nextInt();
			
			// 선택한 메뉴에 따른 기능 실행
			
			runMenu(menu, std);
		
	}
		
}

	private static void runMenu(int menu, ArrayList<StudentVer4> std) {
		
		Scanner scan = new Scanner(System.in);

		switch(menu) {
		
		case 1 :
			
			if(addStudent(std)) {
				
				System.out.println("학생을 추가했습니다.");
				
			} else {
				
				System.out.println("학생을 추가하지 못했습니다.");
				
			}
			
		break;
		
		case 2 :
			
			if (addScore(std)) {
				
				System.out.println("성적을 등록했습니다.");
				
			} else {
				
				System.out.println("성적 등록에 실패했습니다.");
				
			}
			
		break;
		
		case 3 :
			
			printStudentList(std);
			
			break;
			
		case 4 :
			
			System.out.println("프로그램 종료");
			
			break;
			
			
		default :
			
			System.out.println("잘못된 메뉴!!");
			
         }
			
		
	}
	
	private static void printStudentList(ArrayList<StudentVer4> std) {
		
		for(StudentVer4 temp : std) {
			
			System.out.println(temp);
			
			temp.printScore();
			
		}
		
	}

	private static boolean addScore(ArrayList<StudentVer4> std) {
		
		System.out.println("추가할 학생 정보 입력 ");
		
		StudentVer4 temp = scanStudentBaseInfo();
		
		int index = std.indexOf(temp);
		
		if(index == -1) {
			
			return false;
			
		}
		
		System.out.println("추가할 성적 정보 입력 ");

		return std.get(index).addScore(scanScore());
		
	}

	private static boolean addStudent(ArrayList<StudentVer4> std) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("추가할 학생 정보 입력 ");
		
		StudentVer4 temp = scanStudentBaseInfo();
		
		System.out.print("이름 : ");
		
		temp.setName(scan.next());
		
		int index = std.indexOf(temp);
		
		if(index == -1) {
			
			std.add(temp);
			
			return true;
			
		}
		
		return false;
	}

	private static ScoreVer4 scanScore() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("과목명 : ");
		
		String sub = scan.next();
		
		System.out.print("학기 : ");
		
		int dict = scan.nextInt();
		
		System.out.print("중간 : ");
		
		int middle = scan.nextInt();
		
		System.out.print("기말 : ");
		
		int fin = scan.nextInt();
		
		System.out.print("수행평가 : ");
		
		int perfor = scan.nextInt();
		
		return new ScoreVer4(sub, dict, middle, fin, perfor);
	}

	private static StudentVer4 scanStudentBaseInfo() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학년 : ");
		
		int grade = scan.nextInt();
		
		System.out.print("반 : ");
		
		int ban = scan.nextInt();
		
		System.out.print("번호 : ");
		
		int bunho = scan.nextInt();
		
		return new StudentVer4(grade, ban, bunho);
	}

	private static void printMenu() {
		
		System.out.println("------메뉴-----");
		
		System.out.println("1. 학생 정보 추가");
		
		System.out.println("2. 학생 성적 추가");
		
		System.out.println("3. 학생 정보 출력");
		
		System.out.println("4. 프로그램 종료");
		
		System.out.print("메뉴 선택 : ");
		
	}

}