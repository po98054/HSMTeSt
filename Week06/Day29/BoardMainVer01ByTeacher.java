package Day29;

import java.io.*;

import java.util.*;

public class BoardMainVer01ByTeacher {
	
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
	
	private static List<UserVer01ByTeacher> userList = new ArrayList<UserVer01ByTeacher>();
	
	private static List<Object> boardList = new ArrayList<Object>();
	
	private static List<String> categoryList = new ArrayList<String>();
	
	private static UserVer01ByTeacher user;
	
	public static void main(String[] args) {
		
		int MainMenu = -1;
		
		loadMember("member.txt");
		
		loadCategory("category.txt");
		
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
				
				System.out.println("예외 발생 " + e.getMessage());
				
				System.out.println("----------------------------");
				
			}
			
		} while(MainMenu != 4);
		
		saveMember("member.txt");
		
		saveCategory("category.txt");
		
	}
	
	private static void loadMember(String fileName) {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			
			while(true) {
				
				UserVer01ByTeacher user = (UserVer01ByTeacher) ois.readObject();
				
				userList.add(user);
				
			}
			
		} catch(ClassNotFoundException e) {
			
			System.out.println("----------------------------");
			
			System.out.println("불러오기 실패");
			
			System.out.println("----------------------------");
			
		} catch(EOFException e) {
			
			System.out.println("-----------------------------");
			
			System.out.println("불러오기 성공");
			
			System.out.println("-------------------------------");
			
		} catch(IOException e) {
			
			System.out.println("----------------------------");
			
			System.out.println("불러오기 실패");
			
			System.out.println("----------------------------");
			
		}
		
	}
	
	private static void loadCategory(String fileName) {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			
			while(true) {
				
				String category = (String) ois.readObject();
				
				categoryList.add(category);
				
			}
			
		} catch(ClassNotFoundException e) {
			
			System.out.println("----------------------------");
			
			System.out.println("불러오기 실패");
			
			System.out.println("----------------------------");
			
		} catch(EOFException e) {
			
			System.out.println("-----------------------------");
			
			if(categoryList.size() == 0) {
				
				categoryList = new ArrayList<String>(Arrays.asList("공지", "자유"));
				
			}
			
			System.out.println("불러오기 성공");
			
			System.out.println("-------------------------------");
			
		} catch(IOException e) {
			
			System.out.println("----------------------------");
			
			System.out.println("불러오기 실패");
			
			System.out.println("----------------------------");
			
		}

	}
	
	private static void saveMember(String fileName) {
		
		if(userList.size() == 0) {
			
			return;
			
		}
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			
			for(UserVer01ByTeacher user : userList) {
				
				oos.writeObject(user);
				
			}
			
			System.out.println("----------------------------");
			
			System.out.println("저장 성공");
			
			System.out.println("----------------------------");
			
		} catch(IOException e) {
			
			System.out.println("----------------------------");
			
			System.out.println("저장 경로가 잘못 되서 저장 실패");
			
			System.out.println("----------------------------");
			
		}
		
	}
	
	private static void saveCategory(String fileName) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			
			for(String category : categoryList) {
				
				oos.writeObject(category);
				
			}
			
			System.out.println("----------------------------");
			
			System.out.println("저장 성공");
			
			System.out.println("----------------------------");
			
		} catch(IOException e) {
			
			System.out.println("----------------------------");
			
			System.out.println("저장 경로가 잘못 되서 저장 실패");
			
			System.out.println("----------------------------");
			
		}
		
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
			
			subMenu = runMemberMenu(subMenu);
			
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
	
	private static int runMemberMenu(int subMenu) {
		
		switch(subMenu) {
		
		case 1 :
			
			signup();
			
			break;
			
		case 2 :
			
			login();
			
			if(user != null)
				
				return 3;
			
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
		
		return subMenu;
		
	}
	
	private static void signup() {
		
		System.out.println("----------------------------");
		
		System.out.println("회원 정보 입력");
		
		System.out.println("----------------------------");
		
		sc.nextLine();
		
		UserVer01ByTeacher user = inputUser();
		
		if(isUser(user)) {
			
			System.out.println("-------------------------");
			
			System.out.println("이미 가입된 아이디입니다.");
			
			System.out.println("--------------------------");
			
			return;
			
		}
		
		userList.add(user);
		
		System.out.println("----------------------------");
		
		System.out.println("회원 가입에 성공했습니다.");
		
		System.out.println("----------------------------");
		
	}
	
	private static UserVer01ByTeacher inputUser() {
		
		System.out.print("아이디 : ");
		
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		
		String pw = sc.nextLine();
		
		Authority authority = userList.size() == 0 ? Authority.ADMIN : Authority.MEMBER;
		
		return new UserVer01ByTeacher(id, pw, authority);
		
	}
	
	private static boolean isUser(UserVer01ByTeacher user) {
		
		if(user == null) {
			
			return false;
			
		}
		
		if(userList == null) {
			
			userList = new ArrayList<UserVer01ByTeacher>();
			
		}
		
		if(userList.size() == 0) {
			
			return false;
			
		}
		
		for(UserVer01ByTeacher temp : userList) {
			
			if(temp.getId().equals(user.getId())) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	private static void login() {
		
		System.out.println("----------------------------");
		
		System.out.println("로그인 정보 입력");
		
		System.out.println("----------------------------");
		
		sc.nextLine();
		
		user = inputUser();
		
		int index = userList.indexOf(user);
		
		if(index == -1) {
			
			System.out.println("----------------------------");
			
			System.out.println("로그인 실패");
			
			System.out.println("----------------------------");
			
			return;
			
		}
		
		user = userList.get(index);
		
		System.out.println("----------------------------");
		
		System.out.println("로그인 성공");
		
		System.out.println("----------------------------");
		
	}
	
	private static void boardMenu() {
		
					// 서브 메뉴를 출력
		
					// 서브 메뉴 선택 및 선택한 서브 메뉴에 맞는 기능 실행 => 반복
					
					   // 1. 게시글 등록
					
					      // 회원 체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함.
					
					     // 게시글 정보(제목, 내용) 입력
					
					     // 게시글을 등록
					
					   // 2. 게시글 수정
		
						// 수정할 게시글 번호 입력
					
					 	// 회원 체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함.
					
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
		
		if(!isAdmin()) {
			
			return;
			
		}
		
		int subMenu = -1;
		
		do {
			
			printSubMenu(3);
			
			subMenu = sc.nextInt();
			
			sc.nextLine();
			
			runCategoryMenu(subMenu);
			
		} while(subMenu != 5);
		
	}
	
	private static boolean isAdmin() {
		
		if(user == null || user.getAuthority() != Authority.ADMIN) {
			
			System.out.println("--------------------------");
			
			System.out.println("관리자가 아닙니다. 해당 기능을 이용할 수 없습니다.");
			
			System.out.println("---------------------------");
			
			return false;
			
		}
		
		return true;
		
	}
	
	private static void runCategoryMenu(int subMenu) {
		
		switch(subMenu) {
		
		case 1 :
			
			System.out.println("----------------------------");
			
			insertCategory();
			
			System.out.println("----------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("----------------------------");
			
			updateCategory();
			
			System.out.println("----------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("----------------------------");
			
			deleteCategory();
			
			System.out.println("----------------------------");
			
			break;
			
		case 4 :
			
			System.out.println("----------------------------");
			
			printCategory();
			
			System.out.println("----------------------------");
			
			break;
			
		case 5 :
			
			System.out.println("----------------------------");
			
			System.out.println("메인 메뉴로 돌아갑니다.");
			
			System.out.println("----------------------------");
			
			break;
			
		default :
			
			System.out.println("----------------------------");
			
			System.out.println("카테고리 메뉴를 잘못 입력했습니다.");
			
			System.out.println("----------------------------");
			
			break;
		
		}
		
	}
	
	private static void insertCategory() {
		
		System.out.print("카테고리명 : ");
		
		String category = sc.nextLine();
		
		System.out.println("-----------------------");
		
		if(categoryList.indexOf(category) == -1) {
			
			categoryList.add(category);
			
			System.out.println("---------------------");
			
			System.out.println("새 카테고리를 추가했습니다.");
			
			System.out.println("----------------------");
			
			return;
			
		}
		
		System.out.println("---------------------");
		
		System.out.println("이미 등록되어 있는 카테고리 입니다.");
		
		System.out.println("----------------------");
		
	}
	
	private static void updateCategory() {
		
		System.out.print("수정할 카테고리명 : ");
		
		String category = sc.nextLine();
		
		System.out.println("------------------");
		
		if(!categoryList.contains(category)) {
			
			System.out.println("--------------------------");
			
			System.out.println("등록되지 않은 카테고리입니다. 수정 실패");
			
			System.out.println("---------------------------");
			
			return;
			
		}
		
		System.out.print("새 카테고리명 : ");
		
		String newCategory = sc.nextLine();
		
		System.out.println("-------------------------");
		
		if(!categoryList.contains(newCategory)) {
			
			categoryList.remove(category);
			
			categoryList.add(newCategory);
			
			System.out.println("--------------------------");
			
			System.out.println("카테고리 수정에 성공했습니다.");
			
			System.out.println("---------------------------");
			
		}
		
		System.out.println("--------------------------");
		
		System.out.println("이미 등록된 카테고리입니다. 수정 실패");
		
		System.out.println("---------------------------");
		
	}
	
	private static void deleteCategory() {
		
		System.out.print("삭제할 카테고리명 : ");
		
		String category = sc.nextLine();
		
		System.out.println("------------------------");
		
		if(categoryList.remove(category)) {
			
			System.out.println("--------------------------");
			
			System.out.println("카테고리를 삭제했습니다.");
			
			System.out.println("---------------------------");
			
			return;
			
		}
		
		System.out.println("--------------------------");
		
		System.out.println("등록되지 않은 카테고리입니다.");
		
		System.out.println("---------------------------");
		
	}
	
	private static void printCategory() {
		
		if(categoryList.size() == 0) {
			
			System.out.println("--------------------------");
			
			System.out.println("등록된 카테고리가 없습니다.");
			
			System.out.println("---------------------------");
			
			return;
			
		}
		
		for(int i = 0; i < categoryList.size(); i++) {
			
			System.out.println((i + 1) + ". " + categoryList.get(i));
			
		}
		
	}

}