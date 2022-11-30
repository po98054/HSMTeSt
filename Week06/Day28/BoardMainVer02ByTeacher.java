package Day28;

import java.util.*;

public class BoardMainVer02ByTeacher {
	
			// 기능 1
	
			// 회원 관리
			
			  // 로그인
			
			  // 회원 가입
			
			// 게시글 관리
	
	         // 게시글 등록 (회원만 등록)
	
	         // 게시글 수정 (회원 + 작성자 본인)
	
	         // 게시글 목록 (모든이)
	
	            // 게시글 검색 (검색 번호는 게시글 번호로)
	
	            // 게시글 확인
	
	         // 게시글 삭제 (회원 + 작성자 본인)
	
	       // 카테고리 관리 (회원 + 관리자만)
	
	         // 카테고리 추가
	
	         // 카테고리 수정
	
	         // 카테고리 삭제
			
			// 종료
	
	private static Scanner sc = new Scanner(System.in);
	
	private static List<UserVer02ByTeacher> memberList = new ArrayList<UserVer02ByTeacher>();
	
	private static List<Object> boardList = new ArrayList<Object>();
	
	private static List<String> categoryList = Arrays.asList("공지", "자유");
	
	private static UserVer02ByTeacher user;
	
	public static void main(String[] args) {
		
		int MainMenu = -1;
		
		do {
			
			try {
				
				printMainMenu();
				
				MainMenu = sc.nextInt();
				
				sc.nextLine();
				
				runMainMenu(MainMenu);
				
			} catch(InputMismatchException e) {
				
				sc.nextLine();
				
				System.out.println("-------------------------------");
				
				System.out.println("숫자를 입력하세요.");
				
				System.out.println("-------------------------------");
				
			} catch(Exception e) {
				
				System.out.println("----------------------------");
				
				System.out.println(e.getMessage());
				
				System.out.println("----------------------------");
				
			}
			
		} while(MainMenu != 4);
		
	}
	
	private static void printMainMenu() {
		
		System.out.println("-------------메인 메뉴---------------");
		
		System.out.println("1. 회원 관리");
		
		System.out.println("2. 게시글 관리");
		
		System.out.println("3. 카테고리 관리");
		
		System.out.println("4. 게시판 프로그램 종료");
		
		System.out.println("----------------------------------");
		
		System.out.print("메인 메뉴를 입력하세요 : ");
		
	}

	private static void runMainMenu(int MainMenu) {
		
		switch(MainMenu) {
		
		case 1 :
			
			System.out.println("----------------------------------");
			
			memberMenu();
			
			System.out.println("----------------------------------");
			
			break;
			
		case 2 : 
			
			System.out.println("----------------------------------");
			
			boardMenu();
			
			System.out.println("----------------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("----------------------------------");
			
			categoryMenu();
			
			System.out.println("----------------------------------");
			
			break;
			
		case 4 : 
			
			System.out.println("----------------------------------");
			
			System.out.println("프로그램을 종료합니다.");
			
			System.out.println("----------------------------------");
			
			break;
			
		default :
			
			System.out.println("----------------------------------");
			
			throw new RuntimeException("잘못된 메뉴를 선택했습니다.");
		
		}
		
	}

	private static void memberMenu() {
		
		if(checkLogin(true)) {
			
			return;
			
		}
		
		int subMenu = -1;
		
		do {
			
			printSubMenu(1);
			
			subMenu = sc.nextInt();
			
			runMemberMenu(subMenu);
			
		} while(subMenu != 3);
		
	}
	
	private static boolean checkLogin(boolean b) {
		
		if(user != null && b) {
			
			System.out.println("-------------------------------");
			
			System.out.println("로그인한 사용자는 해당 기능을 이용할 수 없습니다.");
			
			System.out.println("--------------------------------");
			
			return true;
			
		} else if(user == null && !b){
			
			System.out.println("-------------------------------");
			
			System.out.println("로그인 하지 않은 사용자는 해당 기능을 이용 할 수 없습니다.");
			
			System.out.println("--------------------------------");
			
			return true;
			
		}
		
		return false;
		
	}
	
	private static void printSubMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("---------회원 관리 메뉴------------");
			
			System.out.println("1. 회원 가입");
			
			System.out.println("2. 로그인");
			
			System.out.println("3. 이전");
			
			System.out.println("----------------------------");
			
			System.out.print("회원 관리 메뉴를 선택하세요 : ");
			
			break;
			
		case 2 : 
			
			System.out.println("---------게시글 관리 메뉴------------");
			
			System.out.println("1. 게시글 등록");
			
			System.out.println("2. 게시글 수정");
			
			System.out.println("3. 게시글 삭제");
			
			System.out.println("4. 게시글 목록");
			
			System.out.println("5. 이전");
			
			System.out.println("----------------------------");
			
			System.out.print("게시글 관리 메뉴를 선택하세요 : ");
			
			break;
			
		case 3 :
			
			System.out.println("---------카테고리 관리 메뉴------------");
			
			System.out.println("1. 카테고리 등록");
			
			System.out.println("2. 카테고리 수정");
			
			System.out.println("3. 카테고리 삭제");
			
			System.out.println("4. 카테고리 목록");
			
			System.out.println("5. 이전");
			
			System.out.println("----------------------------");
			
			System.out.print("카테고리 관리 메뉴를 선택하세요 : ");
			break;
		
		}
		
	}
	
	private static void runMemberMenu(int subMenu) {
		
		switch(subMenu) {
		
		case 1 :
			
			System.out.println("----------------------------");
			
			System.out.println("회원 가입 하는 기능");
			
			System.out.println("----------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("----------------------------");
			
			System.out.println("로그인 하는 기능");
			
			System.out.println("----------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("----------------------------");
			
			System.out.println("메인 메뉴로 돌아갑니다.");
			
			System.out.println("----------------------------");
			
			break;
			
		default :
			
			System.out.println("----------------------------");
			
			System.out.println("회원 관리 메뉴를 잘 못 입력했습니다.");
			
			System.out.println("----------------------------");
			
			break;
		
		}
		
	}
	
	private static void boardMenu() {
		
					// 서브 메뉴를 출력
		
					// 서브 메뉴 선택 및 선택한 서브 메뉴에 맞는 기능 실행 => 반복
					
					   // 1. 게시글 등록
					
					      // 회원 체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함.
					
					     // 게시글 정보(제목, 내용) 입력
					
					     // 게시글을 등록
					
					   // 2. 게시글 수정
					
					 	// 회원 체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함.
					
					    // 수정할 게시글 번호 입력
					
					    // 해당 게시글이 존재하지 않거나, 작성자가 회원과 같지 않으면 수정 못함 
					
				     	// 게시글 정보(제목, 내용) 입력
				
						// 게시글을 수정
					
					   // 3. 게시글 삭제
					
					    // 회원 체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함
					
					    // 삭제할 게시글 번호 입력
					
					    // 해당 게시글이 존재하지 않거나, 작성자가 회원과 같지 않으면 삭제 못함
					
					    // 해당 게시글 삭제
					
					   // 4. 게시글 목록
					
					    // 서브 메뉴 출력
					
					    // 서브 메뉴 선택 및 기능 실행
					
					     // 1. 게시글 목록 확인
					
					       // 모든 게시글 확인
					     
					     // 2. 게시글 검색
					
					       // 검색어 입력 후 게시글 확인
					  
					     // 3. 게시글 확인
					
					       // 게시글 번호를 입력
					
					       // 입력한 게시글이 있으면 확인

					     // 4. 이전
					
					   // 5. 이전
		
	}
	
	private static void categoryMenu() {
		
					// 관리자 체크 => 관리자가 아니면 메인메뉴로
		
					// 서브 메뉴 출력
					
					// 선택한 서브 메뉴에 맞는 기능 실행
					
					  // 1. 카테고리 추가
					
					    // 새 카테고리명 입력
					 
					    // 기존 카테고리에 있는지 확인하여 없으면 추가
					
					  // 2. 카테고리 수정
					
					   // 수정할 카테고리명 입력
					
					   // 기존 카테고리에 있으면 
					
					   		// 새 카테고리명 입력
					
					        // 기존 카테고리에 있는지 확인하여 없으면 수정
					
					  // 3. 카테고리 삭제
					
					    // 삭제할 카테고리명 입력
					
					    // 기존 카테고리에 있으면 삭제

					  // 4. 카테고리 확인
					
					    // 모든 카테고리 출력
					
					  // 5. 이전
		
	}

}