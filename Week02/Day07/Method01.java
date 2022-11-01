package Day07;

public class Method01 {
	
	public static void main(String[] args) {
		
		// 7단을 출력하는 코드
		
		gogudan(7);
		
		System.out.println("====================================");
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println(7 + " * " + i + " = " + gogudan2(i));
			
		}
		
	}
	
	// 구구단을 출력하는 메소드
	// 1.
	
	public static void gogudan(int num1) {
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println(num1 + " * " + i + " = " + (num1*i)); 
			
		}
		
	}
	
	public static int gogudan2(int num1) {
		
		return 7 * num1;
		
	}

}
