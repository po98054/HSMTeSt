package Day08;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		int array[] = new int[3];
		
		int array2[] = new int[3];
		
		int max = 9;
		
		int min = 1;
		
		Scanner sc = new Scanner(System.in);
		
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
				
		}
		
		System.out.println("--------------------");
		
		int stri = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == array2[i]) {
				
				stri = stri + 1;
				
			}
			
		}
		
		System.out.println(stri + " 스트라이크");
		
		System.out.println("--------------------");
		
		int ball = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array2.length; j++) {
				
				if(array[i] == array2[j]) {
					
					ball = ball + 1;
					
				}
			}
		}
		
		System.out.println(ball + "볼");
		
		System.out.println("--------------------");
		
		ball = ball - stri;
		
		System.out.println(ball + "볼");
		
		sc.close();

	}

}
