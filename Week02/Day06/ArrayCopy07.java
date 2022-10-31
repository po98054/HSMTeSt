package Day06;

import java.util.Scanner;

public class ArrayCopy07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random()*100);
		
		//System.out.println(num);
		
		int count = 0;
		
		int array[] = new int[3];
		
		for(int j = 0; j < array.length; j++) {
			
			for(int i = 1; i <= num; i++) {
				
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
					break;
					
				}
				
				if (count == 3) {
					
					array[j] = input;
					System.out.println(array[j]);
					
				}
			
		}
				
	}

}
	
}
