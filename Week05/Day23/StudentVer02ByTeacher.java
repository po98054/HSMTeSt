package Day23;

import lombok.Data;

@Data
public class StudentVer02ByTeacher {
	
	private String name;
	
	private String birthday;

	public StudentVer02ByTeacher(String name, String birthday) {
		
		this.name = name;
		
		this.birthday = birthday;
		
	}

	public StudentVer02ByTeacher(StudentVer02ByTeacher std) {
		
		this.name = std.name;
		
		this.birthday = std.birthday;
		
	}

	@Override
	public String toString() {
		
		return name + "의 생일은 " + birthday + "입니다.";
		
	}
	
	
	
}