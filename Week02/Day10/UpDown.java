package Day10;

import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		
		int menu;
		
		do {
			
			printMenu();
			
			menu = selectMenu();
			
			playMenu(menu);
			
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
	
	public static int [] insertGame() {
		
	//	Scanner sc = new Scanner(System.in);
		
		int user[] = new int[3];
		
		/*System.out.print("맞출 수를 입력하세요 : ");
		
		int input = sc.nextInt();*/
		
		/*for(int i = 0; i < user.length; i++) {
			
			user[i] = sc.nextInt();
			
			System.out.println("array2[" + i + "] = " + user[i]);
				
		}*/
		
		return user;
		
	}
	
	public static void playMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			NumUpDown nup = new NumUpDown();
			
			int user[] = insertGame();
			
			//int com = (int)(Math.random()*100);
			
			nup.setUser(user);
			
		/*	nup.correctResult();*/
				
			break;
			
		case 3 :

			System.out.println("프로그램을 종료합니다.");
			
			break;
		
		}
		}
		
	}