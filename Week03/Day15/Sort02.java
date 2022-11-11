package Day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort02 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("하성민");
		
		list.add("김국진");
		
		list.add("유재석");
		
		list.add("박지성");
		
		list.add("이광수");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return -o1.compareTo(o2);
				
			}
			
		});
		
		System.out.println(list);
		
	}

}