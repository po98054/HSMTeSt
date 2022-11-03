package Day08;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		int max = 9;
		
		int min = 1;
		
		int size = 3;
		
		int array[] = new int[size];
		
		int array2[] = new int[3];
		
		for(int i = 0; i < array.length;i++) {
			
			int r = random(min, max);
			
			if(!contains(array, r)) {
				
				array[i] = r;
				
			}
			
			System.out.println("array[" + i + "] = " + array[i]);
			
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자 3개를 입력하세요 ");
		
		System.out.println();
		
		for(int i = 0; i < array2.length; i++) {
			
			array2[i] = sc.nextInt();
			
			System.out.println("array2[" + i + "] = " + array2[i]);
				
		}
		
		System.out.println("--------------------");
		
		int strike = strikiArray(array, array2);
		
    	//System.out.println(strike + "스트라이크");
			
		baseball(array, array2);
		
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자 3개를 입력하세요 ");
		
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int)(Math.random()*(max - min + 1) + min);
			
			System.out.println("array[" + i + "] = " + array[i]);
				
		}
		
		System.out.println("--------------------------------------");
		
		for(int i = 0; i < array2.length; i++) {
			
			array2[i] = sc.nextInt();
			
			System.out.println("array2[" + i + "] = " + array2[i]);
				
		}*/
		
		
		
	}
	
		public static int random(int min, int max) {
			
			if(min > max) {
				
				int tmp = min;
				
				min = max;
				
				max = tmp;
				
			}
			
			return (int)(Math.random()*(max - min + 1) + min);
			
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
					
					if(array[i] == array2[j]) {
						
						ball = ball + 1;
						
					}
				
				}
				
				//System.out.println(stri + "스트라이크");
				
				
				
			//	System.out.println(ball + "볼");
				
			}
			
			if (stri == 3 || ball == 3) {
				
				System.out.println("정답입니다.");
				
			} else {
				
				System.out.println(stri + "스트라이크");
				
			}
			
			//System.out.println(stri + "스트라이크");
			
			//System.out.println(ball + "볼");
			
			System.out.println("--------------------");
			
			ball = ball - stri;
			
			
			
		//	System.out.println("최종 결과 : " + stri + " 스트라이크" + ball + " 볼");
			
		}

}
