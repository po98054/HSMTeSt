package Vo;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor

@NoArgsConstructor
public class StudentVoVer02ByTeacher {
	
	private String st_num;
	
	private String st_name;
	
	private int st_semester;
	
	private String st_state;
	
	private String st_pr_num;

	@Override
	public String toString() {
		
		/*return st_name + "의 학번은 " + st_num + "이며 " + st_name + "의 학기는 " + st_semester + "학기 이며 " + st_name + "의 상태는 " + st_state + "이며 " + st_name 
				
				+ "의 지도 교수 번호는 " + st_pr_num +"입니다."+ "\n"; */
		
		return st_name + "의 학번은 " + st_num + "입니다." + "\n";
		
	}
	
}