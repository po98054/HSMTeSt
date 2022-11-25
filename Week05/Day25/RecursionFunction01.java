package Day25;

import java.util.Scanner;

public class RecursionFunction01 {
	
	public static void main(String[] args) {
		
		//print(10);
		
		// 양의 정수 n!을 구하는 코드를 작성하세요
		
		// n! = 1 * 2 * 3 * .... * n;
		
		// n * (n-1)!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		System.out.println(num + "! 의 답은 : " + factorial(num));
		
	}
	
	public static void print(int num) {
		
		System.out.println(num);
		
		print(num);
		
	}
	
	public static long factorial (int num) {
		
		if(num < 0) {
			
			throw new RuntimeException("음수는 팩토리얼을 구할 수 없습니다.");
			
		}
		
		if (num == 1 || num == 0) {
			
			return 1;
			
		}
		
		return num * factorial(num - 1);
		
	}

}