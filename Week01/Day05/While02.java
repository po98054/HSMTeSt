package Day05;

public class While02 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(i < 11) {
			
			if (i % 2 != 0) {
				
				sum = sum + i;
				
			}
			
			i++; // 1 + 3 + 5 + 7 + 9 = 4 + 5 + 7 + 9 = 9 + 7 + 9 = 16 + 9 =25
			
		}
		
		System.out.println("1 ~ 10 까지의 수 중에서 홀수의 합계는 " + sum);

	}

}
