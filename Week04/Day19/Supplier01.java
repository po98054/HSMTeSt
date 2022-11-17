package Day19;

import java.util.function.Supplier;

public class Supplier01 {
	
	public static void main(String[] args) {
		
		System.out.println("랜덤 숫자 값 : " + num(() -> (int) (Math.random() * 10)));
		
	}
	
	public static int num(Supplier<Integer> s) {
		
		return s.get();
		
	}

}