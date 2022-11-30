package Day28;

import lombok.Data;

@Data
public class BoardVer01ByHSM {
	
	private static int count = 0;
	
	private String title;
	
	private String content;
	
	private String author;
	
	private int num;
	
	public BoardVer01ByHSM() {
		
	}

	public BoardVer01ByHSM(String title, String content, String author) {
		
		this.title = title;
		
		this.content = content;
		
		this.author = author;
		
		count = count + 1;
		
		num = count;
		
	}
	
	public BoardVer01ByHSM(String title, String content) {
		
		this.title = title;
		
		this.content = content;
		
	}
	
	public BoardVer01ByHSM(int num) {
		
		this.num = num;
		
	}

	@Override
	public String toString() {
		
		return "번호 : " + num + " 제목 : " + title + " 내용 : " + content + " 등록자 : " + author; 
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass()) {
			
			// obj가 Integer로 클래스 변환이 가능하면 게시글 번호와 obj를 비교
			
			if(obj instanceof Integer) {
				
				if(num == (Integer) obj) {
					
					return true;
					
				}
				
			}
		
		  	// Integer, Board 클래스가 아니거나 게시글 번호가 다른 경우
		
			return false;
		}
		
		BoardVer01ByHSM other = (BoardVer01ByHSM) obj;
		
		if (num != other.num)
			
			return false;
		
		return true;
		
	}

	public void update(String title, String content) {
		
		this.title = title;
		
		this.content = content;
		
	}
	
}