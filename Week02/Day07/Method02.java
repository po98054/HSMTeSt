package Day07;

import java.util.Scanner;

public class Method02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		sesu(num);
		
		sc.close();
		
	}
	
	public static void sesu(int num) {
		
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			
			if (num % i == 0) {
				
				count = count + 1;
				
			}
			
		} if (count == 2) {
			
			System.out.println(num + "는 소수 입니다.");
			
		} else {
			
			System.out.println(num + "는 소수가 아닙니다.");
			
		}
		
	}

}
