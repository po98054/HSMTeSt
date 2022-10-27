package Day04;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();

		sc.close();
		
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			
			if (num % i == 0) {
				
				count = count + 1;
				
			}
			
		} if (count == 2) {
			
			System.out.println(num + "은 소수 입니다.");
			
		} else {
			
			System.out.println(num + "은 소수가 아닙니다.");
			
		}

	}

}
