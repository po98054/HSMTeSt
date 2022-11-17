package Day19;

import java.util.Scanner;

public class Regex01 {
	
	public static void main(String[] args) {
		
		// 이메일 주소를 입력 받아 이메일 형식이 맞는지 확인하는 코드를 작성하세요.
		
		// 단 정규표현식 이용 : ex) avc123@naver.com => abc123@xxx.or.kr
		
		String regex = "^[a-z0-9]+@[a-z]+(\\.[a-zA-Z]+){1,2}$";
		
		System.out.print("이메일 주소를 입력하세요 : ");	
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		boolean res = java.util.regex.Pattern.matches(regex, str);
		
		System.out.println("----------------------------");
		
		if(res) {
			
			System.out.println(str + "는 이메일 형식이 맞습니다");
			
		} else {
			
			System.out.println(str + "는 이메일 형식이 아닙니다.");
			
		}
		
		sc.close();
		
	}

}