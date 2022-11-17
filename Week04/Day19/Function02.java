package Day19;

import java.util.ArrayList;

import java.util.function.Function;

public class Function02 {
	
	public static void main(String [] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, 2, 3, "유재석", 90, 100, 100));
		
		list.add(new Student(1, 2, 4, "김국진", 95, 100, 100));
		
		list.add(new Student(1, 2, 5, "박수홍", 90, 85, 100));
		
		list.add(new Student(1, 2, 6, "김용만", 90, 100, 70));
		
		print(list, "국어", s -> s.getKor());
		
		System.out.println("-------------------------------");
		
		print(list, "영어", s -> s.getEng());
		
		System.out.println("-------------------------------");
		
		print(list, "수학", s -> s.getMath());
		
		System.out.println("-------------------------------");
		
		print(list, "총합", s -> s.getKor() + s.getEng() + s.getMath());
		
	}
	
	public static void print(ArrayList<Student> list, String subject, Function<Student, Integer> f) {
		
		for(Student temp : list) {
			
			System.out.println(subject + " : " + f.apply(temp));
			
		}
		
	}

}