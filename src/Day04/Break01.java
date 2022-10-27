package Day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();

		sc.close();
		
		int i = 0;
		
		for (i = num-1; i >= 1; i--) {
			
			if (num % i == 0) {
				
				break;
				
			}
			
		} if (i == 1) {
			
			System.out.println(num + "은 소수 입니다.");
			
		} else {
			
			System.out.println(num + "은 소수가 아닙니다.");
			
		}

	}

}
