package Day29;

import java.util.Scanner;

public class BoardMainVer02ByHSM {
	
	// 기능
	
	// 게시글 등록
	
	// 게시글 수정
	
	// 게시글 삭제
	
	// 게시글 목록
	
	// 게시글 확인
	
	   // 댓글 등록
	
	  // 댓글 확인
	
	 // 이전
	
   // 프로그램 종료
	
	// 메소드
	
	// 메뉴를 출력하는 메소드
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		// 메뉴를 출력하고, 입력한 메뉴가 프로그램 종료가 아니면 반복하는 코드를 작성
		
		int menu = -1;
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
		} while(menu != 6);
	}
	
	private static void printMenu() {
		
		System.out.println("-----메인 메뉴--------------------");
		
		System.out.println("1. 게시글 등록");
		
		System.out.println("2. 게시글 수정");
		
		System.out.println("3. 게시글 삭제");
		
		System.out.println("4. 게시글 목록");
		
		System.out.println("5. 게시글 확인");
		
		System.out.println("6. 프로그램 종료");
		
		System.out.println("---------------------------------");
		
		System.out.print("메인 메뉴를 입력하세요 : ");
		
	}

}