package Day05;

import java.util.Scanner;

public class Random03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		int num = 0;
		
		for(;;) {
			
			num = (int)(Math.random()*100);
			System.out.print("맞출 수를 입력하세요 : ");
			
			System.out.println(num);
			
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
			
				
			}System.out.print("더하시겠습니까? (Y/N) :");
			
			if (sc.next().charAt(0) == 'n') {
				
				break;
				
			}
			
			
		}
		sc.close();
				
	}

}
