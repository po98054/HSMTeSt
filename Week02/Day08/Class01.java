package Day08;

public class Class01 {

	public static void main(String[] args) {
		
		Point pt = new Point();
		
		pt.printMa(20, 40);
		
		pt.move(1, 2);
		
	}
	
}
	
	// 2차원 좌표 평면의 점을 나타내는 클래스
	
	class Point {
		
		int x;
		int y;
		
		public void printMa(int x, int y) {
			
			System.out.println(x + ", " + y);
			
		}
		
		public void move(int x1, int y1) {
			
			x = x + x1;
			y = y + y1;
			
			System.out.println(x + ", " + y);
			
		}
		
	}