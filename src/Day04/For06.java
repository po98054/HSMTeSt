package Day04;

public class For06 {

	public static void main(String[] args) {
		
		System.out.print("2 ~ 10 사이의 소수를 출력하세요 : ");
		
		int count, i, j;
		
		for(i = 2; i < 11; i++) {
			
			for(j = i, count = 0; j >= 1; j--) {
				
				if (i % j == 0) {
					
					count = count + 1;
					
				}
				
			} if (count == 2) {
				System.out.print(i + " ");
			}
		} 
		}
		
	}