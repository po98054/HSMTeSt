package Day32;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

public class StringEx01 {
	
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String date2 = sdf.format(date);
		
		System.out.println(date2);
		
		String date3 = "2022-12-06";
		
		Date date4 = sdf.parse(date3);
		
		System.out.println(date3);
		
		System.out.println(date4);
		
		String str = "김종국은 런닝맨에서 최강자 포지션을 찾고 있다.";
		
		System.out.println("str에서 런의 위치는 어디 인가 ? " + str.indexOf("런"));
		
		System.out.println("str에서 5 ~ 8번째 위치의 문자를 추출 하라 ? " + str.substring(5, 9));
		
		System.out.println("str에서 닝은 포함되어 있는가 ? " + str.contains("닝"));
		
		System.out.println("str에서 2번째 위치에 있는 문자는 무엇인가 ? " + str.charAt(2));
		
		System.out.println("str에서 런닝맨이 있는가 ? " + str.indexOf("런"));
		
		int num = 3;
		
		int num2 = 4;
		
		System.out.println(num + "과 " + num2 + "중 에서 큰 값은 " + Math.max(num, num2) + "입니다.");
		
		System.out.println(num + "과 " + num2 + "중 에서 작은 값은 " + Math.min(num, num2) + "입니다.");
		
		int num3 = -25;
		
		System.out.println(num3 + "의 절대 값은 " + Math.abs(num3));
		
		double num4 = 3.1;
		
		double num5 = 3.7;
		
		System.out.println(num4 + "의 반올림은 " + Math.round(num4) + "입니다.");
		
		System.out.println(num5 + "의 버림은 " + Math.floor(num5) + "입니다.");
		
		System.out.println(num4 + "의 올림은 " + Math.ceil(num4) + "입니다.");
		
		int num6 = 9;
		
		int num7 = 3;
		
		System.out.println(num6 + "의 " + num7 + "제곱은 " + Math.pow(num6, num7) + "입니다.");
		
		System.out.println("루트 " + num6 + "은 " + Math.sqrt(num7) + "입니다.");
		
		String str2 = "김종국, 유재석, 박수홍";
		
		String str3 = "이광수, 이천수, 안정환";
		
		StringTokenizer st = new StringTokenizer(str2, ",");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			
			String temp = st.nextToken();
			
			System.out.println(temp);
			
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("유재석");
		
		strList.add("김국진");
		
		strList.add("박수홍");
		
		strList.add("이광수");
		
		System.out.println("strList의 2번지에 있는 값은 " + strList.get(2));
		
		strList.set(3, "안정환");
		
		System.out.println("strList의 3번지에 있는 값은 " + strList.get(3));
		
		System.out.println("strList의 크기는 " + strList.size());
		
		strList.remove(3);
		
		System.out.println("strList의 총 데이터를 보여주세요 : " + strList);
		
		for(int i = 0; i <= strList.size(); i++) {
			
			System.out.println(strList.iterator());
			
		}
		
		strList.remove(2);
		
		strList.remove(1);
		
		strList.remove(0);
		
		if(strList.isEmpty()) {
			
			System.out.println("비어있는 리스트입니다.");
			
		} else {
			
			System.out.println(strList);
			
		}
		
		
		
	}

}