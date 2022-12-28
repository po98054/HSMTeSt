package Dao;

import java.util.ArrayList;

import Vo.StudentVoVer02ByTeacher;

import Vo.StudentVoVer03ByTeacher;

public interface StudentDaoVer04ByTeacher {
	
	int insertStudent(StudentVoVer02ByTeacher std);
	
	StudentVoVer02ByTeacher selectStudent(String st_num);
	
	int updateStudent(StudentVoVer02ByTeacher std);

	ArrayList<StudentVoVer02ByTeacher> selectAllStudent();
	
	ArrayList<StudentVoVer03ByTeacher> selectAllStudent2();

}