package Day17;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardManagerMainVer01 {
	
			// 게시글 관리 프로그램을 작성하세요.
	
			// 1. 게시글 작성
			// 2. 게시글 조회
			// 3. 게시글 수정
			// 4. 게시글 삭제
			// 5. 프로그램 종료
			
			// 게시글은 번호, 제목, 내용, 작성자, 작성일, 조회수로 구성
			
			// 게시글 전체 조회는 나중에 작성된 게시글이 상단부에 조회
			// 게시글 상세 조회는 게시글 번호를 입력하여 게시글 내용을 확인
			// 게시글 상세 조회를 하면 조회수가 1 증가
			
			// 게시글 수정은 게시글 번호를 선택하면 해당 게시글의 제목, 내용을 수정
			
			// 게시글 삭제는 게시글 번호를 선택하면 해당 게시글을 삭제 
			
			// 1. 게시글 클래스를 만든다.
			
			// 2. 메뉴 순으로 작성한다 (printMenu를 만든다.)
			
			// 3. 각각 기능에 맞는 메소드를 만든다.
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int menu = -1;
		
		ArrayList<BoardVer01> list = new ArrayList<BoardVer01>();
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 :
				
				sc.nextLine();
				
				// 콘솔에서 입력받아 게시글 생성
				
				BoardVer01 insertTemp = inputBoard();
				
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
				
				int index = list.indexOf(new BoardVer01(num));
				
				if(index == -1) {
					
					printStr("일치하는 게시글이 없습니다. ");
					
					continue;
					
				}
				
				BoardVer01 temp = list.get(index);
				
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
				
				if(list.remove(new BoardVer01(num2))) {
					
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
	
	public static void insertBoard(ArrayList<BoardVer01> list, BoardVer01 board) {
		
		// 0번지에 추가하는 이유는 나중에 등록된 게시글이 위로 가게 하기 위해서임.
		
		list.add(0, board);
		
		printStr("게시글이 등록되었습니다");
		
	}
	
	public static BoardVer01 inputBoard() {
		
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
		
		return new BoardVer01(title, content, writer);
		
	}
	
	public static void printAll(ArrayList<BoardVer01> list) {
		
		if(list == null || list.size() == 0) {
			
			printStr("등록된 게시글이 없습니다. ");
			
			return;
			
		}
		
		// 전체 조회
		
		System.out.println("------------------------");
		
		for(BoardVer01 temp : list) {
			
			System.out.println(temp);
			
		}
		
	}
	
	public static void printDetail(ArrayList<BoardVer01> list, int num) {
		
		int index = list.indexOf(new BoardVer01(num));
		
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
	
	public static void runSubBoard(ArrayList<BoardVer01> list, int subMenu) {
		
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