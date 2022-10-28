package Day05;

import java.util.Scanner;

public class Random02 {

	public static void main(String[] args) {
		
		int min = 1;
		int max = 9;
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("맞출 수를 입력하세요 : ");
		
		int input = sc.nextInt();*/
		
		//int num = (int)(Math.random()*100+1);
		
		int num = (int)(Math.random()*100);
		
		System.out.println(num);
		
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			
			System.out.print("맞출 수를 입력하세요 : ");
			
			int input = sc.nextInt();
			
			if (input > num ) {
				
				System.out.println(input + "가 " +"정답 보다 크다.");
				count = count + 1;
				
			} else if (input < num) {
				
				System.out.println(input + "가 " + "정답 보다 작다.");
				
				count = count + 1;
				
			} else {
				
				count = count + 1;
				System.out.println(input + "가 " + "정답이다.");
				System.out.println("최종 입력 횟수 : " + count);
				break;
				
			}
			
			
		}
				
	}

}
