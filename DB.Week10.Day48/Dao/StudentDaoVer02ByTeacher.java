package Dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import Vo.CourseVoVer02ByTeacher;

import Vo.StudentVoVer02ByTeacher;

public interface StudentDaoVer02ByTeacher {
	
	ArrayList<StudentVoVer02ByTeacher> selectAllStudent();
	
	void insertStudent(@Param("std")StudentVoVer02ByTeacher std);
	
	void insertCourse(CourseVoVer02ByTeacher co);

}