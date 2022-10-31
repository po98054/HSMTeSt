package Day06;

public class ArrayCopy01 {
	
	public static void main(String[] args) {
		
		// 배열의 얕은 복사
		
		int array[] = new int[3];
		
		int array2[] = array;
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = i + 1;
			
			System.out.println("array[" + i + "] = " + array[i]);
			System.out.println("array[" + i + "] = " + array2[i]);
			
		}
		
		array[0] = 20;
		
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("array[" + i + "] = " + array[i]);
			System.out.println("array[" + i + "] = " + array2[i]);
			
		}
		
	}

}
