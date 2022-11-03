package Day09;

public class This01 {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		Test t2 = new Test(10);
		
		t.print();
		
		t2.print();

	}

}

class Test{
	
	private int num;
	
	public void setNum(int num) {
		
		this.num = num;
		
	}
	
	public int getNum() {
		
		return num;
		
	}
	
	public void print() {
		
		System.out.println(this.getNum());
		
	}
	
	public Test() {
		
		this(10);
		
	}
	
	public Test(int num) {
		
		this.num = num;
		
	}
	
	}