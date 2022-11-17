package Day19;

import java.util.ArrayList;

import java.util.function.Consumer;

import Day13.Student;

public class Consumer01 {
	
	public static void main(String [] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(2, 3, 14, "김국진"));
		
		list.add(new Student(2, 3, 15, "유재석"));
		
		list.add(new Student(2, 3, 17, "박수홍"));
		
		print(list, (a) -> System.out.println("학생정보 : " + a));
		
		System.out.println("--------------------------");
		
		print(list, (a) -> System.out.println(a.getGrade() + "학년 " + a.getBan() + "반 " + a.getBunho() + "번" + " " + a.getName()));
		
	}
	
	public static void print(ArrayList<Student> list, Consumer<Student> con) {
		
		for(Student temp : list) {
			
			con.accept(temp);
			
		}
		
	}

}