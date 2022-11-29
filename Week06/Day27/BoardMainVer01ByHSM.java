package Day27;

import java.util.ArrayList;

import java.util.Scanner;

public class BoardMainVer01ByHSM {
	
	// 게시글 관리 프로그램
	
	// 회원가입
	
	// 로그인
	
	// 게시글 등록/수정/삭제 => 회원만 가능
	
	// 카데고리 관리
	
public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int menu = -1;
		
		ArrayList<UserVer01ByHSM> list = new ArrayList<UserVer01ByHSM>();
		
		ArrayList<BoardVer01ByHSM> boardlist = new ArrayList<BoardVer01ByHSM>();
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 :
				
				UserVer01ByHSM insertTemp = inputUser();
				
				insertUser(list, insertTemp);
				
				System.out.println("------------------------");
				
				break;
				
			case 2 :
				
				UserVer01ByHSM user = inputUser();
				
				int index = list.indexOf(user);
				
				if(index == -1) {
					
					System.out.println("------------------------");
					
					System.out.println("입력 정보와 일치하는 학생이 없습니다.");
					
					System.out.println("------------------------");
					
					break;
					
				} 
				
				System.out.println("------------------------");
				
				printSubMenu();
				
				// 서브 메뉴 선택
				
				int subMenu = sc.nextInt();
				
				runSubBoard(boardlist, subMenu);
				
				printCateBoard();
					
				break;
					
			case 3 :
				
				System.out.println("프로그램을 종료합니다.");
				
				break;
				
			default :
				
				System.out.println("메뉴를 잘못 입력했습니다.");
			
				break;
			}
			
		} while (menu != 3);
		
	}
	
	public static void printMenu() {
		
		System.out.println("---------메뉴-------------");
		
		System.out.println("1. 회원 가입");
		
		System.out.println("2. 로그인");
		
		System.out.println("3. 프로그램 종료");
		
		System.out.println("------------------------");
		
		System.out.print("메뉴를 입력하세요 : ");
		
	}
	
	public static UserVer01ByHSM inputUser() {
		
		// 게시글 정보를 입력 (제목, 내용, 작성자)
		
		System.out.println("------------------------");
		
		System.out.print("아이디 : ");
		
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		
		String pw = sc.next();
		
		return new UserVer01ByHSM(id, pw);
		
	}
	
	public static void insertUser(ArrayList<UserVer01ByHSM> list, UserVer01ByHSM user) {
		
		list.add(user);
		
		System.out.println("------------------------");
		
		System.out.println("회원 가입 되었습니다.");
		
	}
	
	public static void printSubMenu() {
		
		System.out.println("---------서브 메뉴-------------");
		
		System.out.println("1. 게시글 작성");
		
		System.out.println("2. 게시글 수정");
		
		System.out.println("3. 게시글 삭제");
		
		System.out.println("------------------------");
		
		System.out.print("서브 메뉴를 입력하세요 : ");
		
	}
	
	public static void runSubBoard(ArrayList<BoardVer01ByHSM> boardlist, int subMenu) {
		
		switch(subMenu) {
		
		case 1 :
			
			sc.nextLine();
			
			BoardVer01ByHSM insertTemp = inputBoard();
			
			insertBoard(boardlist, insertTemp);
			
			break;
			
		case 2 :
			
			System.out.println("------------------------");
			
			// 게시글 번호 입력
			
			System.out.print("수정할 게시글 번호 : ");
			
			int num = sc.nextInt();
			
			// 게시글 번호와 일치하는 게시글을 가져와서 일치하는 게시글이 있으면 제목, 내용을 입력받고
			
			int index = boardlist.indexOf(new BoardVer01ByHSM(num));
			
			if(index == -1) {
				
				System.out.println("일치하는 게시글이 없습니다. ");
				
			}
			
			System.out.println(boardlist.get(index).print());
			
			BoardVer01ByHSM temp = boardlist.get(index);
			
			System.out.println("------------------------");
			
			sc.nextLine();
			
			System.out.print("제목 : ");
			
			String title = sc.nextLine();
			
			System.out.print("내용 : ");
			
			String content = sc.nextLine();
			
			// 입력 받은 제목, 내용으로 게시글 수정
			
			temp.update(title, content);
			
			System.out.println("------------------------");
			
			System.out.println(boardlist.get(index).print());
			
			System.out.println("------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("------------------------");
			
			System.out.println(boardlist);
			
			System.out.println("------------------------");
			
			// 게시글 번호 입력
			
			System.out.print("삭제할 게시글 번호 : ");
			
			int num2 = sc.nextInt();
			
			// 게시글 번호에 맞는 게시글 객체를 생성하여 삭제 (= 게시글 번호를 이용하여 게시글 객체를 생성하여 삭제)
			
			if(boardlist.remove(new BoardVer01ByHSM(num2))) {
				
				System.out.println("------------------------");
				
				System.out.println("게시글이 삭제되었습니다. " );
				
			} else {
				
				System.out.println("일치하는 게시글이 없습니다. ");
				
			}
			
			System.out.println("------------------------");
			
			System.out.println(boardlist);
			
			break;
			
		default :
			
			System.out.println("메뉴를 잘못 입력했습니다.");
			
			break;
		
		}
		
	}
	
	public static BoardVer01ByHSM inputBoard() {
		
		// 게시글 정보를 입력 (제목, 내용, 작성자)
		
		System.out.println("------------------------");
		
		System.out.print("제목 : ");
		
		String title = sc.nextLine();
		
		System.out.print("내용 : ");
		
		String content = sc.nextLine();
		
		System.out.print("작성자 : ");
		
		String writer = sc.next();
		
		// 목록에 게시글 추가
		
		// 게시글 객체 생성 => 목록에 추가
		
		return new BoardVer01ByHSM(title, content, writer);
		
	}
	
	public static void insertBoard(ArrayList<BoardVer01ByHSM> boardlist, BoardVer01ByHSM board) {
		
		// 0번지에 추가하는 이유는 나중에 등록된 게시글이 위로 가게 하기 위해서임.
		
		boardlist.add(0, board);
		
		System.out.println("------------------------");
		
		System.out.println("게시글이 등록되었습니다");
		
		System.out.println("------------------------");
		
	}
	
	public static void printCateBoard() {
		
		System.out.println("---------메뉴-------------");
		
		System.out.println("1. 회원 가입");
		
		System.out.println("2. 로그인");
		
		System.out.println("3. 프로그램 종료");
		
		System.out.println("------------------------");
		
		System.out.print("메뉴를 입력하세요 : ");
		
	}

}