package Day19;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.Scanner;

import java.util.function.Predicate;

public class BookManagerMain {
	
	// 도서 관리 프로그램을 작성하세요.
	
	// 도서 정보
	
	// 도서명, 저자(여러명, 엮은이, 옮긴이 포함), 가격, 출판사, 분류, ISBN
	
	// 기능
	
	// 1. 도서 추가
	
	// 1-1 ISBN으로 정렬
	
	// 2. 도서 조회
	
	// 2-1 도서명으로 조회
	
	// 2-2 저자로 조회
	
	// 2-3 출판사로 조회
	
	// 2-4 분류로 조회
	
	public static void main(String [] args) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		int menu = -1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(list, menu, sc);
			
		} while(menu != 3);
		
	}

	private static void runMenu(ArrayList<Book> list, int menu, Scanner sc) {
		
		switch(menu) {
		
		case 1 : 
			
			System.out.println("----------------------------");
			
			insertBook(list, InputBook());
			
			break;
			
		case 2 :
			
			System.out.println("----------------------------");
			
			printSubMenu();
			
			int subMenu = sc.nextInt();
			
			runSubMenu(subMenu, sc, list);
			
			break;
			
		case 3 :
			
			System.out.println("----------------------------");
			
			System.out.println("프로그램을 종료합니다.");
			
			break;
			
		default :
			
			System.out.println("----------------------------");
			
			System.out.println("메뉴를 잘못 입력했습니다.");
			
			break;
		
		}
		
	}

	private static void runSubMenu(int subMenu, Scanner sc, ArrayList<Book> list) {
		
		switch(subMenu) {
		
		case 1 :
			
			System.out.println("----------------------------");
			
			System.out.print("검색할 책 제목 : ");
			
			sc.nextLine();
			
			String bookname = sc.nextLine();
			
			printItem(list, (s) -> s.getBookname().equals(bookname));
			
			break;
			
		case 2 :
			
			System.out.println("----------------------------");
			
			System.out.print("검색할 저자 : ");
			
			String author = sc.next();
			
			printItem(list, (s) -> s.getAuthor().equals(author));
			
			break;
			
		case 3 :
			
			System.out.println("----------------------------");
			
			System.out.print("검색할 출판사 : ");
			
			String publisher = sc.next();
			
			printItem(list, (s) -> s.getPublisher().equals(publisher));
			
			break;
			
		case 4 :
			
			System.out.println("----------------------------");
			
			System.out.print("검색할 구분 : ");
			
			String classif = sc.next();
			
			printItem(list, (s) -> s.getClassif().equals(classif));
			
			break;
			
		default :
			
			System.out.println("서브메뉴를 잘 못 입력했습니다.");
			
			break;
		
		}
		
	}

	private static void printSubMenu() {
		
		System.out.println("---------서브 메뉴--------------");
		
		System.out.println("1. 도서명으로 조회");
		
		System.out.println("2. 저자로 조회");
		
		System.out.println("3. 출판사로 조회");
		
		System.out.println("4. 분류로 조회");
		
		System.out.println("----------------------------");
		
		System.out.print("서브 메뉴를 입력하세요 : ");
		
	}

	private static void printMenu() {
		
		System.out.println("---------메뉴--------------");
		
		System.out.println("1. 도서 추가");
		
		System.out.println("2. 도서 조회");
		
		System.out.println("3. 프로그램 종료");
		
		System.out.println("----------------------------");
		
		System.out.print("메뉴를 입력하세요 : ");
		
	}
	
	private static void insertBook(ArrayList<Book> list, Book book) {
		
		list.add(book);
		
		// 오름차순하는 메소드
		Collections.sort(list, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				
				if(o1 == null) {
					
					return 1;
					
				}
				
				if(o2 == null) {
					
					return -1;
					
				}
				
				return o1.getISBN() - o2.getISBN();
				
			}
			
		});
		
		System.out.println("----------------------------");
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		
	}
	
	private static Book InputBook() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------");
		
		System.out.println("추가할 도서 ");
		
		System.out.println("----------------------------");
		
		System.out.print("도서명 : ");
		
		String bookname = sc.nextLine();
		
		//sc.nextLine();
		
		System.out.print("저자 : ");
		
		String author = sc.next();
		
		System.out.print("가격 : ");
		
		int price = sc.nextInt();
		
		System.out.print("출판사 : ");
		
		String publisher = sc.next();
		
		System.out.print("분류 : ");
		
		String classif = sc.next();
		
		System.out.print("ISBN : ");
		
		int ISBN = sc.nextInt();
		
		return new Book(bookname, author, price, publisher, classif, ISBN);
		
	}
	
	public static void printItem(ArrayList<Book> list, Predicate<Book> p) {
		
		for(Book temp : list) {
			
			if(p.test(temp)) {
				
				System.out.println("----------------------------");
				
				System.out.println(temp);
				
			}
			
		}
		
	}
	
}