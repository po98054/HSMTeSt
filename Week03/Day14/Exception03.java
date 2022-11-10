package Day14;

import java.util.Scanner;

public class Exception03 {
	
	public static void main(String [] args) {
		
		System.out.println("-------  메뉴 ------- ");
		
		System.out.println(" 1. 플레이 ");
		
		System.out.println(" 2. 기록 확인 ");
		
		System.out.println(" 3. 종료 ");
		
		System.out.println("---------------------");
		
		int menu = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			
			System.out.print("원하는 메뉴를 입력하세요 : ");
			
			//menu = sc.nextInt();
			
			try {
				
				menu = sc.nextInt();
				
			} catch (Exception e) {
				
				//System.out.print("원하는 메뉴를 입력하세요 : ");
				
				sc.nextLine();
				
			}
			
		} while(menu != 3);
		
	}
	
}