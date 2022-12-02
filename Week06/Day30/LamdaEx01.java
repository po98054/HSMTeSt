package Day30;

import java.util.function.Consumer;

public class LamdaEx01 {
	
	static String filedStr = "필드";
	
	public static void main(String[] args) {
		
		String str = "main 지역 변수";
		
		Consumer<Object> con = o -> {
			
			LamdaEx01.filedStr = "람다식에서 변경"; 
			
			System.out.println(str);
			
			//str += ""; // 람다식에서 지역 변수는 final이 자동으로 붙기에 에러가 발생 (읽을 수는 있으나 변경은 불가능)
			
		};
		
		con.accept("");
		
		System.out.println(filedStr);
		
	}

}