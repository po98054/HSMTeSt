package Day28;

import java.util.*;

public class BoardMainVer01ByHSM {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int menu = -1;
		
		ArrayList<UserVer01ByHSM> userList = new ArrayList<UserVer01ByHSM>();
		
		ArrayList<BoardVer01ByHSM> boardList = new ArrayList<BoardVer01ByHSM>();
		
		ArrayList<CateBoardVer01ByHSM> cateList = new ArrayList<CateBoardVer01ByHSM>();
		
		do {
			
			printMainMenu();
			
			menu = sc.nextInt();
			
			runMainMenu(menu, userList, boardList, cateList);
			
		} while(menu != 3);
		
	}

	public static void printMainMenu() {
		
		System.out.println("------------------메인 메뉴-----------------------");
		
		System.out.println("1. 회원가입");
		
		System.out.println("2. 로그인");
		
		System.out.println("3. 프로그램 종료");
		
		System.out.println("------------------------------------------------");
		
		System.out.print("메인 메뉴를 입력하세요 : ");
		
	}
	
	public static void runMainMenu(int menu, ArrayList<UserVer01ByHSM> userList, ArrayList<BoardVer01ByHSM> boardList, ArrayList<CateBoardVer01ByHSM> cateList) {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("---------------------------");
			
			signUp(userList);
			
			System.out.println("---------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("---------------------------");
			
			Login(userList, boardList, cateList);
			
			System.out.println("---------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("---------------------------");
			
			System.out.println("프로그램을 종료합니다.");
			
			System.out.println("---------------------------");
			
			break;
			
		default :
			
			System.out.println("---------------------------");
			
			System.out.println("메인 메뉴를 잘못 입력했습니다.");
			
			System.out.println("---------------------------");
			
			break;
		
		}
		
	}

	public static void signUp(ArrayList<UserVer01ByHSM> userList) {
		
		System.out.print("아이디를 입력하세요 : ");
		
		String id = sc.next();
		
		System.out.print("비밀번호를 입력하세요 : ");
		
		String pw = sc.next();
		
		UserVer01ByHSM user = new UserVer01ByHSM(id, pw);
		
		userList.add(user);
		
		System.out.println("------------------------------");
		
		System.out.println("회원가입이 완료 되었습니다.");
		
		System.out.println("---------------------------------");
		
	}
	
	public static void Login(ArrayList<UserVer01ByHSM> userList, ArrayList<BoardVer01ByHSM> boardList, ArrayList<CateBoardVer01ByHSM> cateList) {
		
		System.out.print("아이디를 입력하세요 : ");
		
		String id = sc.next();
		
		System.out.print("비밀번호를 입력하세요 : ");
		
		String pw = sc.next();
		
		UserVer01ByHSM user = new UserVer01ByHSM(id, pw);
		
		int index = userList.indexOf(user);
		
		if(index == -1) {
			
			System.out.println("-----------------------");
			
			System.out.println("회원 목록에 없습니다.");
			
			System.out.println("------------------------");
			
			return;
			
		}
		
		if(index == 0) {
			
			System.out.println("------------------------");
			
			System.out.println("관리자입니다.");
			
			System.out.println("---------------------------");
			
			insertCate(cateList);
			
			return;
			
			
		}
		
		System.out.println("---------------------------");
		
		System.out.println("로그인에 성공했습니다.");
		
		System.out.println("---------------------------");
		
		printSubMenu();
		
		int subMenu = sc.nextInt();
		
		runSubMenu(boardList, subMenu, cateList);
		
	}

	public static void printSubMenu() {
		
		System.out.println("---------------서브 메뉴--------------------");
		
		System.out.println("1. 게시글 등록");
		
		System.out.println("2. 게시글 수정");
		
		System.out.println("3. 게시글 삭제");
		
		System.out.println("4. 카데고리 게시판");
		
		System.out.println("----------------------------------------");
		
		System.out.print("서브 메뉴를 입력하세요 : ");
		
	}
	
	public static void runSubMenu(ArrayList<BoardVer01ByHSM> boardList, int subMenu, ArrayList<CateBoardVer01ByHSM> cateList) {
		
		switch(subMenu) {
		
		case 1 :
			
			System.out.println("---------------------------");
			
			sc.nextLine();
			
			System.out.print("제목을 입력하세요 : ");
			
			String title = sc.nextLine();
			
			System.out.print("내용을 입력하세요 : ");
			
			String content = sc.nextLine();
			
			System.out.print("작성자를 입력하세요 : ");
			
			String author = sc.nextLine();
			
			BoardVer01ByHSM board = new BoardVer01ByHSM(title, content, author);
			
			boardList.add(board);
			
			System.out.println(board);
			
			System.out.println(boardList);
			
			System.out.println("---------------------------");
			
			break;
			
		case 2 :
			
			System.out.print("게시글 번호를 입력하세요 : ");
			
			int num = sc.nextInt();
			
			int index = boardList.indexOf(new BoardVer01ByHSM(num));
			
			if(index == -1) {
				
				System.out.println("-----------------------------");
				
				System.out.println("검색글이 게시글 목록에 없습니다.");
				
				System.out.println("--------------------------------");
				
			}
			
			BoardVer01ByHSM temp = boardList.get(index); // 게시글 번호에 해당되는 글을 가져와서 임시로 객체를 생성한다.
			
			System.out.println(boardList.get(index).toString());
			
			System.out.println("---------------------------");
			
			sc.nextLine();
			
			System.out.print("제목을 입력하세요 : ");
			
			title = sc.nextLine();
			
			System.out.print("내용을 입력하세요 : ");
			
			content = sc.nextLine();
			
			temp.update(title, content);
			
			System.out.println(boardList.get(index).toString());
			
			break;
			
		case 3 :
			
			System.out.println("---------------------------");
			
			System.out.print("게시글 번호를 입력하세요 : ");
			
			num = sc.nextInt();
			
			index = boardList.indexOf(new BoardVer01ByHSM(num));
			
			if(index == -1) {
				
				System.out.println("-----------------------------");
				
				System.out.println("검색글이 게시글 목록에 없습니다.");
				
				System.out.println("--------------------------------");
				
			}
			
			System.out.println(boardList.get(index).toString());
			
			boardList.remove(index);
			
			System.out.println("삭제에 성공했습니다.");
			
			System.out.println(boardList.toString());
			
			System.out.println("---------------------------");
			
			break;
			
		case 4 :
			
			printCateMenu(cateList);
			
			break;
			
		default :
			
			System.out.println("---------------------------");
			
			System.out.println("서브메뉴를 잘못 입력했습니다.");
			
			System.out.println("---------------------------");
			
			break;
		
		}
		
	}

	public static void printCateMenu(ArrayList<CateBoardVer01ByHSM> cateList) {
		
		System.out.println("------------카데고리 메뉴-----------------");
		
		System.out.println(cateList.toString());
		
		System.out.println("---------------------------------------");
		
	}
	
	public static void insertCate(ArrayList<CateBoardVer01ByHSM> cateList) {
		
		System.out.print("게시판 이름을 입력하세요 : ");
		
		String name = sc.nextLine();
		
		CateBoardVer01ByHSM cate = new CateBoardVer01ByHSM(name);
		
		cateList.add(cate);
		
	}
	
}