package Day03;

import java.util.Scanner;

public class IF05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch;
		ch = sc.next().charAt(0);
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		/*int sum = num + num2;
		int min = num - num2;
		int mul = num * num2;
		float div = (float) num / (float) num2;
		int nam = num % num2;*/
		
		// 첫 번째 경우
		
		if (ch == '+') {
			
			System.out.println("산술연산자 입니다.");
			System.out.println("두 수의 합은 " + (num + num2) + "입니다.");
			
		} else if (ch == '-') {
			
			System.out.println("산술연산자 입니다.");
			System.out.println("두 수의 차는 " + (num - num2) + "입니다.");
			
		} else if (ch == '*') {
			
			System.out.println("산술연산자 입니다.");
			System.out.println("두 수의 곱은" + (num * num2) + "입니다.");
			
		} else if (ch == '/') {
			
			System.out.println("산술연산자 입니다.");
			System.out.println("두 수의 나눗셈은" + ((double)num / (double)num2) + "입니다.");
			
		} else if (ch == '%') {
			
			System.out.println("산술연산자 입니다.");
			System.out.println("두 수의 나머지는" + (num % num2) + "입니다.");
			
		} else {
			
			System.out.println("산술연산자가 아닙니다.");
			
		}
		
		// 두번째 경우
		
		if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
			
			System.out.println("산술연산자 입니다.");
			
		} else {
			
			System.out.println("산술연산자가 아닙니다.");
			
		}
		
		sc.close();
		
	}

}
