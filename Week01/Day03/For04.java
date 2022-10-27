package Day03;

public class For04 {

	public static void main(String[] args) {
		
		// 결과값으로 짝수 출력하는 코드
		
		for (int i = 1; i < 6; i++) {
			
			System.out.print((2*i) + " ");
			
		}
		
		System.out.println();
		
		//For문으로만 짝수 출력하는 코드
		
		for (int i = 2; i <= 10; i+=2) {
			
			System.out.print(i + " ");
			
		}
		
		System.out.println();
		
		// for문과 if문을 활용한 짝수 출력 코드
		
		for (int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) {
				
				System.out.print(i + " ");
				
			}
			
		}
		
	}

}
