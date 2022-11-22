package Day22;

import java.util.ArrayList;

import lombok.Data;

@Data
public class LogVer01ByTeacher {
	
	private ArrayList<StudentLogVer01ByTeacher> slogs = new ArrayList<StudentLogVer01ByTeacher>();
	
	private String Date;

	public LogVer01ByTeacher(ArrayList<StudentVer01ByTeacher> stds, String date) {
		
		for(StudentVer01ByTeacher std : stds) {
			
			StudentLogVer01ByTeacher slog = new StudentLogVer01ByTeacher(std, null);
			
			slogs.add(slog);
			
		}
		
		this.Date = date;
		
	}
	
}