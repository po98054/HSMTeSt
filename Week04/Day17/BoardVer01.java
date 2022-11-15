package Day17;

import java.text.SimpleDateFormat;

import java.util.Date;

import lombok.Data;

//게시글은 번호, 제목, 내용, 작성자, 작성일, 조회수로 구성

@Data
public class BoardVer01 {
	
	// 게시글 번호를 위한 클래스 변수
	
	private static int count = 0;
	
	// 게시글에 필요한 정보
	
	private String title;
	
	private String content;
	
	private String writer;
	
	private int view;
	
	private Date date;
	
	private int num;

	public BoardVer01(String title, String content, String writer) {
		
		this.title = title;
		
		this.content = content;
		
		this.writer = writer;
		
		date = new Date();
		
		count = count + 1;
		
		num = count;
		
	}
	
	public BoardVer01(int num) {
		
		this.num = num;
		
	}

	public String getDate() {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		return format.format(date);
		
	}

	public String print() {
		
		return "\n" + "제목 : " + title + "\n" + "내용 : " + content + "\n" + "작성자 : " + writer + "\n" + "작성 날짜 : " + getDate() + "\n" + "조회수 : " + view + "\n" + "번호 : " + num + "\n"; 
		
	}
	
	@Override
	public String toString() {
		
		return num + "\t" + title + " " + writer + " " + view + " " + getDate();
		
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
		
		BoardVer01 other = (BoardVer01) obj;
		
		if (num != other.num)
			
			return false;
		
		return true;
		
	}

	public void update(String title, String content) {
		
		this.title = title;
		
		this.content = content;
		
	}

	public void updateView() {
		
		view = view + 1;
		
	}
	
}