package Day03;

import java.util.Scanner;

public class IF04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
	/*	if (num  % 2 == 0 && num % 3 != 0) {
			
			System.out.println("입력한 " + num + "는 2의 배수 입니다.");
			
		} else if (num % 3 == 0 && num % 2 != 0) {
			
			System.out.println("입력한 " + num + "는 3의 배수 입니다.");
			
		} else if (num % 6 == 0) {
			
			System.out.println("입력한 " + num + "는 6의 배수 입니다.");
			
		} else {
			
			System.out.println("입력한 " + num + "는 2 & 3 & 6의 배수가 아닙니다.");
			
		}*/
		
		if (num  % 6 == 0) {
			
			System.out.println("입력한 " + num + "는 6의 배수 입니다.");
			
		} else if (num % 3 == 0) {
			
			System.out.println("입력한 " + num + "는 3의 배수 입니다.");
			
		} else if (num % 2 == 0) {
			
			System.out.println("입력한 " + num + "는 2의 배수 입니다.");
			
		} else {
			
			System.out.println("입력한 " + num + "는 2 & 3 & 6의 배수가 아닙니다.");
			
		}
		
		sc.close();

	}

}
