package Day29;

import lombok.Data;

public class Problem03 {
	
	public static void main(String[] args) {
		
		Board2 board2 = new Board2();
		
		board2.setTitle("공지사항");
		
		String search = "공지";
		
		if(board2.getTitle().contains(search)) {
			
			System.out.println("제목에 공지가 포함되었습니다.");
			
		} else {
			
			System.out.println("제목에 공지가 포함되어 있지 않습니다.");
			
		}
	}

}

@Data
class Board2 {
	
	String title;
	
	String contents;
	
}