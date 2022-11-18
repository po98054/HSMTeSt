package Day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class BookManagerMainVer03 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int menu = -1;
		
		ArrayList<BookVer02> list = new ArrayList<BookVer02>();
		
	 // 반복
		
		do {
			
			// 메뉴를 출력
			
			printMenu();
			
			// 메뉴를 선택
			
			menu = sc.nextInt();
			
			// 선택한 메뉴에 따른 기능 실행
			
			runMenu(list, menu);
			
		} while(menu != 3);
		
		sc.close();
		
	}

	public static void runMenu(ArrayList<BookVer02> list, int menu) {
		
		switch(menu) {
		
		case 1 :
			
			printBar();
			
			BookVer02 book = createBook();
			
			// isbn 중복 체크해서 중복되면 건너 띄고 중복되지 않으면 추가 => 중복 : 리스트에 book객체가 포함되었다.
			
			if(!insertBook(list, book)) {
				
				System.out.println("이미 등록된 ISBN 번호입니다.");
				
				printBar();
				
			} else {
				
				System.out.println("도서 추가가 완료되었습니다.");
				
			}
			
			break;
			
		case 2 :
			
			printBar();
			
			// 서브 메뉴 출력
			
			printSubMenu();
			
			// 서브 메뉴 선택
			
			int subMenu = sc.nextInt();
			
			// 선택한 서브 메뉴 실행
			
			runSubMenu(subMenu, list);
			
			break;
			
		case 3 :
			
			printBar();
			
			System.out.println("프로그램을 종료합니다.");
			
			break;
			
		default :
			
			printBar();
			
			System.out.println("메뉴를 잘못 입력했습니다.");
			
			break;
		
		}
		
	}

	public static void runSubMenu(int subMenu, ArrayList<BookVer02> list) {
		
		int count = 0;
		
		String title;
		
		String author;
		
		String publisher;
		
		String genre;
		
		switch(subMenu) {
		
		case 1 :
			
			printBar();
			
			System.out.println("조회할 도서명을 입력하세요.");
			
			printBar();
			
			sc.nextLine(); // 엔터 처리
			
			System.out.print("도서명 : ");
			
			title = sc.nextLine();
			
			printBar();
			
			printBookList(list, p -> p.getTitle().equals(title.trim()));
			
			break;
			
		case 2 :
			
			printBar();
			
			System.out.println("조회할 저자명을 입력하세요.");
			
			printBar();
			
			sc.nextLine(); // 엔터 처리
			
			System.out.print("저자 : ");
			
			author = sc.nextLine();
			
			printBar();
			
			printBookList(list, p -> p.getAuthor().equals(author.trim()));
			
			break;
			
		case 3 :
			
			printBar();
			
			System.out.println("조회할 출판사를 입력하세요.");
			
			printBar();
			
			sc.nextLine(); // 엔터 처리
			
			System.out.print("출판사 : ");
			
			publisher = sc.nextLine();
			
			printBar();
			
			printBookList(list, p -> p.getPublisher().equals(publisher.trim()));
			
			break;
			
		case 4 :
			
			printBar();
			
			System.out.println("조회할 장르를 입력하세요.");
			
			printBar();
			
			sc.nextLine(); // 엔터 처리
			
			System.out.print("장르 : ");
			
			genre = sc.nextLine();
			
			printBar();
			
			printBookList(list, p -> p.getGenre().equals(genre.trim()));
			
			break;
			
		case 5 :
			
			printBar();
			
			System.out.println("취소합니다.");
			
			break;
			
		default :
			
			printBar();
			
			System.out.println("조회 메뉴를 잘못 입력했습니다.");
			
			break;
		
		}
		
	}

	public static void printSubMenu() {
		
		System.out.println("------조회 메뉴--------");
		
		System.out.println("1. 도서명으로 조회");
		
		System.out.println("2. 저자로 조회");
		
		System.out.println("3. 출판사로 조회");
		
		System.out.println("4. 장르로 조회");
		
		System.out.println("5. 취소");
		
		System.out.println("-----------------");
		
		System.out.print("조회 메뉴 선택 : ");
		
	}

	public static BookVer02 createBook() {
		
		System.out.println("추가할 도서 정보를 입력하세요.");
		
		printBar();
		
		sc.nextLine();
		
		System.out.print("도서명 : ");
		
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("출판사 : ");
		
		String publisher = sc.nextLine();
		
		System.out.print("장르 : ");
		
		String genre = sc.nextLine();
		
		System.out.print("ISBN : ");
		
		String isbn = sc.next();
		
		printBar();
		
		// 도서 목록에 새 도서를 추가
		
		// 위에서 입력 받은 도서 정보를 이용하여 도서 객체 생성
		
		return new BookVer02(title, author, publisher, genre, price, isbn);
		
	}

	public static void printBar() {
		
		System.out.println("-----------------");
		
	}

	public static void printMenu() {
		
		System.out.println("------메뉴--------");
		
		System.out.println("1. 도서 추가");
		
		System.out.println("2. 도서 조회");
		
		System.out.println("3. 종료");
		
		printBar();
		
		System.out.print("메뉴 선택 : ");
		
	}
	
	public static boolean insertBook(ArrayList<BookVer02> list, BookVer02 book) {
		
		if(list.contains(book)) {
			
            return false;
			
		}
		
		list.add(book);
		
		Collections.sort(list, (o1, o2) -> o1.getIsbn().compareTo(o2.getIsbn()));
		
		return true;
		
	}
	
	public static void printBookList(ArrayList<BookVer02> list, Predicate<BookVer02> p) {
		
		int count = 0;
		
		for(BookVer02 temp : list) {
			
			if(p.test(temp)) {
				
				System.out.println(temp);
				
				count = count + 1;
				
			}
			
		}
		
		if(count == 0) {
			
			System.out.println("검색한 도서가 없습니다");
			
		}
		
	}

}