package Day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		sc.close();
		
		//int gogudan = 0;
		
		// 2줄로 구구단 만들기.
		/*for (int i = 1; i < 10; i++) {
			
			gogudan = 2 * i;
			System.out.println(2 + " * " + i + " = " + gogudan);
			
		}*/
		
		// 1줄로 구구단 만들기
		
		for (int i = 1; i < 10; i++) {
			
			System.out.println(num + " * " + i + " = " + (num*i));
			
		}

	}

}
