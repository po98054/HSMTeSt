package Day25;

import java.util.Scanner;

public class ForAndIf01 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < args.length; i++) {
			
			System.out.println("args[" + i + "] = " + args[i]);
			
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		int min = 0;
		
		if(num >= 0) {
			
			System.out.println("입력한 " + num + "는 양의 정수 입니다.");
			
			for(int i = 0; i <= num; i++) {
				
				sum = sum + i;
				
		    }
			
			System.out.println("--------------------------------------------");
			
			System.out.println("0 부터 " + num + "까지의 합계는 " + sum + "입니다.");
			
			
		} else if(num < 0) {
			
			System.out.println("입력한 " + num + "는 음의 정수 입니다.");
			
			for(int i = 0; i >= num; i--) {
				
				min = min - i; 
				
			}
			
			System.out.println("--------------------------------------------");
			
			System.out.println("0 부터 " + num + "까지의 차는 " + (min * -1) + "입니다.");
			
		}
			
	}
		
}