package Day47;

import java.sql.*;

import java.util.*;

public interface StudentDaoVer01ByTeacher {
	
	ArrayList<StudentVO1ByTeacher> selectAllStudent() throws SQLException;
	
	StudentVO1ByTeacher selectStudentBySt_num(String st_num) throws SQLException;
	
	boolean insertStudent(StudentVO1ByTeacher std);
	
	boolean deleteStudent(String std_num);
	
	boolean updateStudent(StudentVO1ByTeacher std, int submenu);
	
}