package Day24;

import java.io.Serializable;

import lombok.Data;

@Data
public class StudentVer01ByHSM implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5721664151038730182L;

	private String name;
	
	private int grade;
	
	private int ban;
	
	private int bunho;

	public StudentVer01ByHSM(String name, int grade, int ban, int bunho) {
		
		this.name = name;
		
		this.grade = grade;
		
		this.ban = ban;
		
		this.bunho = bunho;
		
	}

	@Override
	public String toString() {
		
		return grade + "학년 " + ban + "반 " + bunho + "번 " + name +"입니다.";
		
	}
	
}