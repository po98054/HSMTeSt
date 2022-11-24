package Day24;

import java.io.*;

import java.util.*;

public class StudentMainVer01ByTeacher {
	
	// 학생 정보를 관리하는 프로그램을 작성하세요.
	
	// 1. 학생 추가(이름, 학년, 반, 번호)
	
	// 2. 학생 출력
	
	// 3. 종료
	
	// 프로그램 시작 전 학생 정보를 읽어오는 기능 추가 (load)
	
	// 프로그램 종료 전 학생 정보를 저장하는 기증 추가 (save)
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String fileName = "student.txt";
		
		int menu = -1;
		
		ArrayList<StudentVer01ByTeacher> list = new ArrayList<StudentVer01ByTeacher>();
		
		load(list, fileName);
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			printBar();
			
			runMenu(menu, list);
			
		} while(menu != 3);
		
		save(list, fileName);
		
	}
	
	private static void load(ArrayList<StudentVer01ByTeacher> list, String fileName) {
		
		if(list == null) {
			
			throw new RuntimeException("예외 발생 : 학생을 관리할 리스트가 생성되지 않았습니다.");
			
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			
			while(true) {
				
				StudentVer01ByTeacher std = (StudentVer01ByTeacher) ois.readObject();
				
				list.add(std);
				
			}
			
		} catch (FileNotFoundException e) {
			
			printStr(fileName + "이 없어서 불러오기에 실패했습니다.");
			
			printBar();
			
		} catch(EOFException e) {
			
			printStr("불러오기 완료");
			
		    printBar();
			
		} catch (Exception e) {
			
			printStr("불러오기 실패");
			
			printBar();
			
		}
		
	}

	private static void printStr(String str) {
		
		System.out.println(str);
		
		printBar();
		
	}
	
	private static void printBar() {
		
		System.out.println("------------------------");
		
	}

	private static void printMenu() {
		
		System.out.println("-----------메인 메뉴-------------");
		
		System.out.println("1. 학생 추가");
		
		System.out.println("2. 학생 출력");
		
		System.out.println("3. 종료");
		
		System.out.println("------------------------------");
		
		System.out.print("메인 메뉴를 선택하세요 : ");
		
	}
	
	private static void runMenu(int menu, ArrayList<StudentVer01ByTeacher> list) {
		
		switch(menu) {
		
		case 1 :
			
			printBar();
			
			addStudent(list);
			
			break;
			
		case 2 : 
			
			printBar();
			
			printStudent(list);
			
			break;
			
		case 3 :
			
			printStr("시스템을 종료합니다.");
			
			break;
			
		default :
			
			printStr("메뉴를 잘못 입력했습니다.");
			
			break;
		}
		
	}

	private static void addStudent(ArrayList<StudentVer01ByTeacher> list) {
		
		if(list == null) {
			
			throw new RuntimeException("예외 발생 : 학생을 관리할 리스트가 생성되지 않았습니다.");
			
		}
		
		System.out.println("학생 정보를 입력하세요");
		
		printBar();
		
		System.out.print("이름 : ");
		
		String name = sc.next();
		
		System.out.print("학년 : ");
		
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		
		int ban = sc.nextInt();
		
		System.out.print("번호 : ");
		
		int bunho = sc.nextInt();
		
		printBar();
		
		StudentVer01ByTeacher std = new StudentVer01ByTeacher(name, grade, ban, bunho);
		
		list.add(std);
		
		printStr("학생 정보 추가가 완료되었습니다.");
		
	}
	
	private static void printStudent(ArrayList<StudentVer01ByTeacher> list) {
		
		if(list == null) {
			
			throw new RuntimeException("예외 발생 : 학생을 관리할 리스트가 생성되지 않았습니다.");
			
		}
		
		if(list.size() == 0) {
			
			printStr("학생 정보가 없습니다.");
			
			printBar();
			
			return;
			
		}
		
		// 1번 방법

		printStr("일반 For문으로 출력하는 방식");
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println((i + 1) + "번 학생의 정보는 " + list.get(i));
			
		}
		
		printBar();
		
		// 2번 방법
		
		printStr("향상된 For문으로 출력하는 방식");
		
		for(StudentVer01ByTeacher std : list) {
			
			System.out.println(std);
			
		}
		
		printBar();
		
	}
	
	private static void save(ArrayList<StudentVer01ByTeacher> list, String fileName) {
		
		if(list == null) {
			
			throw new RuntimeException("예외 발생 : 학생을 관리할 리스트가 생성되지 않았습니다.");
			
		}
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			
			for(StudentVer01ByTeacher std : list) {
				
				oos.writeObject(std);
				
			}
			
			printStr("저장했습니다.");
			
			printBar();
			
		} catch (FileNotFoundException e) {
			
			printStr(fileName + "을 생성할 수 없어서 저장에 실패했습니다.");
			
			printBar();
			
		} catch (IOException e) {
			
			printStr("저장에 실패했습니다.");
			
			printBar();
			
		}
		
	}

}