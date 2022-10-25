package Day02;

import java.util.Scanner;

public class operator05 {

	public static void main(String[] args) {
		
		// 내가 한 경우
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println("당신이 입력받은 " + num + "는 " + result + "입니다.");
		
		// 강사님이 알려주신 경우
		
		System.out.print("정수를 입력하세요 : ");
		
		int num2 = sc.nextInt();
		
		sc.close();
		
		boolean isEven = num2 % 2 == 0;
		
		String result2 = isEven ? "짝수" : "홀수";
		
		System.out.println("당신이 입력받은 " + num2 + "는 " + result2 + "입니다.");

	}

}
