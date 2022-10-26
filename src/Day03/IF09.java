package Day03;

import java.util.Scanner;

public class IF09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		if (num % 2 == 0) {
			
			if (num % 3 == 0) {
				
				System.out.println("당신이 입력한 " + num + " 는 6의 배수입니다. ");
				
			} else {
				
				System.out.println("당신이 입력한 " + num + " 는 2의 배수 입니다. ");
				
			}
			
		} else if (num % 3 == 0) {
			
				System.out.println("당신이 입력한 " + num + " 는 3의 배수 입니다. ");
				
		}
		

	}

}
