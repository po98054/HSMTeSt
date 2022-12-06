package Day32;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
	
	public static void main(String[] args) {
		
		String str = "abc, def, ghi";
		
		String [] array = new String[3];
		
		array = str.split(",."); // 정규 표현식으로 적용 ,와 문자 하나(.)를 구분자로 본다.
		
		for(String temp : array) {
			
			System.out.println("temp의 정보는 " + temp + "입니다.");
			
		}
		
		System.out.println("-------------------------------");
		
		StringTokenizer st = new StringTokenizer(str, ".,");
		
		System.out.println("개수 : " + st.countTokens());
		
		System.out.println("-------------------------------");
		
		while(st.hasMoreTokens()) {
			
			String tmep = st.nextToken();
			
			System.out.println("tmep의 정보는 " + tmep + "입니다.");
			
		}
		
		System.out.println("-------------------------------");
		
		st = new StringTokenizer(str, "," , true);
		
		System.out.println("개수 : " + st.countTokens());
		
		System.out.println("-------------------------------");
		
		while(st.hasMoreTokens()) {
			
			String tmep = st.nextToken();
			
			System.out.println("tmep의 정보는 " + tmep + "입니다.");
			
		}
		
	}

}