package Day03;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		
		int month = sc.nextInt();
		
		sc.close();
		
		switch (month) {
		
		case 1, 3, 5, 7, 8, 10, 12 :
			System.out.println(month + "월은 마지막 일이 31일 입니다.");
			break;
			
		case 4, 6, 9, 11 :
			System.out.println(month + "월은 마지막 일이 30일 입니다.");
			break;
			
		case 2 :
			System.out.println(month + "월은 마지막 일이  28일 입니다.");
			break;
			
		default :
			System.out.println(month + "월을 잘못 입력했습니다.");
			break;
		
		}

	}

}
