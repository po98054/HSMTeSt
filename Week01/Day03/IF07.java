package Day03;

import java.util.Scanner;

public class IF07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 점수를 입력하세요: ");
		
		int score = sc.nextInt();
		
		sc.close();
		
		if (score >= 90 && score <= 100) {
			
			System.out.println("당신의 학점은 A 입니다.");
			
		} else if (score >= 80 && score < 90) {
			
			System.out.println("당신의 학점은 B 입니다.");
			
		} else if (score >= 70 && score < 80) {
			
			System.out.println("당신의 학점은 C 입니다.");
			
		} else if (score >= 60 && score < 70) {
			
			System.out.println("당신의 학점은 D 입니다.");
			
		} else if (score >= 0 && score < 60) {
			
			System.out.println("당신의 학점은 F 입니다.");
			
		} else {
			
			System.out.println("성적을 잘 못 입력했습니다.");
			
		}

	}

}
