package Day04;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		int gcd = 0;
		int i;
		
		// 1. 두 수의 약수가 나오는 함수.
		
		System.out.print(num + "의 약수 : ");
		for(i = 1; i <= num; i++) { 
			
			if(num % i == 0) { 
				
				System.out.print(i + " ");
				
			}
			
		}
		
		System.out.println();
		
		System.out.print(num2 + "의 약수 : ");
		for(i = 1; i <= num2; i++) { 
			
			if(num2 % i == 0) { 
				
				System.out.print(i + " ");
				
			}
			
		}
		
		System.out.println();
		
		// 2. 두 수의 공약수를 구하는 함수
		
		System.out.print(num + " 와 " + num2 + "의 공약수 : ");
		
		for(i = 1; i <= num2; i++) { 
			
			if(num % i == 0 && num2 % i == 0) { 
				
				System.out.print(i + " ");
				
			}
			
		}
		
		System.out.println();
		
		// 3. 두 수의 최대공약수를 구하는 함수
		
		for(i = 1; i <= num2; i++) { 
			
			if(num % i == 0 && num2 % i == 0) { 
				
				gcd = i; 
				
			}
			
		}
		
		System.out.println(num + " 와 " + num2 + "의 최대 공약수 : " + gcd);
		
	}
	
}