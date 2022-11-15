package Day17;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.Date;

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
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<BoardVer01> list = new ArrayList<BoardVer01>();
		
		int menu = -1;
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 :
				
				insertBoard(list);
				
				break;
				
			case 2 :
				
				BoardVer01 searchtemp = searchBoard(list);
				
				System.out.println("검색한 회원 정보는 : " + searchtemp);
				
				break;
				
			case 3 :
				
				System.out.println("수정하는 메소드입니다.");
				
				break;
				
			case 4 :
				
				System.out.println("삭제하는 메소드입니다.");
				
				break;
				
			case 5 :
				
				System.out.println("시스템을 종료합니다.");
				
				break;
				
			default :
				
				System.out.println("잘못된 메뉴를 입력했습니다.");
				
				break;
			
			}
			
		} while (menu != 5);
		

	}

	private static void printMenu() {
		
		System.out.println("--------메뉴-----------");
		
		System.out.println("1. 게시글 작성");
		
		System.out.println("2. 게시글 조회");
		
		System.out.println("3. 게시글 수정");
		
		System.out.println("4. 게시글 삭제");
		
		System.out.println("5. 프로그램 종료");
		
		System.out.println("---------------------");
		
		System.out.print("메뉴 선택 : ");
		
	}
	
	public static boolean insertBoard(ArrayList<BoardVer01> list) {
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println("---------------------");
		
		System.out.println("게시글을 입력하세요");
		
		System.out.println("---------------------");
		
		System.out.print("제목 입력 : ");
		
		String title = sc.next();
		
		//sc.nextLine();
		
		System.out.print("내용 입력 : ");
		
		String content = sc.next();
		
		System.out.print("작성자 입력 : ");
		
		String writer = sc.next();
		
		String createDate = sdf.format(date);
		
		BoardVer01 member = new BoardVer01(title, content, writer, createDate);
		
		list.add(member);
		
		System.out.println(list.toString());
		
		return true;
		
	}
	
	public static BoardVer01 searchBoard(ArrayList<BoardVer01> list) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------");
		
		System.out.print("제목 : ");
		
		String title = sc.next();
		
		BoardVer01 member = new BoardVer01(title);
		
		// 회원 리스트에서 아이디가 같은 회원 정보를 가져옴 => 가져온 회원 정보의 비밀번호와 입력한 비밀번호를 비교하여 일치하면 회원 정보를 보여주지만 다르면 종료한다.
		
		int index = list.indexOf(member);
		
		if(index == -1) {
			
			return null;
			
		} 
		
		BoardVer01 temp = list.get(index);
		
		if(!temp.getTitle().equals(member.getTitle())) {
			
			return null;
			
		} 
		
		return temp;
		
	}

}