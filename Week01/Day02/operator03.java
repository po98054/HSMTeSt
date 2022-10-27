package Day02;

import java.util.Scanner;

public class operator03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요 : ");
		
		String name = sc.next();
		
		System.out.println("당신의 국어 영어 수학 점수를 입력하세요 : ");
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		sc.close();
		
		double avg = (double) (kor + eng + math) / 3;
		
		double avg2 = (kor + eng + math) / 3.0;
		
		System.out.println(name + "학생의 국어 점수는 " + kor + "점 이며 " + name + "학생의 영어 점수는 " + eng + "점 이며 " + name + "학생의 수학 점수는 " + math + "점 이며 " + name + 
				"학생의 평균 점수는 " + avg + "이다");
		
		System.out.println();
		
		System.out.println(name + "학생의 국어 점수는 " + kor + "점 이며 " + name + "학생의 영어 점수는 " + eng + "점 이며 " + name + "학생의 수학 점수는 " + math + "점 이며 " + name + "학생의 평균 점수는 " 
		+ avg2 + "이다");
		
		System.out.println();
		
		System.out.println(name + "학생의 통과 여부는 " + (avg >= 60));
		

	}

}
