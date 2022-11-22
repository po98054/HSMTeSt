package Day23;

import java.util.ArrayList;

import lombok.Data;

@Data
public class LogVer02ByTeacher {
	
	private ArrayList<StudentLogVer02ByTeacher> slogs = new ArrayList<StudentLogVer02ByTeacher>();
	
	private String Date;

	public LogVer02ByTeacher(ArrayList<StudentVer02ByTeacher> stds, String date) {
		
		for(StudentVer02ByTeacher std : stds) {
			
			StudentLogVer02ByTeacher slog = new StudentLogVer02ByTeacher(std, null);
			
			slogs.add(slog);
			
		}
		
		this.Date = date;
		
	}
	
}