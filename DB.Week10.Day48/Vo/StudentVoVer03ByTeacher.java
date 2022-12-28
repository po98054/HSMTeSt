package Vo;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor

@NoArgsConstructor
public class StudentVoVer03ByTeacher {
	
	private String num;
	
	private String name;
	
	private int semester;
	
	private String state;
	
	private String professorNum;
	
	@Override
	public String toString() {
		
		return name + "의 학번은 " + num + "이며 " + name + "의 학기는 " + semester + "학기 이며 " + name + "의 상태는 " + state + "이며 " + name 
				
				+ "의 지도 교수 번호는 " + professorNum +"입니다."+ "\n";
		
	}

}