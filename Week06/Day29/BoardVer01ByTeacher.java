package Day29;

import java.io.Serializable;
import java.text.SimpleDateFormat;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVer01ByTeacher implements Serializable{
	
	private static final long serialVersionUID = -1638523131869560448L;

	private String title;
	
	private String content;
	
	private String writer;
	
	private Date regDate;
	
	private Date upDate;
	
	private int views;
	
	private static int count = 0;
	
	private int num;
	
	private String category;
	
	public static void setCount(int count2) {
		
		count = count2;
		
	}
	
	public static int getCount() {
		
		return count;
		
	}

	public BoardVer01ByTeacher(String title, String content, String writer, String category) {
		
		this.title = title;
		
		this.content = content;
		
		this.writer = writer;
		
		this.category = category;
		
		count = count + 1;
		
		num = count;
		
		this.regDate = new Date();
		
	}
	
	public BoardVer01ByTeacher(int num) {
		
		this.num = num;
		
	}

	@Override
	public String toString() {
		
		return "카테고리 명 : " + category + " 번호 : " + num + " 제목 : " + title + " 내용 : " + content + " 작성자 : " + writer + 
				" 등록일 : " + getRegDate() + " 수정일 : " + getUpDate() + " 조회수 : " + views;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		BoardVer01ByTeacher other = (BoardVer01ByTeacher) obj;
		
		if (num != other.num)
			
			return false;
		
		return true;
		
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		
		int result = 1;
		
		result = prime * result + num;
		
		return result;
		
	}
	
	public String getRegDate() {
		
		if(regDate == null) {
			
			return "";
			
		}
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM일 dd일");
		
		return df.format(regDate);
		
	}
	
	public String getUpDate() {
		
		if(upDate == null) {
			
			return "";
			
		}
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM일 dd일");
		
		return df.format(upDate);
			
	}
	
	public void update(String title, String content) {
		
		this.title = title;
		
		this.content = content;
		
		this.upDate = new Date();
		
	}
	
	public void updateView() {
		
		views = views + 1;
		
	}
	
	public void print() {
		
		System.out.println("----------------------------------------");
		
		System.out.println("번호 : " + num);
		
		System.out.println("카테고리 : " + category);
		
		System.out.println("제목 : " + title);
		
		System.out.println("내용 : " + content);
		
		System.out.println("작성자 : " + writer);
		
		System.out.println("등록일 : " + getRegDate());
		
		if(upDate != null) {
			
			System.out.println("수정일 : " + getUpDate());
			
		}
		
		System.out.println("조회수 : " + views);
		
		System.out.println("----------------------------------------");
		
	}
	
}