package Day18;

import java.util.Scanner;

public class Regex01 {
	
	public static void main(String[] args) {
		
		String regex = "^...$";
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		boolean res = java.util.regex.Pattern.matches(regex, str);
		
		if(res) {
			
			System.out.println(str + "는 3글자로 되어있습니다.");
			
		} else {
			
			System.out.println(str + "는 3글자로 되어있지 않습니다.");
			
		}
		
		sc.close();
		
	}

}