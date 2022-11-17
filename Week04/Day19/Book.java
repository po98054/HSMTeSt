package Day19;

import lombok.Data;

@Data
public class Book {
	
	// 도서 정보
	
	// 도서명, 저자(여러명, 엮은이, 옮긴이 포함), 가격, 출판사, 분류, ISBN
	
	private String bookname;
	
	private String author;
	
	private int price;
	
	private String publisher;
	
	private String classif;
	
	private int ISBN;

	public Book(String bookname, String author, int price, String publisher, String classif, int iSBN) {
		
		this.bookname = bookname;
		
		this.author = author;
		
		this.price = price;
		
		this.publisher = publisher;
		
		this.classif = classif;
		
		ISBN = iSBN;
		
	}

	@Override
	public String toString() {
		
		return "책 제목 : " + bookname + " " + " 저자 : " + author + " " + " 가격 : " + price + " " + " 출판사 : " + publisher + " " + " 분류 : " + classif + " " + " 도서 번호 : " + ISBN;
		
	}
	
	
	
}