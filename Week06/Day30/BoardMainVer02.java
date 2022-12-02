package Day30;

import java.util.*;

public class BoardMainVer02 {
	
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
	
	private static ArrayList<BoardVer02> boardList = new ArrayList<BoardVer02>();
	
	private static ArrayList<CommentVer01> commentList = new ArrayList<CommentVer01>();
	
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
			
			updateBoardList();
			
			System.out.println("--------------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("--------------------------------");
			
			deleteBoardList();
			
			System.out.println("--------------------------------");
			
			break;
			
		case 4 :
			
			System.out.println("--------------------------------");
			
			printBoardList();
			
			System.out.println("--------------------------------");
			
			break;
			
		case 5 :
			
			System.out.println("--------------------------------");
			
			printBoard();
			
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
		
		int num = inputBoardNum();
		
		BoardVer02 board = inputBoard(num);
		
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
	
	public static int inputBoardNum() {
		
		System.out.println("---------------------------------------");
		
		System.out.print("번호를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		System.out.println("---------------------------------------");
		
		return num;
		
	}
	
	public static BoardVer02 inputBoard(int num) {
		
		sc.nextLine();
		
		System.out.println("---------------------------------------");
		
		System.out.print("제목을 입력하세요 : ");
		
		String title = sc.nextLine();
		
		System.out.print("내용을 입력하세요 : ");
		
		String content = sc.nextLine();
		
		System.out.print("작성자를 입력하세요 : ");
		
		String writer = sc.nextLine();
		
		System.out.println("---------------------------------------");
		
		return new BoardVer02(num, title, content, writer);
		
	}
	
	public static Boolean updateBoard(BoardVer02 board) {
		
		if(boardList.size() == 0) {
			
			return false;
			
		}
		
		int index = boardList.indexOf(board);
		
		if(index == -1) {
			
			return false;
			
		}
		
		boardList.set(index, board); // 중요함.. boardList에서 변경하는것 set 함수임
		
		return true;
		
	}
	
	public static void updateBoardList() {
		
		int num = inputBoardNum(); // 수정할 게시글 번호를 입력을 받는다 (OK)
		
		BoardVer02 board = inputBoard(num); // 입력 받은 수정 게시글 번호에 해당되는 수정한 내용을 board 객체에 담는다 (OK)
		
		if(updateBoard(board)) { // 수정한 내용이 담긴 board 객체를 boardList의 index번호의 해당 내용을 변경한다. (OK)
			
			System.out.println("----------------------------");
			
			System.out.println("성공적으로 게시글이 수정이 되었습니다.");
			
			System.out.println("-----------------------------");
			
		} else {
			
			System.out.println("-----------------------------");
			
			System.out.println("게시글 수정이 실패하였습니다.");
			
			System.out.println("-----------------------------");
			
		}
		
	}
	
	public static boolean deleteBoard(int num) {
		
		num = inputBoardNum();
		
		int index = boardList.indexOf(new BoardVer02(num));
		
		if(index == -1) {
			
			return false;
			
		}
		
		boardList.remove(index);
		
		return true;
		
	}
	
	public static void deleteBoardList() {
		
		int num = inputBoardNum();
		
		if(deleteBoard(num)) {
			
		System.out.println("----------------------------");
		
		System.out.println("성공적으로 게시글이 삭제가 되었습니다.");
		
		System.out.println("-----------------------------");
		
		} else {
		
		System.out.println("-----------------------------");
		
		System.out.println("게시글 삭제가 실패하였습니다.");
		
		System.out.println("-----------------------------");
		
		}
		
	}
	
	public static void printBoardList() {
		
		boardList.forEach(b -> System.out.println(b));
		
	}
	
	public static void printBoard() {
		
		System.out.println("-----------------------------");
		
		int num = inputBoardNum();
		
		BoardVer02 board = new BoardVer02(num);
		
		int index = boardList.indexOf(board);
		
		if(index == -1) {
			
			System.out.println("-----------------------------");
			
			System.out.println("등록된 게시글이 없습니다.");
			
			System.out.println("-----------------------------");
			
			return;
			
		}
		
		System.out.println("-----------------------------");
		
		board = boardList.get(index);
		
		board.print();
		
		System.out.println("-----------------------------");
		
		int subMenu = -1;
		
		do {
			
			printSubMenu();
			
			subMenu = sc.nextInt();
			
			runPrintSubMenu(subMenu, num);
			
		} while(subMenu != 3);
		
	}
	
	public static void printSubMenu() {
		
		System.out.println("-------------------출력 서브 메뉴--------------------");
		
		System.out.println("1. 댓글 등록");
		
		System.out.println("2. 댓글 확인");
		
		System.out.println("3. 이전");
		
		System.out.println("--------------------------------------------------");
		
		System.out.print("출력 서브 메뉴를 입력하세요 : ");
		
	}
	
	public static void runPrintSubMenu(int subMenu, int boardNum) {
		
		switch(subMenu) {
		
		case 1 : 
			
			System.out.println("---------------------------------------");
			
			insertCommentList(boardNum);
			
			System.out.println("---------------------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("---------------------------------------");
			
			printCommentList(boardNum);
			
			System.out.println("---------------------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("---------------------------------------");
			
			System.out.println("메인 메뉴로 돌아갑니다.");
			
			System.out.println("---------------------------------------");
			
			break;
			
		default :
			
			System.out.println("---------------------------------------");
			
			System.out.println("출력 관련 메뉴를 잘못 입력했습니다.");
			
			System.out.println("---------------------------------------");
			
			break;
		
		}

	}
	
	public static boolean insertComment(CommentVer01 comment) {
		
		int index = commentList.indexOf(comment);
		
		if(index != -1) {
			
			return false;
			
		}
		
		commentList.add(comment);
		
		return true;
		
	}
	
	public static void insertCommentList(int boardNum) {
		
		System.out.println("-----------------------------");
		
		int num = inputBoardNum();
		
		sc.nextLine();
		
		System.out.print("댓글 정보를 입력하세요 : ");
		
		String content = sc.nextLine();
		
		System.out.print("작성자를 입력하세요 : ");
		
		String writer = sc.nextLine();
		
		CommentVer01 comment = new CommentVer01(num, content, writer, boardNum);
		
		if(insertComment(comment)) {
			
			System.out.println("-------------------------------------------");
			
			System.out.println("성공적으로 댓글이 추가가 되었습니다.");
			
			System.out.println("----------------------------------------------");
			
			return;
			
		} else {
			
			System.out.println("-------------------------------------------");
			
			System.out.println("이미 등록된 댓글 번호입니다.");
			
			System.out.println("----------------------------------------------");
			
			return;
			
		}
		
	}
	
	public static void printCommentList(int boardNum) {
		
		if(commentList.size() == 0) {
			
			System.out.println("---------------------------------------");
			
			System.out.println("등록된 댓글이 없습니다.");
			
			System.out.println("-----------------------------------------");
			
			return;
			
		}
		
	   // int count = 0;
	    
	    commentList.forEach(c -> { if(c.getBoardNum() == boardNum) {
	    	
	    	System.out.println(c);
	    	
	    	//count = count + 1;
	    	
	    	}
	    	
	    });
		
	}
	
}