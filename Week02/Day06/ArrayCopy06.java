// 정답 소스임..
// 복습할 때는 내가 계속 고민하고 나올 때 까지 해보고 완성되면 완성 본과 정답 소스와 비교하기..

package Day06;

import java.util.Scanner;

public class ArrayCopy06 {

	public static void main(String[] args) {
		
		// 랜덤 6개 번호 생성
		
		int array[] = new int[6];
		
		int count = 0; 
		
		int min = 1;
		int max = 45;
		
		while(count < 6) {
			
			int random = (int)(Math.random()*(max-min+1)+min);
			
			boolean isDuplicated = false;
			
			for (int i = 0; i < count; i++) {
				
				if(array[i] == random) {
					
					isDuplicated = true;
					
				}
				
			} 
			
			if (isDuplicated) {
				
				continue;
				
			} 
			
				array[count] = random;
				count++;
				
		}
		
		System.out.print("로또 번호 확인 : ");
		System.out.println();
		
		for (int tmp : array) {
			
			System.out.println(tmp + " ");
			
		}
		
		// 보너스 번호를 랜덤으로 생성(위에서 생성한 번호와 중복 X)
		
		int bonus;
		
		while(true) {
			
			int random = (int)(Math.random()*(max-min+1)+min);
			
			boolean isDuplicated = false;
			
			for (int i = 0; i < array.length; i++) {
				
				if(array[i] == random) {
					
					isDuplicated = true;
					
				}
				
			} 
			
			if (isDuplicated) {
				
				continue;
				
			}
			
			bonus = random;
			break;
			
		}
		
		System.out.println("보너스 번호 입력 : " + bonus);
		
		// 당첨 번호 6개를 입력 받음
		
		Scanner sc = new Scanner(System.in);
		
		int array2[] = new int[6];
		
		System.out.print("당첨 번호 입력 : ");
		
		for(int i = 0; i < 6; i++) {
			
			array2[i] = sc.nextInt();
			
		}
		
		sc.close();
		
		// 일치하는 번호 개수를 구함(보너스 번호 제외)
		
		int sameCount = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array2.length; j++) {
				
				if (array[i] == array2[j]) {
					
					sameCount = sameCount + 1;
					
				}
				
			}
			
		}
		
		// 등수 판별
		
		switch (sameCount) {
		
		case 6:
			System.out.println("1등");
			break;
		case 5:
			
			boolean isDuplicated = false;
			
			for (int i = 0; i < array2.length; i++) {
				
				if(array2[i] == bonus) {
					
					isDuplicated = true;
					
				}
				
			}
			if (isDuplicated) {
				
				System.out.println("2등");
				
			}
			break;
		case 4:
			System.out.println("3등");
			break;
		case 3:
			System.out.println("4등");
			break;
		default:
			System.out.println("꽝!!!");
		
		}

	}

}
