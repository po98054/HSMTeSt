package Day10;

import Day10_1.TestA;

public class AccessModifierEx01 {
	
	public static void main(String[] args) {
		
		TestA A = new TestA();
		
		TestB B = new TestB();
		
		A.num3 = 0;
		
		B.num2 = 10;
		
		B.num3 = 30;
		
	}

}