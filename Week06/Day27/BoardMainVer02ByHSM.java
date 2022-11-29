package Day27;

import java.util.ArrayList;

import java.util.Scanner;


public class BoardMainVer02ByHSM {
	
	// 게시글 관리 프로그램
	
	// 회원가입
	
	// 로그인
	
	// 게시글 등록/수정/삭제 => 회원만 가능
	
	// 카데고리 관리
	
public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int menu = -1;
		
		ArrayList<BoardVer01ByHSM> list = new ArrayList<BoardVer01ByHSM>();
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 :
				
				sc.nextLine();
				
				// 콘솔에서 입력받아 게시글 생성
				
				BoardVer01ByHSM insertTemp = inputBoard();
				
				// 게시글을 목록에 추가
				
				insertBoard(list, insertTemp);
				
				break;
				
			case 2 :
				
				printSubMenu();
				
				// 서브 메뉴 선택
				
				int subMenu = sc.nextInt();
				
				// 서브 메뉴에 따른 기능 실행
				
				runSubBoard(list, subMenu);
					
				break;
					
			case 3 :
				
				System.out.println("------------------------");
				
				// 게시글 번호 입력
				
				System.out.print("수정할 게시글 번호 : ");
				
				int num = sc.nextInt();
				
				// 게시글 번호와 일치하는 게시글을 가져와서 일치하는 게시글이 있으면 제목, 내용을 입력받고
				
				int index = list.indexOf(new BoardVer01ByHSM(num));
				
				if(index == -1) {
					
					printStr("일치하는 게시글이 없습니다. ");
					
					continue;
					
				}
				
				BoardVer01ByHSM temp = list.get(index);
				
				System.out.println("------------------------");
				
				sc.nextLine();
				
				System.out.print("제목 : ");
				
				String title = sc.nextLine();
				
				System.out.print("내용 : ");
				
				String content = sc.nextLine();
				
				// 입력 받은 제목, 내용으로 게시글 수정
				
				temp.update(title, content);
				
				break;
				
			case 4 :
				
				System.out.println("------------------------");
				
				// 게시글 번호 입력
				
				System.out.print("삭제할 게시글 번호 : ");
				
				int num2 = sc.nextInt();
				
				// 게시글 번호에 맞는 게시글 객체를 생성하여 삭제 (= 게시글 번호를 이용하여 게시글 객체를 생성하여 삭제)
				
				if(list.remove(new BoardVer01ByHSM(num2))) {
					
					printStr("게시글이 삭제되었습니다. " );
					
				} else {
					
					printStr("일치하는 게시글이 없습니다. ");
					
				}
				
				break;
				
			case 5 :
				
				printStr("프로그램을 종료합니다.");
				
				break;
				
			default :
				
				printStr("메뉴를 잘못 입력했습니다.");
			
				break;
			}
			
		} while (menu != 5);
		
	}
	
	public static void printMenu() {
		
		System.out.println("---------메뉴-------------");
		
		System.out.println("1. 게시글 작성");
		
		System.out.println("2. 게시글 조회");
		
		System.out.println("3. 게시글 수정");
		
		System.out.println("4. 게시글 삭제");
		
		System.out.println("5. 프로그램 종료");
		
		System.out.println("------------------------");
		
		System.out.print("메뉴를 입력하세요 : ");
		
	}
	
	public static void printSubMenu() {
		
		// 서브 메뉴 출력
		
		System.out.println("------------------------");
		
		System.out.println("-------조회 메뉴--------------");
		
		System.out.println("1. 전체 조회 ");
		
		System.out.println("2. 상세 조회 ");
		
		System.out.println("------------------------");
		
		System.out.print("메뉴 선택 : ");
		
	}
	
	public static void printStr(String str) {
		
		System.out.println("------------------------");
		
		System.out.println(str);
		
		System.out.println("------------------------");
		
	}
	
	public static void insertBoard(ArrayList<BoardVer01ByHSM> list, BoardVer01ByHSM board) {
		
		// 0번지에 추가하는 이유는 나중에 등록된 게시글이 위로 가게 하기 위해서임.
		
		list.add(0, board);
		
		printStr("게시글이 등록되었습니다");
		
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
	
	public static void printAll(ArrayList<BoardVer01ByHSM> list) {
		
		if(list == null || list.size() == 0) {
			
			printStr("등록된 게시글이 없습니다. ");
			
			return;
			
		}
		
		// 전체 조회
		
		System.out.println("------------------------");
		
		for(BoardVer01ByHSM temp : list) {
			
			System.out.println(temp);
			
		}
		
	}
	
	public static void printDetail(ArrayList<BoardVer01ByHSM> list, int num) {
		
		int index = list.indexOf(new BoardVer01ByHSM(num));
		
		if(index == -1) {
			
			System.out.println("------------------------");
			
			printStr("없는 게시글 번호입니다.");
			
			return;
			
		}
		
		// 게시글 조회수 증가
		
		list.get(index).updateView();
		
		// 게시글 출력
		
		System.out.println(list.get(index).print());
		
	}
	
	public static void runSubBoard(ArrayList<BoardVer01ByHSM> list, int subMenu) {
		
		switch(subMenu) {
		
		case 1 :
			
			printAll(list);
			
			break;
			
		case 2 :
			
			// 상세 조회
			
			System.out.println("------------------------");
			
			// 번호 입력
			
			System.out.print("게시글 번호 : ");
			
			int num = sc.nextInt();
			
			System.out.println("------------------------");
			
			// 해당 번호와 맞는 게시글 조회
			
			printDetail(list, num);
			
		}
		
	}

}