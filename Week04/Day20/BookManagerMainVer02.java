package Day20;

import java.util.ArrayList;

import java.util.Scanner;

public class BookManagerMainVer02 {
	
	public static void main(String[] args) {
		
		int menu = -1;
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<BookVer02> list = new ArrayList<BookVer02>();
		
	 // 반복
		
		do {
			
			// 메뉴를 출력
			
			System.out.println("------메뉴--------");
			
			System.out.println("1. 도서 추가");
			
			System.out.println("2. 도서 조회");
			
			System.out.println("3. 종료");
			
			System.out.println("-----------------");
			
			System.out.print("메뉴 선택 : ");
			
			// 메뉴를 선택
			
			menu = sc.nextInt();
			
			// 선택한 메뉴에 따른 기능 실행
			
			String title;
			
			String author;
			
			String publisher;
			
			String genre;
			
			String isbn;
			
			int price;
			
			switch(menu) {
			
			case 1 :
				
				System.out.println("-----------------");
				
				// 추가할 도서 정보를 입력
				
				System.out.println("추가할 도서 정보를 입력하세요.");
				
				System.out.println("-----------------");
				
				sc.nextLine(); // 엔터 처리
				
				System.out.print("도서명 : ");
				
				title = sc.nextLine();
				
				System.out.print("저자 : ");
				
				author = sc.nextLine();
				
				System.out.print("가격 : ");
				
				price = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("출판사 : ");
				
				publisher = sc.nextLine();
				
				System.out.print("장르 : ");
				
				genre = sc.nextLine();
				
				System.out.print("ISBN : ");
				
				isbn = sc.next();
				
				System.out.println("-----------------");
				
				// 도서 목록에 새 도서를 추가
				
				// 위에서 입력 받은 도서 정보를 이용하여 도서 객체 생성
				
				BookVer02 book = new BookVer02(title, author, publisher, genre, price, isbn);
				
				// 생성된 도서 객체를 리스트에 추가
				
				// isbn 중복 체크해서 중복되면 건너 띄고 중복되지 않으면 추가 => 중복 : 리스트에 book객체가 포함되었다.
				
				if(list.contains(book)) {
					
					System.out.println("이미 등록된 ISBN 번호입니다.");
					
					System.out.println("-----------------");
					
					continue;
					
				}
				
				list.add(book);
				
				System.out.println("도서 추가가 완료되었습니다.");
				
				break;
				
			case 2 :
				
				System.out.println("-----------------");
				
				// 서브 메뉴 출력
				
				System.out.println("------조회 메뉴--------");
				
				System.out.println("1. 도서명으로 조회");
				
				System.out.println("2. 저자로 조회");
				
				System.out.println("3. 출판사로 조회");
				
				System.out.println("4. 장르로 조회");
				
				System.out.println("5. 취소");
				
				System.out.println("-----------------");
				
				System.out.print("조회 메뉴 선택 : ");
				
				// 서브 메뉴 선택
				
				int subMenu = sc.nextInt();
				
				int count = 0;
				
				// 선택한 서브 메뉴 실행
				
				switch(subMenu) {
				
				case 1 :
					
					System.out.println("-----------------");
					
					System.out.println("조회할 도서명을 입력하세요.");
					
					System.out.println("-----------------");
					
					sc.nextLine(); // 엔터 처리
					
					System.out.print("도서명 : ");
					
					title = sc.nextLine();
					
					System.out.println("-----------------");
					
					for(BookVer02 temp : list) {
						
						if(temp.getTitle().contains(title.trim())) {
							
							System.out.println(temp);
							
							count = count + 1;
							
						}
						
					}
					
					if(count == 0) {
						
						System.out.println("검색한 도서가 없습니다");
						
					}
					
					break;
					
				case 2 :
					
					System.out.println("-----------------");
					
					System.out.println("조회할 저자명을 입력하세요.");
					
					System.out.println("-----------------");
					
					sc.nextLine(); // 엔터 처리
					
					System.out.print("저자 : ");
					
					author = sc.nextLine();
					
					System.out.println("-----------------");
					
					count = 0;
					
					for(BookVer02 temp : list) {
						
						if(temp.getAuthor().contains(author.trim())) {
							
							System.out.println(temp);
							
							count = count + 1;
							
						}
						
					}
					
					if(count == 0) {
						
						System.out.println("검색한 도서가 없습니다");
						
					}
					
					break;
					
				case 3 :
					
					System.out.println("-----------------");
					
					System.out.println("조회할 출판사를 입력하세요.");
					
					System.out.println("-----------------");
					
					sc.nextLine(); // 엔터 처리
					
					System.out.print("출판사 : ");
					
					publisher = sc.nextLine();
					
					System.out.println("-----------------");
					
					count = 0;
					
					for(BookVer02 temp : list) {
						
						if(temp.getPublisher().contains(publisher.trim())) {
							
							System.out.println(temp);
							
							count = count + 1;
							
						}
						
					}
					
					if(count == 0) {
						
						System.out.println("검색한 도서가 없습니다");
						
					}
					
					break;
					
				case 4 :
					
					System.out.println("-----------------");
					
					System.out.println("조회할 장르를 입력하세요.");
					
					System.out.println("-----------------");
					
					sc.nextLine(); // 엔터 처리
					
					System.out.print("장르 : ");
					
					genre = sc.nextLine();
					
					System.out.println("-----------------");
					
					count = 0;
					
					for(BookVer02 temp : list) {
						
						if(temp.getGenre().contains(genre.trim())) {
							
							System.out.println(temp);
							
							count = count + 1;
							
						}
						
					}
					
					if(count == 0) {
						
						System.out.println("검색한 도서가 없습니다");
						
					}
					
					break;
					
				case 5 :
					
					System.out.println("-----------------");
					
					System.out.println("취소합니다.");
					
					break;
					
				default :
					
					System.out.println("-----------------");
					
					System.out.println("조회 메뉴를 잘못 입력했습니다.");
					
					break;
				
				}
				
				break;
				
			case 3 :
				
				System.out.println("-----------------");
				
				System.out.println("프로그램을 종료합니다.");
				
				break;
				
			default :
				
				System.out.println("-----------------");
				
				System.out.println("메뉴를 잘못 입력했습니다.");
				
				break;
			
			}
			
		} while(menu != 3);
		
		sc.close();
		
	}

}