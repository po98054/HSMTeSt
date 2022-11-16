package Day18;

import java.util.Scanner;

public class Enum02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오늘의 요일 : ");
		
		String day = sc.next();
		
		switch(day) {
		
		case "MONDAY" :
			
			System.out.println("월요일");
			
			break;
			
		case "TUESDAY" :
			
			System.out.println("화요일");
			
			break;
			
		case "WEDNESDAY" :
			
			System.out.println("수요일");
	
			break;
	
		case "THURSDAY" :
			
			System.out.println("목요일");
	
			break;
	
		case "FRIEDAY" :
			
			System.out.println("금요일");
	
			break;
	
		case "SATURDAY" :
			
			System.out.println("토요일");
	
			break;
	
		case "SUNDAY" :
			
			System.out.println("일요일");
	
			break;
	
		default :
			
			System.out.println("잘못 입력했습니다.");
	
			break;
		
		}
		
		System.out.println("------------------------------------");
		
		try {
			
			Week week = Week.valueOf(day);
			
			switch(week) {
			
			case MONDAY :
				
				System.out.println("월요일");
				
				break;
				
			case TUESDAY :
				
				System.out.println("화요일");
				
				break;
				
			case WEDNESDAY :
				
				System.out.println("수요일");
		
				break;
		
			case THURSDAY :
				
				System.out.println("목요일");
		
				break;
		
			case FRIEDAY :
				
				System.out.println("금요일");
		
				break;
		
			case SATURDAY :
				
				System.out.println("토요일");
		
				break;
		
			case SUNDAY :
				
				System.out.println("일요일");
		
				break;
		
			}
			
		} catch(Exception e) {
			
			System.out.println("잘못 입력했습니다.");
			
		}
		
		
		
		sc.close();
		
	}

}

enum Week {
	
	MONDAY,
	
	TUESDAY,
	
	WEDNESDAY,
	
	THURSDAY,
	
	FRIEDAY,
	
	SATURDAY,
	
	SUNDAY
	
}