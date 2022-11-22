package Day23;

import java.util.ArrayList;

import lombok.Data;

@Data
public class AttendanceVer02ByTeacher {
	
	private ArrayList<StudentVer02ByTeacher> stds = new ArrayList<StudentVer02ByTeacher>();
	
	private ArrayList<LogVer02ByTeacher> logs = new ArrayList<LogVer02ByTeacher>();
	
}