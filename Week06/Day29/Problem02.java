package Day29;

import lombok.Data;

public class Problem02 {
	
	public static void main(String[] args) {
		
		Board board = new Board(1);
		
		System.out.println(board.num);
		
	}

}

@Data
class Board {
	
	int num;
	
	public Board(int num) {
		
		this.num = num;
		
	}
	
}