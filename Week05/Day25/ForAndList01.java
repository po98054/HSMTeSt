package Day25;

import java.util.ArrayList;

public class ForAndList01 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int size = 9;
		
		int num;
		
		int min = 1;
		
		int max = 9;
		
		for(int i = 0; i < size; i++) {
			
			num = (int)(Math.random()*(max - min + 1) + min);
			
			list.add(num);
			
		}
		
		System.out.println(list);
		
	}

}