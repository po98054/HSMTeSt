package Day11;

public class Inheritance01 {
	
	public static void main(String[] args) {
		
		Child01 ch1 = new Child01();
		
		System.out.println(ch1.num2);
		
		System.out.println(ch1.num3);
		
		ch1.print();
		
	}

}

class Child01 extends Parent1 {
	
	public Child01() {
		
		super(1,2,3);
		
	}
	
	@Override
	public void print() {
		
		super.print();
		
		System.out.println("자식 클래스의 메소드 입니다.");
		
	}
	
}

class Parent1 {
	
	private int num = 1;
	
	int num2 = 2;
	
	protected int num3 = 3;
	
	public void print() {
		
		System.out.println("숫자1 = " + num);
		
		System.out.println("숫자2 = " + num2);
		
		System.out.println("숫자3 = " + num3);
		
		System.out.println("안녕");
		
	}
	
	public Parent1(int num, int num2, int num3) {
		
		this.num = num;
		
		this.num2 = num2;
		
		this.num3 = num3;
		
	}
	
}

class Parent2 {
	
	public void print() {
		
		System.out.println("안녕하세요.");
		
	}
	
}