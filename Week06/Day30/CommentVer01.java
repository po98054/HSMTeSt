package Day30;

import lombok.Data;

@Data
public class CommentVer01 {
	
	private int num;
	
	private String content;
	
	private String writer;

	@Override
	public String toString() {
		
		return num + "번 " + writer + "가 쓴 댓글은 " + content + "입니다.";
		
	}
	
	public CommentVer01(int num, String content, String writer) {
		
		this.num = num;
		
		this.content = content;
		
		this.writer = writer;
		
	}

}