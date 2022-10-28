package Day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[4];
		
		int size = 4;
		
		System.out.print("4자리 정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		for (int i = size-1; i <= 0; i--) {
			
			array[i] = num % 10;
			num = num / 10;
			
		}
		
		for (int i : array) {
			
			System.out.println(i);
			
		}
		
		sc.close();
		
	}

}
