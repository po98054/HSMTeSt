package Day08;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		int max = 9;
		
		int min = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자 3개를 입력하세요 ");
		System.out.println();
		
		int array[] = new int[3];
		
		int array2[] = new int[3];
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int)(Math.random()*(max - min + 1) + min);
			
			System.out.println("array[" + i + "] = " + array[i]);
				
		}
		
		System.out.println("--------------------------------------");
		
		for(int i = 0; i < array2.length; i++) {
			
			array2[i] = sc.nextInt();
			
			System.out.println("array2[" + i + "] = " + array2[i]);
				
		}
		
		System.out.println("--------------------");
		
		int stri = strikiArray(array, array2);
		
		System.out.println(stri + " 스트라이크");
		
		baseball(array, array2);
		
		sc.close();
		
	}
	
	public static int strikiArray(int array[], int array2[]) {
		
		int stri = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == array2[i]) {
				
				stri = stri + 1;
				
			}
			
		}
		
		return stri;
		
	}
	
	public static void baseball(int array[], int array2[]) {
		
		int ball = 0;
		int stri = strikiArray(array, array2);
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array2.length; j++) {
				
				if(array[i] == array2[i]) {
					
					stri = stri + 1;
					
					continue;
					
				}else if(array[i] == array2[j]) {
					
					ball = ball + 1;
					
					//System.out.println(ball + "볼 입니다.");
					
					//continue;
				}
			}
			
			System.out.println(ball);
			
			//ball = ball - stri;
			
			System.out.println("최종 결과 = " + stri + "스트라이크 " + ball + "볼");
				
			}
		
	}
	
	public static boolean contains(int []array, int num) {
		
		if(array == null || array.length == 0) {
			
			return false;
			
		}
		
		for(int tmp : array) {
			
			if(num == tmp) {
				
				return true;
				
			}
			
		}
		
		return false;
	}

}