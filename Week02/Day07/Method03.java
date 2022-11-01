package Day07;

public class Method03 {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		int b = 55;
		
		printNum(b);
		printTest(t);
		printNum(b);
		printTest(t);
		
	}
	
	public static void printNum(int num) {
		
		System.out.println("정수 = " + num);
		
		num = 40;
		
	}
	
	public static void printTest(Test t) {
		
		System.out.println(t.a);
		
		t.a = 30;
		
	}
	
}

class Test{
	
	int a;
	
}