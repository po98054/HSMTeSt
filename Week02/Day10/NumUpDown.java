package Day10;

import java.util.Arrays;
import java.util.Scanner;

public class NumUpDown {
	
	private int [] com;
	
	private int [] user;
	
	private int num;
	
	private int input;
	
	private int count;
	
	/*public NumUpDown(int com) {
		
		
		
	}*/
	
	public void setUser(int [] user) {
		
		correctResult();
		
		this.user = Arrays.copyOf(user, user.length);
		
	}
	
	public void correctResult() {
		
		Scanner sc = new Scanner(System.in);
		
		for(int a = 0; a < user.length; a++) {
			
			num = (int)(Math.random()*100);
			
			System.out.println(num);
			
			count = 0;
			
			for(int i = 1; i <= num; i++) {
				
				System.out.print("맞출 수를 입력하세요 : ");
				
				input = sc.nextInt();
				
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
					
					user[a] = count;
					
					break;
					
				}
				
				
			}
			
			
		}
		
	}
	

}
