package Day17;

import lombok.Data;

@Data
public class MemberVer02ByMap {
	
	private String pw;
	
	private int age;
	
	private String name;
	
	private String residentNumber;
	
	public MemberVer02ByMap(String pw, String name, String residentNumber, int age) {
		
		this.pw = pw;
		
		this.name = name;
		
		this.residentNumber = residentNumber;
		
		this.age = age;
			
	}

	public void update(String newPw, String name, String residentNumber, int age) {
		
		this.pw = newPw;
		
		this.name = name;
		
		this.residentNumber = residentNumber;
		
		this.age = age;
		
	}

}