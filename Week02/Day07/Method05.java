package Day07;

public class Method05 {
	
	public static void main(String[] args) {
		
		int array[] = {1, 2, 3, 10};
		
		printArray(array);
		
	}
	
	public static void printArray(int array[]) {
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("array[" + i + "] = " + array[i]);
			
		}
		
	}

}
