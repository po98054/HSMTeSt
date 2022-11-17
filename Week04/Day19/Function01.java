package Day19;

import java.util.ArrayList;

public class Function01 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, 2, 3, "유재석", 90, 100, 100));
		
		list.add(new Student(1, 2, 4, "김국진", 95, 100, 100));
		
		list.add(new Student(1, 2, 5, "박수홍", 90, 85, 100));
		
		list.add(new Student(1, 2, 6, "김용만", 90, 100, 70));
		
		// 학생들의 국어 성적만 출력하는 코드를 작성하세요.
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i).getName() +"의 국어 성적 : " + list.get(i).getKor());
			
		}
		
		System.out.println("-------------------------------");
		
		// 학생들의 수학 성적만 출력하는 코드를 작성하세요.
		
		for (int i = 0; i < list.size(); i++) {
					
			System.out.println(list.get(i).getName() +"의 수학 성적 : " + list.get(i).getMath());
					
		}
		
		System.out.println("-------------------------------");
		
		// 학생들의 영어 성적만 출력하는 코드를 작성하세요.
		
		for (int i = 0; i < list.size(); i++) {
							
			System.out.println(list.get(i).getName() +"의 영어 성적 : " + list.get(i).getEng());
							
		}
		
		System.out.println("-------------------------------");
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i).getName() +"의 국어 성적 : " + list.get(i).getKor());
			
			System.out.println(list.get(i).getName() +"의 수학 성적 : " + list.get(i).getMath());
			
			System.out.println(list.get(i).getName() +"의 영어 성적 : " + list.get(i).getEng());
			
			System.out.println("-------------------------------");
							
		}
		
	}

}