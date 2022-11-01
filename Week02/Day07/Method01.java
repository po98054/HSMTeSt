package Day07;

public class Method01 {
	
	public static void main(String[] args) {
		
		// 7단을 출력하는 코드
		
		gogudan(7);
		
		System.out.println("====================================");
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println(7 + " * " + i + " = " + gogudan2(i));
			
		}
		
		System.out.println("====================================");
		
		gogudan4(5,1,9);
		
		System.out.println("====================================");
		
		for(int i = 2; i < 10; i++) {
			
			for(int j = 1; j < 10; j++) {
				
				System.out.println(i + " * " + j + " = " + gogudan3(i,j));
			}
			
			System.out.println("====================================");
			
		}
		
	}
	
	// 구구단을 출력하는 메소드
	// 1.
	
	public static void gogudan(int num1) {
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println(num1 + " * " + i + " = " + (num1*i)); 
			
		}
		
	}
	
	// 2.
	
	public static int gogudan2(int num2) {
		
		return 7 * num2;
		
	}
	
	// 2. 강사님이 알려주신 방법
	
	public static void gogudan4(int num, int start, int end) {
		
		for(int i = start; i <= end; i++) {
			
			System.out.println(num + " * " + i + " = " + (num*i)); 
			
		}
		
	}
	
	// 3.
	
	public static int gogudan3(int num, int num2) {
		
		return num * num2;
		
	}

}
