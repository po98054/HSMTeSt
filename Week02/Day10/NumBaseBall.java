package Day10;

import java.util.Scanner;

public class NumBaseBall {
	
	public static void main(String[] args) {
		
		int menu;
		
		int size = 3;
		
		int min = 1;
		
		int max = 9;
		
		//int count = 0;
		
		do {
			
			printMenu();
			
			menu = selectMenu();
			
			playMenu(menu);
			
		} while(menu != 3);
		
	}
	
	public static int [] createRandomArray(int size, int min, int max) {
		
		if(max - min + 1 <= size) {
			
			return null;
			
		}
		
		int array[] = new int[size];
		
		for(int i = 0; i < array.length;) {
			
			int r = random(min, max);
			
			if(!contains(array, r)) {
				
				array[i] = r;
				i++;
				
			}
			
		}
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("array[" + i + "] = " + array[i]);
				
		}
		
		return array;
	}
		
	public static int random(int min, int max) {
		
		if(min > max) {
			
			int tmp = min;
			
			min = max;
			
			max = tmp;
			
		}
		
		return (int)(Math.random()*(max - min + 1) + min);
		
	}
	
	public static boolean contains(int []array, int num) {
		
		if(array == null || array.length == 0) {
			
			return false;
			
		}
		
		for(int tmp : array) {
			
			if(num == tmp) {
				
				return true;
				
			}
			
		}
		
		return false;
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
		
		Scanner sc = new Scanner(System.in);
		
		int user[] = new int[3];
		
		System.out.print("원하는 숫자 3개를 입력하세요 ");
		
		System.out.println();
		
		for(int i = 0; i < user.length; i++) {
			
			user[i] = sc.nextInt();
			
			System.out.println("array2[" + i + "] = " + user[i]);
				
		}
		
		return user;
		
	}
	
	public static void playMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			int com[] = createRandomArray(3, 1, 9);
			
			//int rank = 0;
			
			//int user[] = insertGame(3);
			
			PlayerInfo p = new PlayerInfo(com);
			
			int rec;
			
			do {
				
				int user[] = insertGame();
				
				p.setUser(user);
				
				rec = p.getCount();
				
				System.out.println(p.getCount());
				
				p.printResult();
				
			} while(p.getStrike() != 3);
			
			int record[] = new int[3];
			
			for(int i = 0; i < record.length; i++) {
				
				record[i] = rec;
				
				break;
				
				//rank = record[i];
				
			}
			
			for(int i = 0; i < record.length; i++) {
				
				System.out.println("record[" + i + "] = " + record[i]);
				
			}
			
		//	rec = 0;
			
			break;
			
		case 2 :
			
		/*	for(int i = 0; i < count; i++) {
				
				//Student[i].print();
				
			}

			break;*/

		case 3 :

			System.out.println("프로그램을 종료합니다.");
			
			break;
		
		}
		
		//return count;
		
	}
	
	/*public static void rank() {
		
		for(int i = 0; i < user.length; i++) {
			
			System.out.println("user[" + i + "] = " + user[i]);
			
		}
		
		System.out.println("*************************");
		
		for(int i = 0; i < user.length; i++) {
			
			for(int j = 1; j < user.length; j++)
				
				if(user[i] > user[j]) {
					
					int temp;
					
					temp = user[i];
					
					user[i] = user[j];
					
					user[j] = temp;
					
				}
			
		}
		
	for(int i = 0; i < user.length; i++) {
			
			System.out.println("user[" + i + "] = " + user[i]);
			
		}
		
	}*/
	
}