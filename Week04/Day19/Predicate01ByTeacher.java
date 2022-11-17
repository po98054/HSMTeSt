package Day19;

import java.util.ArrayList;

public class Predicate01ByTeacher {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, 1, 3, "유재석", 90, 100, 100));
		
		list.add(new Student(1, 2, 4, "김국진", 95, 100, 100));
		
		list.add(new Student(1, 2, 5, "박수홍", 90, 85, 100));
		
		list.add(new Student(2, 2, 6, "김용만", 90, 100, 70));
		
		print(list, 1, 1);
		
		System.out.println("-------------------------------");
		
		print(list, 1,2);
		
		System.out.println("-------------------------------");
		
		print(list, 2);
		
	}
	
	public static void print(ArrayList<Student> list, int grade, int ban) {
		
		for(Student temp : list) {
			
			if(temp.getGrade() == grade && temp.getBan() == ban) {
				
				System.out.println(temp);
				
			}
			
		}
		
	}
	
	public static void print(ArrayList<Student> list, int grade) {
		
		for(Student temp : list) {
			
			if(temp.getGrade() == grade) {
				
				System.out.println(temp);
				
			}
			
		}
		
	}
	
}