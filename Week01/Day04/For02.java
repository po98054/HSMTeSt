package Day04;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			
			if (num % i == 0) {
				
				System.out.println(num + "의 약수는 " + i);
				
			}
			
		}

	}

}
