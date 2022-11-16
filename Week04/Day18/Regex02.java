package Day18;

import java.util.Scanner;

public class Regex02 {
	
	public static void main(String[] args) {
		
		String regex = "^[a-z0-9_-]{5,20}$";
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		boolean res = java.util.regex.Pattern.matches(regex, str);
		
		if(res) {
			
			System.out.println(str + "는 올바른 정규식입니다.");
			
		} else {
			
			System.out.println(str + "는 정규식에 맞지 않습니다.");
			
		}
		
		sc.close();
		
	}

}