package Day15;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

public class Sort01 {
	
	public static void main(String [] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		
		list.add(6);
		
		list.add(2);
		
		list.add(9);
		
		list.add(13);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2 - o1;
				
			}
			
		});
		
		System.out.println(list);
		
	}

}