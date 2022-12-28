package Day48;

import java.io.*;

import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactory;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Dao.StudentDaoVer02ByTeacher;

import Vo.CourseVoVer02ByTeacher;

public class MybatisMain {
	
	public static void main(String[] args){
		
		String resource = "Day48/mybatis-config.xml";
		
		try {
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		try (SqlSession session = sqlSessionFactory.openSession()) {
			
			  StudentDaoVer02ByTeacher studentDao = session.getMapper(StudentDaoVer02ByTeacher.class);
			  
			  CourseVoVer02ByTeacher co = new CourseVoVer02ByTeacher("2022123001", 1, "학점");
			  
			  studentDao.insertCourse(co);
			  
			  session.commit();
			  
			}
		
		} catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

}