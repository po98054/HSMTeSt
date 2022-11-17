package Day19;

import java.util.Scanner;

public class Regex02 {
	
	public static void main(String[] args) {
		
		// 전화번호 정규 표현식을 작성하여 입력 받은 번호가 전화번호가 맞는지 출력하는 코드를 작성하세요.
		
		// 단 정규표현식 이용 : 
		
		String regex = "^010(-\\d{4}){2}$";
		
		System.out.print("전화번호를 입력하세요 : ");	
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		boolean res = java.util.regex.Pattern.matches(regex, str);
		
		System.out.println("----------------------------");
		
		if(res) {
			
			System.out.println(str + "는 전화번호가 맞습니다");
			
		} else {
			
			System.out.println(str + "는 전화번호가 아닙니다.");
			
		}
		
		sc.close();

	}
	
}