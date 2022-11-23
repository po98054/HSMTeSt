package Day23;

import java.util.ArrayList;

import lombok.Data;

@Data
public class LogVer02ByTeacher {
	
	private ArrayList<StudentLogVer02ByTeacher> slogs = new ArrayList<StudentLogVer02ByTeacher>();
	
	private String Date;

	public LogVer02ByTeacher(ArrayList<StudentLogVer02ByTeacher> stdLogs, String date) {
		
		this.slogs = stdLogs;
		
		this.Date = date;
		
	}

	@Override
	public String toString() {
		
		return "날짜 : " + Date + " " + " 학생 출석 여부 : " + slogs;
		
	}
	
	
	
}