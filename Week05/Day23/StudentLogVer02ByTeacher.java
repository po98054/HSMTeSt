package Day23;

import lombok.Data;

@Data
public class StudentLogVer02ByTeacher {
	
	private StudentVer02ByTeacher std;
	
	private String state;

	public StudentLogVer02ByTeacher(String name, String birthday, String state) {
		
		std = new StudentVer02ByTeacher(name, birthday);
		
		this.state = state;
		
	}
	
	public StudentLogVer02ByTeacher(StudentVer02ByTeacher std, String state) {
		
		this.std = new StudentVer02ByTeacher(std);
		
		this.state = state;
		
	}

	@Override
	public String toString() {
		
		return std.getName() + "의 생일은 " + std.getBirthday() + "이며 " + std.getName() + "의 출석 여부는 " + state + "입니다.";
		
	}
	
	
	
}