package Day10;

import java.util.Arrays;
import java.util.Scanner;

public class PlayerInfo {
	
	private int [] com;
	
	private int [] user;
	
	private int strike;
	
	private int ball;
	
	private int count;
	
	private int re;
	
	public PlayerInfo(int [] com) {
		
		this.com = Arrays.copyOf(com, com.length);
		
		//this.user = Arrays.copyOf(user, user.length);
		
		//printResult();
		
	}
	
	public void setUser(int [] user) {
		
		this.user = Arrays.copyOf(user, user.length);
		
		calculateResult();
		
		//System.out.println(count);
		
		//re = count;
		
	}
	
	private void calculateResult() {
		
		calculateStrike();
		calculateBall();
		
		count = count + 1;
		
	}
	
	private void calculateStrike() {
		
		strike = 0;
		
		int size = com.length < user.length ? com.length : user.length;
		
		for(int i = 0; i < size; i++) {
			
			if(com[i] == user[i]) {
				
				strike = strike + 1;
				
			}
			
		}
		
		//System.out.println(strike + " 스트라이크");
		
		//return strike;
		
	}
	
	private void calculateBall() {
		
		ball = 0;
		
		//int size = com.length < user.length ? com.length : user.length;
		
		for(int i = 0; i < com.length; i++) {
			
			for(int j = 0; j < user.length; j++) {
				
				if(com[i] == user[j] && i != j) {
					
					ball = ball + 1;
					
				}
			
			}
			
		}
		
		//System.out.println(ball + " 볼");
		
		//return ball;
		
	}
	
	public int getStrike() {
		
		return strike;
		
	}
	
	public int getCount() {
		
		return count;
		
	}
	
	public void printResult() {
		
		if (strike == 3) {
			
			System.out.println("정답입니다.");
			
		} else {
			
			//ball = ball - stri;
			
			System.out.println(strike + "스트라이크" + ball + "볼");
			
		}
		
	}

}
