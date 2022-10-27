package Day04;

public class For01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int sum2 = 0;
		
		// 1.
		
		for (int i = 1; i <= 10; i++) {
			
			if (i % 2 == 0) {
				
				sum = sum + i; // 0 + 2 + 4 + 6 + 8 + 10 = 2 + 4 + 6 + 8 + 10 = 6 + 6 + 8 + 10 = 12 + 8 + 10 = 20 + 10 = 30
				
			}
			
		}
		
		System.out.println("최종 합계 : " + sum);
		
		// 2.
		
		for(int i = 2; i <= 10; i+= 2) {
			
			sum2 = sum2 + i;
			
		}
		
		System.out.println("최종 합계 : " + sum2);
		
	}

}
