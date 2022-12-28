package Dao;

import java.util.ArrayList;

import Vo.StudentVoVer02ByTeacher;

public interface StudentDaoVer03ByHSM {
	
	void insertStudent(StudentVoVer02ByTeacher std);
	
	void updateStudent(StudentVoVer02ByTeacher std);
	
	ArrayList<StudentVoVer02ByTeacher> selectAllStudent();

}