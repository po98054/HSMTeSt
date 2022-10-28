package Day05;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		
		int array[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			
			array[i] = 2*(i+1);
			
			System.out.println("array[" + i + "] = " + array[i]);
			
		}
		
		System.out.println("------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		int array2[] = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i < array2.length; i++) {
			
			System.out.print((i+1) + "번 학생의 국어 성적을 입력하세요 : ");
			
			array2[i] = sc.nextInt();
			
			sum = sum + array2[i];
			
			System.out.println((i+1) + "번 학생의 국어 성적 = " + array2[i]);
			
		}
		
		double avg = (double)sum / (double)array2.length;
		
		System.out.println("5명 학생의 국어 성적 평균 점수 : " + avg);
		
		sc.close();
		
	}
	
}