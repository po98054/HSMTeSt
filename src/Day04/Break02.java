package Day04;

import java.util.Scanner;

public class Break02 {

	public static void main(String[] args) {
		
		// 두 정수의 최소 공배수를 구하는 법.
		
		// 1. 두 정수의 공배수 구하기.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		int i;
		
		for(i = num; i < (num*num2); i++) {
			
			if(num % i == 0 && num2 % i == 0) {
				
				break;
				
			}
			
		} System.out.println(i);
	}

}
