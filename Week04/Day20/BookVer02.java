package Day20;

import lombok.Data;

@Data
public class BookVer02 {
	
	// 필드 => 객체를 나타내는 정보
	
	private String title;
	
	private String author;
	
	private String publisher;
	
	private String genre;
	
	private int price;
	
	private String isbn;
	
	// 생성자 => 필드 초기화

	public BookVer02(String title, String author, String publisher, String genre, int price, String isbn) {
		
		this.title = title;
		
		this.author = author;
		
		this.publisher = publisher;
		
		this.genre = genre;
		
		this.price = price;
		
		this.isbn = isbn;
		
	}
	
	// 메소드 => 기능
	
	// getter, setter => @Data로 처리 (또는 @Getter, @Setter로 처리)
	
	// toString 오버라이드 => 도서 정보를 간단하게 문자열로 만들기 위해(출력) => @Data, @ToString
	
	@Override
	public String toString() {
		
		return "책 제목 : " + title + " " + " 저자 : " + author + " " + " 가격 : " + price + " " + " 출판사 : " + publisher + " " + " 장르 : " + genre + " " + " 도서 번호 : " + isbn;
		
	}
	
	// equals => 상황에 따라 오버라이딩 => @Data, @EqualsAndHashCode

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		BookVer02 other = (BookVer02) obj;
		
		if (isbn == null) {
			
			if (other.isbn != null)
				
				return false;
			
		} else if (!isbn.equals(other.isbn))
			
			return false;
		
		return true;
		
	}
	
}