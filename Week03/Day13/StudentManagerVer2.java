package Day13;

import java.util.Scanner;

public class StudentManagerVer2 {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Student std[] = new Student[30];
		
		int count = 0;
		
		int menu = -1;
		
		//반복
		
		for( ;menu != 4 ; ) {
			
			// 메뉴 출력
			
			printMenu();
			
			// 메뉴 선택
			
			menu = scan.nextInt();
			
			// 선택한 메뉴에 따른 기능 실행
			
			count = runMenu(menu, std, count);
		
	}
		
}

	private static int runMenu(int menu, Student [] std, int count) {
		
		Scanner scan = new Scanner(System.in);

		switch(menu) {
		
		case 1 :
			
			if(addStudent(std, count)) {
				
				System.out.println("학생을 추가했습니다.");
				
				count = count + 1;
				
			} else {
				
				System.out.println("학생을 추가하지 못했습니다.");
				
			}
			
		break;
		
		case 2 :
			
			if (addScore(std, count)) {
				
				System.out.println("성적을 등록했습니다.");
				
			} else {
				
				System.out.println("성적 등록에 실패했습니다.");
				
			}
			
		break;
		
		case 3 :
			
			printStudentList(std, count);
			
			break;
			
		case 4 :
			
			System.out.println("프로그램 종료");
			
			break;
			
			
		default :
			
			System.out.println("잘못된 메뉴!!");
			
         }
			
		return count;
		
	}
	
	private static void printStudentList(Student[] std, int count) {
		
		for(int i = 0; i < count; i++) {
			
			System.out.println(std[i]);
			
			std[i].printScore();
			
		}
		
	}

	private static boolean addScore(Student[] std, int count) {
		
		System.out.println("추가할 학생 정보 입력 ");
		
		Student temp = scanStudentBaseInfo();
		
		int index = indexOfStudent(std, count, temp);
		
		if(index == -1) {
			
			return false;
			
		}
		
		System.out.println("추가할 성적 정보 입력 ");

		return std[index].addScore(scanScore());
		
	}

	private static boolean addStudent(Student[] std, int count) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("추가할 학생 정보 입력 ");
		
		Student temp = scanStudentBaseInfo();
		
		System.out.print("이름 : ");
		
		temp.setName(scan.next());
		
		int index = indexOfStudent(std, count, temp);
		
		if(index == -1 && count < std.length) {
			
			std[count] = temp;
			
			return true;
			
		}
		
		return false;
	}

	private static Score scanScore() {
		
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
		
		return new Score(sub, dict, middle, fin, perfor);
	}

	private static Student scanStudentBaseInfo() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학년 : ");
		
		int grade = scan.nextInt();
		
		System.out.print("반 : ");
		
		int ban = scan.nextInt();
		
		System.out.print("번호 : ");
		
		int bunho = scan.nextInt();
		
		return new Student(grade, ban, bunho);
	}

	private static int indexOfStudent(Student[] std, int count, Student temp) {
		
		for(int i = 0; i < count; i++) {
			
			if(std[i].equals(temp)) {
				
				return i;
				
			} 
			
		}
		
		return -1;
		
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