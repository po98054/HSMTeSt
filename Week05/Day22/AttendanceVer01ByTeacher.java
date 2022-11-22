package Day22;

import java.util.ArrayList;

import lombok.Data;

@Data
public class AttendanceVer01ByTeacher {
	
	private ArrayList<StudentVer01ByTeacher> stds = new ArrayList<StudentVer01ByTeacher>();
	
	private ArrayList<LogVer01ByTeacher> logs = new ArrayList<LogVer01ByTeacher>();
	
}