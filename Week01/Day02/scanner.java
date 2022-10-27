package Day02;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int num = sc.nextInt();
		
		System.out.println("입력 받은 정수 : " + num);
		
		System.out.println("실수를 입력하세요");
		
		float num2 = sc.nextFloat();
		
		System.out.println("입력 받은 실수 : " + num2);
		
		System.out.println("정수A와 정수B를 입력하세요 : ");
		
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		System.out.println("입력 받은 두 정수 : " + num3 + " " + num4);
		
		sc.close();

	}

}
