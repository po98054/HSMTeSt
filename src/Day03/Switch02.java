package Day03;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수와 문자를 입력하세요. : ");
		
		int num = sc.nextInt();
		char ch = sc.next().charAt(0);
		int num2 = sc.nextInt();
				
		sc.close();
		
		switch(ch) {
		
		case '+' :
			
				System.out.println(num + " " + ch + " " + num2 + " = " + (num+num2) + " 입니다.");
				break;
		
		case '-' :
				
				System.out.println(num + " " + ch + " " + num2 + " = " + (num-num2) + " 입니다.");
				break;
			
		case '*' :
			
				System.out.println(num + " " + ch + " " + num2 + " = " + (num*num2) + " 입니다.");
				break;
			
		case '/' :
	
				System.out.println(num + " " + ch + " " + num2 + " = " + ((double)num/(double)num2) + " 입니다.");
				break;
	
		case '%' :
	
				System.out.println(num + " " + ch + " " + num2 + " = " + (num%num2) + " 입니다.");
				break;
			
		default :
				
				System.out.println("당신은 연산자를 잘 못 입력했습니다.");
				break;
			
		}
		
	}

}
