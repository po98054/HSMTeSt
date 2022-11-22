package Day22;

import lombok.Data;

@Data
public class StudentLogVer01ByTeacher {
	
	private StudentVer01ByTeacher std;
	
	private String state;

	public StudentLogVer01ByTeacher(String name, String birthday, String state) {
		
		std = new StudentVer01ByTeacher(name, birthday);
		
		this.state = state;
		
	}
	
	public StudentLogVer01ByTeacher(StudentVer01ByTeacher std, String state) {
		
		this.std = new StudentVer01ByTeacher(std);
		
		this.state = state;
		
	}
	
}