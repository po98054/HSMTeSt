package Day14;

import java.util.Date;

public class Date01 {
	
	public static void main(String [] args) {
		
		Date date = new Date();
		
		System.out.println("현재 시간 : " + date);
		
		Date date2 = new Date(0);
		
		System.out.println("기준 시간 : " + date2);
		
		// 현재시간 부터 일주일 지난 뒤의 시간을 출력하는 코드
		
		long nowMillis = System.currentTimeMillis();
		
		System.out.println("nowMillis : " + nowMillis);
		
		int week = 7 * 24 * 60 * 60 * 1000;
		
		Date date3 = new Date(nowMillis + week);
		
		System.out.println("현재 시간 부터 일주일 지난 뒤의 시간 : " + date3);
		
	}

}