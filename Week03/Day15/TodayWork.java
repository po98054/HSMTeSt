package Day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TodayWork {
	
	// 리스트를 이용하여 다음 기능을 갖는 오늘의 할일 프로그램을 작성하세요.
	
	public static void main (String[] ars) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> work = new ArrayList<String>();
		
		int menu = -1;
		
		//반복
		
		do {
			
			// 메뉴 출력
			
			printMenu();
			
			try {
			
			// 메뉴 선택
			
			menu = scan.nextInt();
			
			// 선택한 메뉴에 따른 기능 실행
			
			runMenu(menu, work);
			
			} catch(InputMismatchException e) {
				
				System.out.println("-------------");
				
				System.out.println("예외 발생 : 정수를 입력하세요");
				
				System.out.println("-------------");
				
				scan.nextLine();
				
			} catch(Exception e) {
				
				System.out.println("-------------");
				
				System.out.println(e.getMessage());
				
				System.out.println("-------------");
				
			}
		
	} while(menu != 4);
		
  }
	
	private static void printMenu() {
		
		System.out.println("------메뉴-----");
		
		System.out.println("1. 할일 추가");
		
		System.out.println("2. 할일 확인");
		
		System.out.println("3. 할일 삭제");
		
		System.out.println("4. 프로그램 종료");
		
		System.out.println("--------------");
		
		System.out.print("메뉴 선택 : ");
		
	}
	
	private static void runMenu(int menu, ArrayList<String> work) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 1;

		switch(menu) {
		
		case 1 :
			
			System.out.print("금일의 할일 : ");
			
			String temp = scan.nextLine();
			
			int index = work.indexOf(temp);
			
			if(index == -1) {
				
				work.add(temp);
				
			}
			
			break;
			
		case 2 :
	    	 
	    	 printTodoList(work);
	    	 
	        break;
	        
		case 3 :
			
			printTodoList(work);
			
			System.out.print("삭제할 할일 번호 선택 : ");
			
			int num = scan.nextInt() - 1;
			
			// 잘못된 번호를 입력한 경우
			
			if(num < 0 || num >= work.size()) {
				
				throw new Exception("예외 발생 : 삭제할 번호를 잘못 입력했습니다.");
				
			}
			
			work.remove(num);
			
			System.out.println((num+1) + "번 할일이 삭제되었습니다.");
			
			printTodoList(work);
			
			break;
	    	 
	    	 
		case 4 :
				
				System.out.println("프로그램 종료");
				
				break;
				
				
		default :
				
				throw new Exception("예외 발생 : 잘못된 메뉴입니다.");
				
			}
		
	}
	
    private static void printTodoList(ArrayList<String> work) {
    	
    	if(work == null || work.size() == 0) {
    		
    		System.out.println("저장된 할 일이 없습니다.");
    		
    		return;
    		
    	}
    	
    	for (int i = 0; i < work.size(); i++) {
    		
    		System.out.println((i + 1) + ". " + work.get(i));
    		
    	}
	}
		
}