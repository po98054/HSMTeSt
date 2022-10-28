package Day05;

public class Array01 {

	public static void main(String[] args) {
		
		int array[];
		
		array = new int[3];
		
		int array2[] = new int[4];
		
		// 배열은 0번지 부터 시작함 (1번지 부터 시작 X)
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = i + 2;
			
			System.out.println("array[" + i + "] = " + i);
			
		}
		
		System.out.println("---------------------");
		
		for (int i = 0; i < array2.length; i++) {
			
			array2[i] = i;
			
			System.out.println("array2[" + i + "] = " + i);
			
		}
		
		System.out.println("------------------------");
		
		for(int i : array) {
			
			System.out.println(i);
			
		}
		
	}

}
