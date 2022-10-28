package Day05;

public class Array03 {

	public static void main(String[] args) {
			
		int num, i, count;
		
		int index = 0;
		
		int array[] = new int[5];
		
		for(num = 2; ;num++) {
			
			for(i = 1, count = 0; i <= num; i++) {
				
				if (num % i == 0) {
					
					count++;
					
				}
				
			}
			
			if (count == 2) {
				
				array[index] = num;
				index++;
				
			}
			
			if (index == array.length) {
				
				break;
				
			}
			
		}
		
		for(int j = 0; j < 5; j++) {
			
			System.out.println("array[" + j + "] = " + array[j]);
			
		}
	}

}
