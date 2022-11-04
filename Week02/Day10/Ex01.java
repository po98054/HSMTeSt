package Day10;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int user[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		/*int num = (int)(Math.random()*100);
		
		System.out.println(num);*/
		
		//int count = 0;
		
		for(int a = 0; a < user.length; a++) {
			
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
					
					user[a] = count;
					
					break;
					
				}
				
				
			}
			
			
		}
		
		for(int i = 0; i < user.length; i++) {
			
			System.out.println("user[" + i + "] = " + user[i]);
			
		}
		
		System.out.println("*************************");
		
		for(int i = 0; i < user.length; i++) {
			
			for(int j = 1; j < user.length; j++)
				
				if(user[i] > user[j]) {
					
					int temp;
					
					temp = user[i];
					
					user[i] = user[j];
					
					user[j] = temp;
					
				}
			
		}
		
	for(int i = 0; i < user.length; i++) {
			
			System.out.println("user[" + i + "] = " + user[i]);
			
		}
		
		sc.close();
				
	}

}
