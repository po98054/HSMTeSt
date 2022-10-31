package Day06;

import java.util.Scanner;

public class ArrayCopy07 {

	public static void main(String[] args) {
		
		// Up Down 게임을 3회 반복해서 플레이 하고,
		// 각 게임당 맞춘 횟수를 배열에 저장하여 출력하는 코드를 작성하세요.
		
		int coin = 3;
		
		int array[] = new int[coin];
		
		Scanner sc = new Scanner(System.in);
		
		while(coin-- > 0) {
			
			int input = (int) (Math.random()*100);
			
			System.out.println(input);
			
			System.out.println("1 ~ 100 사이의 랜덤한 수를 맞추세요 !!");
			
			int num;
			
			int count = 0;
			
			do {
				count++;
				System.out.print("숫자 입력 : ");
				num = sc.nextInt();
				if (input > num ) {
					
					System.out.println(input + "가 " +"정답 보다 크다.");
					
				} else if (input < num) {
					
					System.out.println(input + "가 " + "정답 보다 작다.");
					
				} else {
					
					System.out.println(input + "가 " + "정답이다.");
					System.out.println("최종 입력 횟수 : " + count);
					array[array.length - coin - 1] = count;
					
				}
				
			} while (input != num);
			
		}
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("array[" + i + "] = " + array[i]);
			
		}
		
		sc.close();
		

	}
	
}