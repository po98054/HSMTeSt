package Day19;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

public class Lambda01 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		
		list.add(50);
		
		list.add(-1);
		
		list.add(100);
		
		list.add(22);
		
		System.out.println(list);
		
		System.out.println("--------------------------------");
		
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1 - o2;
				
			}
			
		});
		
		System.out.println(list);
		
		System.out.println("--------------------------------");
		
		Collections.sort(list, (a, b) -> a-b);
		
		System.out.println(list);
		
	}

}