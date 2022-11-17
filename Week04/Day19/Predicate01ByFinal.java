package Day19;

import java.util.ArrayList;

import java.util.function.Predicate;

public class Predicate01ByFinal {
	
public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, 1, 3, "유재석", 90, 100, 100));
		
		list.add(new Student(1, 2, 4, "김국진", 95, 100, 100));
		
		list.add(new Student(1, 2, 5, "박수홍", 90, 85, 100));
		
		list.add(new Student(2, 2, 6, "김용만", 90, 100, 70));
		
		print(list, (s) -> s.getGrade() == 1 && s.getBan() == 1);
		
		System.out.println("-------------------------------");
		
		print(list, (s) -> s.getGrade() == 1 && s.getBan() == 2);
		
		System.out.println("-------------------------------");
		
		print(list, (s) -> s.getGrade() == 2);
		
		System.out.println("-------------------------------");
		
		print(list, (s) -> s.getName().charAt(0) == '유');
		
		System.out.println("-------------------------------");
		
		print(list, (s) -> s.getName().charAt(0) == '김');
		

	}

	public static void print(ArrayList<Student> list, Predicate<Student> p) {
		
		for(Student temp : list) {
			
			if(p.test(temp)) {
				
				System.out.println(temp);
				
			}
			
		}
		
	}

}