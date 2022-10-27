package Day03;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch;
		
		System.out.print("문자를 입력하세요 : ");
		
		ch = sc.next().charAt(1);
		
		System.out.println("입력 받은 문자는 " + ch + "입니다.");
		
		sc.close();

	}

}
