package Day16;

import java.util.ArrayList;
import java.util.HashSet;

public class Set02 {
	
	public static void main(String [] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int maxCount = 3;
		
		int min = 1;
		
		int max = 9;
	
		HashSet<Integer> set = new HashSet<Integer>();
		
		while (set.size() < maxCount) {
			
			int r = (int) (Math.random() * (max - min + 1) + min);
			
			set.add(r);
			
		}
		
		list.addAll(set);
		
		System.out.println("리스트에 있는 목록 : " + list);
		
	}

}