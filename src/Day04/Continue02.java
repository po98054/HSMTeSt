package Day04;

public class Continue02 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i < 11; i++) {
			
			if (i % 2 != 0) {
				
				continue;
				
			}
			
			sum = sum + i;
			
		}

		System.out.println(sum);
		
	}

}
