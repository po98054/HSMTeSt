package Day09;

import java.util.Scanner;

/* 숫자 야구게임을 플레이 한 후, 기록을 저장하는 프로그램을 작성하세요.
 * 메뉴
 * 1. 플레이
 * 2. 기록확인
 * 3. 종료
 * 메뉴 선택 : 2
 * 1. 홍길동 2회
 * 2. 임꺽정 3회
 * 3. 이몽룡 3회
 * 등등
 * */

public class NumBaseball {

	public static void main(String[] args) {
		
		int menu;
		
		//int count = 0;
		
		do {
			
			printMenu();
			
			menu = selectMenu();
			
			//count = playMenu(menu, Student, count);
			
		} while(menu != 3);
		
	}
	
	public static void printMenu() {
		
		System.out.println("=============== 메뉴 ===========");
		System.out.println("1. 플레이");
		System.out.println("2. 기록 확인");
		System.out.println("3. 프로그램 종료");
		System.out.println("====================");
		System.out.println("메뉴를 선택하세요.");
		
	}
	
	public static int selectMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 메뉴를 입력하세요 : ");
		
		int menu = sc.nextInt();

		return menu;
		
	}
	
	public static int playMenu(int menu, highstudent [] Student, int count) {
		
		Scanner sc = new Scanner(System.in);
		
		switch(menu) {
		
		case 1 :
			
			break;
			
		case 2 :
			
			for(int i = 0; i < count; i++) {
				
				Student[i].print();
				
			}

			break;

		case 3 :

			System.out.println("프로그램을 종료합니다.");
			
			break;
		
		}
		
		return count;
		
	}

}
