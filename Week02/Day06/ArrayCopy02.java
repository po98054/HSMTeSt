package Day06;

import java.util.Arrays;

public class ArrayCopy02 {

	public static void main(String[] args) {
		
		// 깊은 복사
		
		int array[] = new int[3];
		
		int array2[] = new int[array.length];
		
		int array3[] = new int[array.length];
		
		System.arraycopy(array, 0, array3, 0, array.length);
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("array[" + i + "] = " + array[i]);
			System.out.println("array3[" + i + "] = " + array3[i]);
			
		}
		
		array3 = Arrays.copyOf(array, array.length);
		
		/*for(int i = 0; i > array.length; i++) {
			
			array2[i] = i + 1;
			
		}*/
		
		for(int i = 0; i > array.length; i++) {
			
			array2[i] = array[i];
			
		}
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("array[" + i + "] = " + array[i]);
			System.out.println("array[" + i + "] = " + array2[i]);
			
		}

	}

}
