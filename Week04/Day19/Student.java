package Day19;

import lombok.Data;

@Data
public class Student {
	
	private int grade;
	
	private int ban;
	
	private int bunho;
	
	private String name;
	
	private int kor;
	
	private int math;
	
	private int eng;

	public Student(int grade, int ban, int bunho, String name) {
		
		this(grade, ban, bunho, name, 0, 0, 0);
		
	}

	public Student(int grade, int ban, int bunho, String name, int kor, int math, int eng) {
		
		this.grade = grade;
		
		this.ban = ban;
		
		this.bunho = bunho;
		
		this.name = name;
		
		this.kor = kor;
		
		this.math = math;
		
		this.eng = eng;
		
	}

	@Override
	public String toString() {
		
		return grade + "학년 " + ban + "반 " + bunho + "번 " + name + " " + "국어 점수 : " + kor + " " + "영어 점수 : " + eng + " " + "수학 점수 : " + math;
		
	}
	
	
	
}