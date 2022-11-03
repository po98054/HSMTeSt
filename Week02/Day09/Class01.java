package Day09;

public class Class01 {

	public static void main(String[] args) {
		
		int x[] = new int[3];
		
		int y[] = new int[3];
		
		for(int i = 0; i < x.length; i++) {
			
			x[i] = i;
			
			y[i] = i;
			
		}
		
		for(int i = 0; i < x.length; i++) {
			
			System.out.println("x[" + i + "] = " + x[i] + " y[" + i + "] = " + y[i]);
			
		}
		
		Point pts[] = new Point[3]; // 좌표들을 저장할 배열을 할당
		
		for(int i = 0; i < x.length; i++) {
			
			pts[i] = new Point(i,i);
			
		}
		
		for(Point pt : pts) {
			
			pt.print();
			
		}
		
	}

}


class Point {
	
	private int x;
	private int y;
	
	public Point() {}
	
	public Point(int x1, int y1) {
		
		x = x1;
		y = y1;
		
	}
	
	public void print() {
		
		System.out.println("x = " + x + " y = " + y);
		
	}
	
	public void move(int x1, int y1) {
		
		x = x1;
		y = y1;
		
	}
	
}