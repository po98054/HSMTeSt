package Day06;

import java.util.Arrays;
import java.util.Collections;

public class ArrayCopy08 {
	
	public static void main(String[] args) {
		
		// 버블 정렬을 이용한 배열 정렬
		
		int array[] = {1, 3, 5, 7, 2, 8, 6, 9};
		
		int temp = 0;
		
		for(int i = 0; i < array.length - 1; i++) {
			
			for(int j = 0; j < array.length - 1 - i; j++) {
				
				if(array[j] > array[j+1]) {
					
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
				
			}
			
			for (int temp2 : array) {
				
				System.out.print(temp2 + " ");
				
			}
			
			System.out.println();
			
		}
		
		/*for (int temp2 : array) {
			
			System.out.println(temp2 + " ");
			
		}*/
		
		int array3[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		Arrays.sort(array3);
		
		for (int temp4 : array3) {
			
			System.out.print(temp4 + " ");
			
		}
		
		System.out.println();
		
		Integer array2[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		Arrays.sort(array2, Collections.reverseOrder());
		
		for (int temp3 : array2) {
			
			System.out.print(temp3 + " ");
			
		}
		
	}

}
