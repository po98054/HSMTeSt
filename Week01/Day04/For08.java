package Day04;

public class For08 {

	public static void main(String[] args) {
		
		// 중첩 For문에서 *를 이용한 그림 그리기
		
		// 1. 원 순
		
		for(int i = 1; i < 6; i++) {
			
			for (int j = i; j > 0; j--) {
				
				System.out.print("*");
				
			}
			
			System.out.println("");
			
		}
		
		System.out.println("---------");
		
		// 2. 역 순
		
		for(int i = 5; i > 0; i--) {
			
			for (int j = i; j > 0; j--) {
				
				System.out.print("*");
				
			}
			
			System.out.println("");
			
		}
		
	}

}
