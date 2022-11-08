package Day12;

public class Interface04 {
	
	public static void main(String[] args) {
		
		
		
	}

}

interface TestA {
	
	void testA();
	
	default void testB() {} // => 구현부가 없이도 실행되도록 하는 것
	
}

class TestAA implements TestA{
	
	@Override
	public void testA() {
		
		System.out.println("AA");
		
	}
	
}

class TestAB implements TestA {
	
	@Override
	public void testA() {
		
		System.out.println("AB");
		
	}
	
}