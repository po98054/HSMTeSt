package Day03;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num > 0) {
			
			System.out.println("입력한 " + num + "는 양의 정수 입니다.");
			
		} else if (num == 0) {
			
			System.out.println("입력한 " + num + "는 0의 정수 입니다.");
			
		} else {
			
			System.out.println("입력한 " + num + "는 음의 정수 입니다.");
			
		}
		
		sc.close();

	}

}
