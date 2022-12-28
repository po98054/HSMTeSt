package Main;

import java.io.IOException;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactory;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main {
	
	public static void main(String[] args) {
		
		String resource = "Day48/mybatis-config.xml";
		
		try {
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		try (SqlSession session = sqlSessionFactory.openSession()) {
			
			 MainController mc = new MainController(session);
			 
			 mc.run();
			  
			}
		
		} catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

}