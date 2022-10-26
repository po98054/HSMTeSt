package Day03;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		sc.close();
		
		switch(ch) {
		
		case '+' , '-', '*', '/', '%' :
			System.out.println("연산자 기호 입니다.");
			break;
		
		default : 
			System.out.println("연산자 기호가 아닙니다.");
			break;
		
		}

	}

}
