package Day30;

import lombok.Data;

@Data
public class CommentVer01 {
	
	private int num;
	
	private String content;
	
	private String writer;
	
	private int boardNum;

	@Override
	public String toString() {
		
		return num + "번 " + writer + "가 쓴 댓글은 " + content + "입니다.";
		
	}
	
	public CommentVer01(int num, String content, String writer, int boardNum) {
		
		this.num = num;
		
		this.content = content;
		
		this.writer = writer;
		
		this.boardNum = boardNum;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		CommentVer01 other = (CommentVer01) obj;
		
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
	
}