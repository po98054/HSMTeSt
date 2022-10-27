package Day03;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		switch (num % 2) {
		
		case 0 :
			
			System.out.println("당신이 입력한 " + num + "는 짝수 입니다.");
			break;
		
		case 1 :
			
			System.out.println("당신이 입력한 " + num + "는 홀수 입니다.");
			break;
			
		}

	}

}
