package Day25;

import java.util.ArrayList;

import java.util.Scanner;

public class ForAndIf03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		int size = 5;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("------------------------------------------------");
		
		System.out.println("일반 For문으로 배열을 출력하는 방식입니다.");
		
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i < size; i++) {
			
			System.out.print("원하는 정수를 입력하세요 : ");
			
			num = sc.nextInt();
			
			if(num % 2 != 0) {
				
				list.add(num);
				
			} else if(num % 2 == 0) {
				
				list.add(-num);
				
			}
			
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.println(list);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("향상된 For문을 통한 배열을 출력합니다.");
		
		System.out.println("------------------------------------------------");
		
		for(int num2 : list) {
			
			System.out.println("num2에 저장된 배열의 값은 " + num2 + "입니다.");
			
		}
		
	}
	
}