package Day14;

import java.util.Scanner;

public class Exception02 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 숫자 : ");
		
		int num = sc.nextInt();
		
		System.out.println("내가 입력한 숫자는 " + num + "입니다.");
		
		System.out.println("--------------------------------------");
		
		try {
			
			num = sc.nextInt();
			
		} catch(Exception e) {
			
			System.out.println("정수를 입력해야 하는데 문자를 입력하셨습니다.");
			
		}
		
	}

}