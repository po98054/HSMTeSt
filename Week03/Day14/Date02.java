package Day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date02 {
	
	public static void main(String [] args) throws ParseException{
		
		Date date = new Date();
		
		System.out.println(date);
		
		// 원하는 패턴의 시간형태로 문자열로 변환
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String dateStr = sdf.format(date);
		
		System.out.println(dateStr);
		
		// 문자열을 Date로 변환
		
		String str = "2022년 11월 12일 00시 00분 00초";
		
		Date date2 = sdf.parse(str);
		
		System.out.println(date2);
		
	}

}