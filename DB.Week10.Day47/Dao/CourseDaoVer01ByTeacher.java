package Dao;

import Vo.CourseVoVer01ByTeacher;
import Vo.LectureVer01ByTeacher;

public interface CourseDaoVer01ByTeacher {
	
	void insertLecture(LectureVer01ByTeacher lecture);
	
	void updateLecture(LectureVer01ByTeacher lecture);
	
	void deleteLecture(int le_num);
	
	LectureVer01ByTeacher selectLectureByName(String le_name, int le_class, int le_year, String le_term);
	
	void insertCourse(CourseVoVer01ByTeacher course);
	
	void deleteCourse(int le_num, String co_st_num);

}