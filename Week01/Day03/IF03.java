package Day03;

import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {

		// 정수 가 3의 배수이면 3의 배수 아니면 3의 배수가 아님.
		// 3의 배수는 정수를 3으로 나누었을때 나머지가 0이면 3의 배수이다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num % 3 == 0) {
			
			System.out.println("입력한 " + num + "는 3의 배수 입니다.");
			
		} else {
			
			System.out.println("입력한 " + num + "는 3의 배수가 아닙니다.");
			
		}
		
		sc.close();
		
	}

}
