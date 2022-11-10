package Day14;

import java.util.Calendar;

public class Calendar01 {
	
	public static void main(String [] args) {
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("현재 시간 : " + cal);
		
		//cal.add(Calendar.YEAR, -5);
		
		int year = cal.get(Calendar.YEAR);
		
		int month = cal.get(Calendar.MONTH) + 1;
		
		int day = cal.get(Calendar.THURSDAY);
		
		int hour = cal.get(Calendar.HOUR);
		
		int minute = cal.get(Calendar.MINUTE);
		
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second + "초 ");
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second + "초 ");
		
	}

}