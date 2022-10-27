package Day04;

public class For05 {

	public static void main(String[] args) {
		
		int num = 3;
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println(num + " * " + i + " = " + (num*i));
			
		}
		
		System.out.println();
		
		for(int i = 2; i < 10; i++) {
			
			for(int j = 1; j < 10; j++) {
				
				System.out.println(i + " * " + j + " = " + (i*j));
				
			}
			
		}

	}

}
