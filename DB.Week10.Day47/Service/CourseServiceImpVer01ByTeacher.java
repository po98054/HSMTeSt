package Service;

import java.util.Scanner;

import Dao.CourseMapperVer01ByTeacher;

import Day47.DBConnectorVer01ByTeacher;
import Vo.CourseVoVer01ByTeacher;
import Vo.LectureVer01ByTeacher;

public class CourseServiceImpVer01ByTeacher implements CourseServiceVer01ByTeacher{
	
	private Scanner sc = new Scanner(System.in);
	
	private CourseMapperVer01ByTeacher courseDao;

	public CourseServiceImpVer01ByTeacher(DBConnectorVer01ByTeacher dbConnector) {
	
		courseDao = new CourseMapperVer01ByTeacher(dbConnector);
		
	}

	public void insertLecture() {
		
		System.out.print("강좌명 : ");
		
		String le_name = sc.nextLine();
		
		System.out.print("일정 : ");
		
		String le_schedule = sc.nextLine();
		
		System.out.print("학점 : ");
		
		int le_point = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("분반 : ");
		
		int le_class = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연도 : ");
		
		int le_year = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("학기 : ");
		
		String le_term = sc.nextLine();
		
		System.out.print("지도 교수 번호 : ");
		
		String le_pr_num = sc.nextLine();
		
		LectureVer01ByTeacher lecture = new LectureVer01ByTeacher(0, le_name, le_schedule, le_point, le_class, le_year, le_term, le_pr_num);
		
		courseDao.insertLecture(lecture);
		
	}

	public void updateLecture() {
		
		System.out.print("강좌 번호 : ");
		
		int le_num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("강좌명 : ");
		
		String le_name = sc.nextLine();
		
		System.out.print("일정 : ");
		
		String le_schedule = sc.nextLine();
		
		System.out.print("학점 : ");
		
		int le_point = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("분반 : ");
		
		int le_class = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연도 : ");
		
		int le_year = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("학기 : ");
		
		String le_term = sc.nextLine();
		
		System.out.print("지도 교수 번호 : ");
		
		String le_pr_num = sc.nextLine();
		
		LectureVer01ByTeacher lecture = new LectureVer01ByTeacher(le_num, le_name, le_schedule, le_point, le_class, le_year, le_term, le_pr_num);
		
		courseDao.updateLecture(lecture);
		
	}

	public void deleteLecture() {
		
		System.out.print("강좌 번호 : ");
		
		int le_num = sc.nextInt();
		
		sc.nextLine();
		
		courseDao.deleteLecture(le_num);
		
	}
	
	public void insertCourse() {
		
		System.out.print("강좌명(정확히 입력) : ");
		
		String le_name = sc.nextLine();
		
		System.out.print("분반 : ");
		
		int le_class = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연도 : ");
		
		int le_year = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("학기(정확히 입력) : ");
		
		String le_term = sc.nextLine();
		
		System.out.print("학번 : ");
		
		String co_st_num = sc.nextLine();
		
		System.out.print("타입(학점, 패스) : ");
		
		String co_type = sc.nextLine();
		
		LectureVer01ByTeacher lec = courseDao.selectLectureByName(le_name, le_class, le_year, le_term);
		
		if(lec == null) {
			
			System.out.println("수강 신청 실패");
			
			return;
			
		}
		
		courseDao.insertCourse(new CourseVoVer01ByTeacher(0, co_st_num, lec.getLe_num(), co_type, null));
		
	}
	
	public void deleteCourse() {
		
		System.out.print("강좌명(정확히 입력) : ");
		
		String le_name = sc.nextLine();
		
		System.out.print("분반 : ");
		
		int le_class = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연도 : ");
		
		int le_year = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("학기(정확히 입력) : ");
		
		String le_term = sc.nextLine();
		
		System.out.print("학번 : ");
		
		String co_st_num = sc.nextLine();
		
		System.out.print("타입(학점, 패스) : ");
		
		String co_type = sc.nextLine();
		
		LectureVer01ByTeacher lec = courseDao.selectLectureByName(le_name, le_class, le_year, le_term);
		
		if(lec == null) {
			
			System.out.println("수강 취소 실패");
			
			return;
			
		}
		
		courseDao.deleteCourse(lec.getLe_num(), co_st_num);
		
	}

}