package Day17;

import lombok.Data;

//게시글은 번호, 제목, 내용, 작성자, 작성일, 조회수로 구성

@Data
public class BoardVer01 {
	
	private int num = 1;
	
	private String title;
	
	private String content;
	
	private String writer;
	
	private String createDate;
	
	private int count;
	
    public BoardVer01(int num, String title, String content, String writer, String createDate, int count) {
    	
    	this.num = num;
    	
    	this.title = title;
		
		this.content = content;
		
		this.writer = writer;
		
		this.createDate = createDate;
    	
    	this.count = count;
    	
    	num = num + 1;
    	
    	count = count + 1;
    	
    }

	public BoardVer01(String title, String content, String writer, String createDate) {
		
		this.title = title;
		
		this.content = content;
		
		this.writer = writer;
		
		this.createDate = createDate;
		
	}
	
	public BoardVer01(String title) {
		
		this.title = title;
		
	}

}