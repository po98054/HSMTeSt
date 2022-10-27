package Day03;

import java.util.Scanner;

public class IF08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		sc.close();
		
		if (score < 0 || score > 100) {
			
			System.out.println("성적을 잘 못 입력했습니다.");
			
		} else if (score >= 90) {
			
			System.out.println("당신의 성적 " + score + "점은 A학점 입니다.");
			
		} else if (score >= 80) {
			
			System.out.println("당신의 성적 " + score + "점은 B학점 입니다.");
			
		} else if (score >= 70) {
			
			System.out.println("당신의 성적 " + score + "점은 C학점 입니다.");
			
		} else if (score >= 60) {
			
			System.out.println("당신의 성적 " + score + "점은 D학점 입니다.");
			
		} else {
			
			System.out.println("당신의 성적 " + score + "점은 F학점 입니다");
			
		}

	}

}
