package Day30;

import java.util.*;

public class BoardMainVer01ByTeacher {
	
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
	
	private static Scanner sc = new Scanner(System.in);
	
	private static ArrayList<BoardVer01ByTeacher> boardList = new ArrayList<BoardVer01ByTeacher>();
	
	public static void main(String [] args) {
		
		// 메뉴를 출력하고,
		
		// 메뉴를 입력받아 입력한 메뉴가 프로그램 종료가 아니면 반복하는 코드를 작성
		
		int menu = -1;
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
			
		} while(menu != 6);
	}
	
	public static void printMenu() {
		
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
	
	// 메뉴가 주어지면 주어진 메뉴에 맞는 기능을 출력하는 메소드
	
	public static void runMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("--------------------------------");
			
			insertBoard();
			
			System.out.println("--------------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("--------------------------------");
			
			System.out.println("게시글을 수정하는 기능");
			
			System.out.println("--------------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("--------------------------------");
			
			System.out.println("게시글을 삭제하는 기능");
			
			System.out.println("--------------------------------");
			
			break;
			
		case 4 :
			
			System.out.println("--------------------------------");
			
			System.out.println("게시글 목록을 조회하는 기능");
			
			System.out.println("--------------------------------");
			
			break;
			
		case 5 :
			
			System.out.println("--------------------------------");
			
			System.out.println("게시글을 확인하는 기능");
			
			System.out.println("--------------------------------");
			
			break;
			
		case 6 :
			
			System.out.println("--------------------------------");
			
			System.out.println("프로그램을 종료합니다.");
			
			System.out.println("--------------------------------");
			
			break;
			
		default :
			
			System.out.println("--------------------------------");
			
			System.out.println("메인 메뉴를 잘못 입력했습니다.");
			
			System.out.println("--------------------------------");
			
			break;
		
		}
		
	}
	
	public static void insertBoard() {
		
		System.out.print("번호를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("제목을 입력하십시오 : ");
		
		String title = sc.nextLine();
		
		System.out.print("작성자를 입력하세요 : ");
		
		String writer = sc.nextLine();
		
		System.out.print("내용을 입력하세요 : ");
		
		String content = sc.nextLine();
		
		BoardVer01ByTeacher board = new BoardVer01ByTeacher(num, title, content, writer);
		
		if(boardList.contains(board)) {
			
			System.out.println("----------------------");
			
			System.out.println("이미 등록된 게시글 번호입니다.");
			
			System.out.println("-----------------------");
			
			return;
			
		}
		
		boardList.add(board);
		
		System.out.println("--------------------------------------");
		
		System.out.println("게시글이 성공적으로 등록이 되었습니다.");
		
		System.out.println("---------------------------------------");
		
	}

}