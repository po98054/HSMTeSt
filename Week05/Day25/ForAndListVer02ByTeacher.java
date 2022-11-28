package Day25;

import java.util.*;

public class ForAndListVer02ByTeacher {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			try {
				
				System.out.print("사용자 : ");
				
				RPS user = RPS.valueOf(sc.next());
				
				RPS com = randomRPS(); 
				
				System.out.println("컴퓨터 " + com);
				
				State state = resultState(user, com);
				
				printState(state);
				
			} catch(IllegalArgumentException e) {
				
				System.out.println("입력을 잘못 했습니다.");
				
			}
			
			System.out.print("계속 하시겠습니까? (y/n) ");
			
		} while(!sc.next().equals("n"));
		
		sc.close();
		
	}

	private static RPS randomRPS() {
		
		RPS [] rpss = RPS.values();
		
		int r = (int) (Math.random() * 3);
		
		return rpss[r];
		
	}
	
	private static State resultState(RPS user, RPS com) {
		
		if(user == com) {
			
			return State.무승부;
			
		}
		
		switch(user) {
		
		case 가위 :
			
			return com == RPS.보 ? State.승리 : State.패배;
			
		case 바위 :
			
			return com == RPS.가위 ? State.승리 : State.패배;
			
		default :
			
			return com == RPS.바위 ? State.승리 : State.패배;
		
		}
		
	}
	
	private static void printState(State state) {
		
		switch(state) {
		
		case 승리 :
			
			System.out.println("사용자 승리");
			
			break;
			
		case 패배 :
			
			System.out.println("컴퓨터 승리");
			
			break;
			
		default :
			
			System.out.println("무승부");
			
			
			break;
		
		}
		
	}

}

enum RPS {
	
	가위, 바위, 보
	
}

enum State {
	
	승리, 패배, 무승부
	
}