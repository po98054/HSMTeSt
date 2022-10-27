package Day03;

import java.util.Scanner;

public class IF06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 문자를 입력하세요 : ");
		
		int num = sc.nextInt();
		char ch = sc.next().charAt(0);
		int num2 = sc.nextInt();

		// 첫 번째 경우
		
		if (ch == '+') {
			
			System.out.println("입력 받은 문자는 산술연산자 입니다.");
			System.out.println(num + " " + ch + " " + num2 + " = " + (num + num2) + " 입니다.");
			
		} else if (ch == '-') {
			
			System.out.println("입력 받은 문자는 산술연산자 입니다.");
			System.out.println(num + " " + ch + " " + num2 + " = "  + (num - num2) + " 입니다.");
			
		} else if (ch == '*') {
			
			System.out.println("입력 받은 문자는 산술연산자 입니다.");
			System.out.println(num + " " + ch + " " + num2 + " = "  + (num * num2) + " 입니다.");
			
		} else if (ch == '/') {
			
			System.out.println("입력 받은 문자는 산술연산자 입니다.");
			System.out.println(num + " " + ch + " " + num2 + " = "  + ((double)num / (double)num2) + " 입니다.");
			
		} else if (ch == '%') {
			
			System.out.println("입력 받은 문자는 산술연산자 입니다.");
			System.out.println(num + " " + ch + " " + num2 + " = "  + (num % num2) + " 입니다.");
			
		} else {
			
			System.out.println("입력 받은 문자는 산술연산자가 아닙니다.");
			
		}
		
		sc.close();
	}
}