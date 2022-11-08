package Day12;

import java.util.Scanner;

import Day09.highstudent;

public class StudentManager {
	
	public static void main(String[] args) {
		
		// 학생 성적 관리 프로그램을 작성하세요.
		// 작성하기 위해 필요한 작업들을 주석으로 정리해 보세요.
		
		// 1. 메소드 : 학생 성적 추가, 학생 정보 추가, 프로그램 종료, 학생 정보 출력
		// 2. 변수 : 학년, 반, 번호, 각 과목 성적, 총합, 평균, (필요하면 등수, 등급)
		
		// 단계
		// 1단계 : 학생 정보 추가 => 각 학생의 정보를 입력한다. => 이미 동일한 학생이 있으면 추가 금지.
		// 2단계 : 학생 성적 추가 => 입력한 각 학생의 성적을 추가 한다. => 성적 추가시 과목명, 학기, 중간, 기말, 수행 평가를 입력하여 추가한다.
		// => 이미 추가된 과목 (학기랑 과목명이 같으면)이면 추가하지 않음.
		// 4단계 : 학생 정보 출력 => 입력한 각 학생의 성적을 보여준다.
		
		// 정보를 효율적으로 관리하기 위해 클래스를 만들것인가? 만든다면 어떤 클래스를 만들건지?
		// => 학생 클래스(HighStudent), 과목 클래스(Subject 클래스)
		
		// 프로그램 실행 과정을 주석으로 작성
		
		int menu;
		
		Highstudent Student[] = new Highstudent[30];
		
		int count = 0;
		
		do {
			
			printMenu();
			
			menu = selectMenu();
			
			count = playMenu(menu, Student, count);
			
			
		} while(menu != 4);
			
	
	}
	
	public static void printMenu() {
		
		System.out.println("=============== 메뉴 ===========");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 성적 추가");
		System.out.println("3. 학생 정보 출력");
		System.out.println("4. 프로그램 종료");
		System.out.println("====================");
		System.out.println("메뉴를 선택하세요.");
		
	}
	
	public static int selectMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 메뉴를 입력하세요 : ");
		
		int menu = sc.nextInt();

		return menu;
		
	}
	
	public static int playMenu(int menu, Highstudent [] std, int count) {
		
		int grade, ban, bunho;
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		switch(menu) {
		
		case 1 :
			
			System.out.print("학생 정보를 입력하세요 (학년, 반, 번호, 이름순) : ");
			
			grade = sc.nextInt();
			
			ban = sc.nextInt();
			
			bunho = sc.nextInt();
			
			name = sc.next();
			
			std[count] = new Highstudent(grade, ban, bunho, name);
			
			count++;
			
			std[0].print();
			
			break;
			
		case 2 :
			
			System.out.println("성적 입력 (국어, 영어, 수학 순) : ");
			
			int kor = sc.nextInt();
			
			int eng = sc.nextInt();
			
			int math = sc.nextInt();
			
		case 3 :
			
				break;
			
		case 4 :
			
			System.out.println("프로그램을 종료합니다.");
			
			break;
		
			
		}
		
		return count;
		
	}

}

class Highstudent {
	
	private int grade, ban, bunho;
	
	private String name;
	
	public Highstudent(int grade, int ban, int bunho, String name) {
		
		this.grade = grade;
		
		this.ban = ban;
		
		this.bunho = bunho;
		
		this.name = name;
		
	}
	
	public void print() {
		
		System.out.println("당신의 학년 : " + grade + " 당신의 반 : " + ban + " 당신의 번호 : " + bunho + " 당신의 이름 : " + name);
		//System.out.println("당신의 국어 성적 : " + kor + " 당신의 영어 성적 : " + eng + " 당신의 수학 성적 : " + math);
		
	}

}

class Subject {
	
	// 과목명, 학기, 중간, 기말, 수행 평가
	
	private String subject;
	
	private int term, mid, fin, perf;
	
}