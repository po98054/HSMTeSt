package Day08;

public class Class01 {

	public static void main(String[] args) {
		
		Point pt = new Point();
		
		pt.print();
		
		Point pt1 = new Point(3,1);
		
		pt1.print();
		
	}
	
}
	
	// 2차원 좌표 평면의 점을 나타내는 클래스
	
	class Point {
		
		private int x;
		private int y;
		
		public void print() {
			
			System.out.println("좌표 : " + x + "," + y);
			
		}
		
		public void move(int x1, int y1) {
			
			x = x + x1;
			y = y + y1;
			
			System.out.println(x + ", " + y);
			
		}
		
		public Point() {
			
			x = 10;
			y = 10;
			
		}
		
		public Point(int x1, int y1) {
			
			x = x1;
			y = y1;
			
		}
		
		public Point(Point pt) {
			
			x = pt.x;
			y = pt.y;
			
		}
		
	}