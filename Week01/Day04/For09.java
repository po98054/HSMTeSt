package Day04;

import java.util.Scanner;

public class For09 {

	public static void main(String[] args) {
		
		//for문을 이용하여 종료 문자인 Q가 입력될 때 까지 동작하는 코드
		
		Scanner sc = new Scanner(System.in);
		
		char ch = 'a';
		
		
		
		for(;ch != 'q';) {
			
			ch = sc.next().charAt(0);
			
		}
		
		sc.close();

	}

}
