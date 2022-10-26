package Day03;

import java.util.Scanner;

public class IF01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// 정수가 양의 정수 인지 0인지 음의 정수 인지 판단 후에 출력한다.
		
		if (num > 0) {
			
			System.out.println("입력한 " + num + "는 양수 입니다.");
			
		} else if (num == 0) {
			
			System.out.println("입력한 " + num + "는 0 입니다.");
			
		} else {
			
			System.out.println("입력한 " + num + "는 음수 입니다.");
			
		}
		
		// 정수가 짝수인지 홀수 인지 판단 후에 출력
		
		if (num % 2 == 0) {
			
			System.out.println("입력한 " + num + "는 짝수 입니다.");
			
		} else {
			
			System.out.println("입력한 " + num + "는 홀수 입니다.");
			
		}
		
		sc.close();

	}

}
