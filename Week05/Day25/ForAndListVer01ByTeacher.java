package Day25;

import java.util.*;

public class ForAndListVer01ByTeacher {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.print("사용자 : ");
			
			String user = sc.next();
			
			String com = randomRPS();
			
			System.out.print("컴퓨터 : " + com);
			
			System.out.println();
			
			int res = compare(user, com);
			
			switch(res) {
			
			case 1 :
				
				System.out.println("사용자 승리");
				
				break;
				
			case -1 :
				
				System.out.println("컴퓨터 승리");
				
				break;
				
			case 0 :
				
				System.out.println("무승부");
				
				break;
				
			default :
				
				break;
			
			}
			
		} while(!sc.next().equals("n"));
		
		sc.close();
		
	}

	private static String randomRPS() {
		
		List<String> list = Arrays.asList("가위", "바위", "보");
		
		int r = (int)(Math.random() * 3);
		
		return list.get(r);
		
	}
	
	private static int compare(String a, String b) {
		
		if(a.equals(b)) {
			
			return 0;
			
		}
		
		switch(a) {
		
		case "가위" :
			
			return b.equals("보") ? 1 : -1;
			
		case "바위" :
			
			return b.equals("가위") ? 1 : -1;
			
		default :
			
			return b.equals("바위") ? 1 : -1;
		
		}
	
	}

}