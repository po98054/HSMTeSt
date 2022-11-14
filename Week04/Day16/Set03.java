package Day16;

import java.util.HashSet;
import java.util.Iterator;

public class Set03 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		
		set.add(3);
		
		set.add(15);
		
		for (Integer temp : set) {
			
			System.out.println("temp에 있는 값 : " + temp);
			
		}
		
		System.out.println();
		
		Iterator<Integer> it = set.iterator();
		
		while (it.hasNext()) {
			
			Integer temp = it.next();
			
			System.out.println("temp 에 있는 값 : " + temp);
			
		}
		
		System.out.println();
		
	}

}