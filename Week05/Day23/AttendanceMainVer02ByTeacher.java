package Day23;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class AttendanceMainVer02ByTeacher {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		int menu = -1;
		
		AttendanceVer02ByTeacher attendance = new AttendanceVer02ByTeacher();
		
		do {
			
			try {
				
				printMenu();
				
				menu = sc.nextInt();
				
				sc.nextLine();
				
				runMenu(menu, attendance);
				
			} catch(Exception e) {
				
				System.out.println(e.getMessage());
				
			}
			
		} while(menu != 3);
		
	}
	
	private static void printBar() {
		
		System.out.println("--------------------------");
		
	}
	
	private static void printStr(String str) {
		
		printBar();
		
		System.out.println(str);
		
		printBar();
		
	}

	private static void printMenu() {
		
		System.out.println("--------메인 메뉴------------");
		
		System.out.println("1. 학생 관리");
		
		System.out.println("2. 출석 관리");
		
		System.out.println("3. 종료");
		
		System.out.println("--------------------------");
		
		System.out.print("메인 메뉴를 선택하세요. : ");
		
	}
	

	private static void runMenu(int menu, AttendanceVer02ByTeacher attendance) {
		
		ArrayList<StudentVer02ByTeacher> stds = attendance.getStds();
		
		ArrayList<LogVer02ByTeacher> logs = attendance.getLogs();
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("--------------------------");
			
			managementStudents(stds);
			
			break;
			
		case 2 :
			
			System.out.println("--------------------------");
			
			managementLogs(logs, stds);
			
			break;
			
		case 3 :
			
			printStr("프로그램 종료!!");
			
			break;
			
		default :
			
			printStr("메뉴를 잘못 입력했습니다.");
			
			break;
		
		}
		
	}
	
	private static void printSubMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("---------학생 관리 서브 메뉴-----------");
			
			System.out.println("1. 학생 등록");
			
			System.out.println("2. 학생 수정");
			
			System.out.println("3. 학생 삭제");
			
			System.out.println("4. 취소");
			
			System.out.println("-----------------------------------");
			
			System.out.print("학생 관리 서브 메뉴를 입력하세요 : ");
			
			break;
			
		case 2 : 
			
			System.out.println("----------출석 관리 서브 메뉴------------");
			
			System.out.println("1. 출석 체크 - 전체 -");
			
			System.out.println("2. 출석 확인 - 개별 -");
			
			System.out.println("3. 출석 확인 - 날짜별 -");
			
			System.out.println("4. 출석 수정");
			
			System.out.println("5. 출석 삭제");
			
			System.out.println("6. 취소");
			
			System.out.println("------------------------------------");
			
			System.out.print("출석 관리 서브 메뉴를 입력하세요. :");
			
			break;
			
		default :
			
			printStr("잘못된 메뉴를 입력했습니다.");
		
		}
		
	}
	
	private static void managementStudents(ArrayList<StudentVer02ByTeacher> stds) {
		
		printSubMenu(1);
		
		int subMenu = sc.nextInt();
		
		sc.nextLine();
	
		switch(subMenu) {
		
		case 1 :
			
			printBar();
			
			addStudent(stds);
			
			break;
			
		case 2 : 
			
			printBar();
			
			updateStudent(stds);
			
			break;
			
		case 3 :
			
			printBar();
			
			deleteStudent(stds);
			
			break;
			
		case 4 :
			
			printStr("취소 했습니다.");
			
			break;
			
		default :
			
			printStr("메뉴를 잘못 입력했습니다.");
		
		}
		
	}

	private static void addStudent(ArrayList<StudentVer02ByTeacher> stds) {
		
		if(stds == null) {
			
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
			
		}
		
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		System.out.print("생일 : ");
		
		String birthday = sc.nextLine();
		
		StudentVer02ByTeacher std = new StudentVer02ByTeacher(name, birthday);
		
		if(stds.indexOf(std) != -1) {
			
			printStr("학생 정보를 추가하지 못했습니다.");
			
			return;
			
		}
		
		stds.add(std);
		
		printStr("학생 정보를 추가했습니다.");
		
	}
	
	private static void updateStudent(ArrayList<StudentVer02ByTeacher> stds) {
		
		if(stds == null) {
			
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
			
		}
		
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		System.out.print("생일 : ");
		
		String birthday = sc.nextLine();
		
		StudentVer02ByTeacher std = new StudentVer02ByTeacher(name, birthday);
		
		int index = stds.indexOf(std);
		
		if(index == -1) {
			
			printStr("입력 정보와 일치하는 학생이 없습니다.");
			
			return;
			
		}
		
		printBar();
		
		System.out.print("수정할 이름 : ");
		
		name = sc.nextLine();
		
		System.out.print("수정할 생일 : ");
		
		birthday = sc.nextLine();
		
		std = new StudentVer02ByTeacher(name, birthday);
		
		stds.set(index, std);
		
		printStr("학생 정보를 수정했습니다.");
		
	}
	

	private static void deleteStudent(ArrayList<StudentVer02ByTeacher> stds) {
		
		if(stds == null) {
			
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
			
		}
		
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		System.out.print("생일 : ");
		
		String birthday = sc.nextLine();
		
		StudentVer02ByTeacher std = new StudentVer02ByTeacher(name, birthday);
		
		int index = stds.indexOf(std);
		
		if(index == -1) {
			
			printStr("입력 정보와 일치하는 학생이 없습니다.");
			
			return;
			
		}
		
		stds.remove(index);
		
		printStr("학생 정보를 삭제했습니다.");
		
		System.out.println(stds);
		
	}
	
	private static void managementLogs(ArrayList<LogVer02ByTeacher> logs, ArrayList<StudentVer02ByTeacher> stds) {
		
		printSubMenu(2);
		
		int subMenu = sc.nextInt();
		
		sc.nextLine();
		
		switch(subMenu) {
		
		case 1 :
			
			printBar();
			
			checkLog(stds, logs);
			
			sortLogs(logs);
			
			break;
			
		case 2 :
			
			printBar();
			
			printLogsByStudent(logs);
			
			break;
			
		case 3 :
			
			printBar();
			
			printLogsByDate(logs);
			
			break;
			
		case 4 :
			
			printBar();
			
			updateLogs(logs);
			
			break;
			
		case 5 :
			
			printBar();
			
			deleteLogs(logs);
			
			break;
			
		case 6 :
			
			printBar();
			
			System.out.println("취소합니다.");
			
			break;
			
		default :
			
			printStr("출석 서브 메뉴를 잘 못 입력했습니다.");
			
			break;
		
		}
		
	}

	private static void checkLog(ArrayList<StudentVer02ByTeacher> stds, ArrayList<LogVer02ByTeacher> logs) {
		
		// 날짜를 입력
		
		System.out.print("출석 일자 입력(2022.11.03) : ");
		
		String date = sc.nextLine();
		
		// 이미 입력된 날짜인지 확인
		
		if(checkLogDate(logs, date)) {
			
			printStr("이미 출석 체크한 날짜입니다.");
			
			return;
			
		}
		
		// 출석 상태 정보 출력(결석 : X 출석 : O 지각 : / 조퇴 : \)
		
		printStr("결석 : X 출석 : O 지각 : / 조퇴 : \\");
		
		// StudentLog를 리스트로 생성
		
		ArrayList<StudentLogVer02ByTeacher> stdLogs = new ArrayList<StudentLogVer02ByTeacher>();
		
		// 반복
		
		for(StudentVer02ByTeacher std : stds) {
			
			 // 학생 이름과 생일 출력
			
			System.out.println(std.getName() + "의 생일은 " + std.getBirthday() + "입니다. ");
			
			// 출석 상태 입력
			
			printBar();
			
			System.out.print("출석 상태 (결석 : X 출석 : O 지각 : / 조퇴 : \\) : ");
			
			String state = sc.nextLine();
			
			// StudentLog를 생성
			
			StudentLogVer02ByTeacher stdLog = new StudentLogVer02ByTeacher(std, state);
			
			// StudentLog 리스트에 추가
			
			stdLogs.add(stdLog);
			
		}
		
	  // StudentLog 리스트와 날짜를 이용하여 Log 객체를 생성
		
		LogVer02ByTeacher log = new LogVer02ByTeacher(stdLogs, date);
		
	  // Log 리스트에 생성된 Log 객체를 추가
		
		logs.add(log);
		
	}

	private static boolean checkLogDate(ArrayList<LogVer02ByTeacher> logs, String date) {
		
		if(logs == null || date == null) {
			
			throw new RuntimeException("일지 리스트가 없거나 날짜가 없습니다.");
			
		}
		
		if(logs.size() == 0) {
			
			return false;
			
		}
		
		for(LogVer02ByTeacher log : logs) {
			
			if(log.getDate().equals(date)) {
				
				return true;
				
			}
				
		}
		
		return false;
		
	}
	
	private static void sortLogs(ArrayList<LogVer02ByTeacher> logs) {
		
		// 일지 정렬
		
		if(logs == null || logs.size() == 0) {
			
			return;
			
		}
		
		Collections.sort(logs, (o1, o2) -> o1.getDate().compareTo(o2.getDate()) );
		
	}
	
	private static void printLogsByStudent(ArrayList<LogVer02ByTeacher> logs) {
		
		if(logs == null || logs.size() == 0) {
			
			printStr("등록된 출석 체크가 없습니다.");
			
			return;
			
		}
		
		// 이름을 입력
		
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		printBar();
		
		// 입력받은 이름과 일치하는 출석 체크 목록을 확인
		
		for(LogVer02ByTeacher log : logs) {
			
			for(StudentLogVer02ByTeacher slog : log.getSlogs()) {
				
				if(slog.getStd().getName().equals(name)) {
					
					System.out.println(log.getDate() + "의 " + slog.getStd().getName() + "의 출석 여부는 " + slog.getState() + "입니다.");
					
				}
				
			}
			
		}
		
	}
	
	private static void printLogsByDate(ArrayList<LogVer02ByTeacher> logs) {
		
		// 날짜 입력
		
		System.out.print("날짜 입력 : ");
		
		String date = sc.nextLine();
		
		printBar();
		
		// 날짜와 일치하는 출석 기록 확인
		
		for(LogVer02ByTeacher log : logs) {
			
			if(log.getDate().equals(date)) {
				
				for(StudentLogVer02ByTeacher slog : log.getSlogs()) {
					
					System.out.println(slog.getStd().getName() + "의 생일은 " + slog.getStd().getBirthday() + "이며 " + slog.getStd().getName() + "의 출석 여부는 " + slog.getState() + "입니다.");
					
				}
				
			}
			
		}
		
	}
	
	private static void updateLogs(ArrayList<LogVer02ByTeacher> logs) {
		
		// 날짜 & 이름 & 생년월일 & 상태를 입력
		
		System.out.print("날짜 입력 : ");
		
		String date = sc.nextLine();
		
		printBar();
		
		if(!checkLogDate(logs, date)) {
			
			printStr("해당 일자에 등록된 출석 체크가 없습니다.");
			
			return;
			
		}
		
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		System.out.print("생일 : ");
		
		String birthday = sc.nextLine();
		
		System.out.print("상태 : ");
		
		String state = sc.nextLine();
		
		printBar();
		
		// 입력한 정보와 일치하는 출석 정보 수정
		
		for(LogVer02ByTeacher log : logs) {
			
			if(log.getDate().equals(date)) {
				
				for(StudentLogVer02ByTeacher slog : log.getSlogs()) {
					
					if(slog.getStd().getName().equals(name) && slog.getStd().getBirthday().equals(birthday)) {
						
						slog.setState(state);
						
					}
					
				}
				
				printStr("수정이 완료 되었습니다.");
				
				return;
				
			}
			
		}
		
	}
	
	private static void deleteLogs(ArrayList<LogVer02ByTeacher> logs) {
		
		// 날짜를 입력
		
		System.out.print("날짜 입력 : ");
				
		String date = sc.nextLine();
				
		printBar();
				
		if(!checkLogDate(logs, date)) {
					
			printStr("해당 일자에 등록된 출석 체크가 없습니다.");
					
			return;
					
		}
		
		for(int i = 0; i < logs.size(); i++) {
			
			if(logs.get(i).getDate().equals(date)) {
				
				logs.remove(i);
				
				printStr("삭제가 완료되었습니다.");
				
				return;
				
			}
			
		}
		
	}

}