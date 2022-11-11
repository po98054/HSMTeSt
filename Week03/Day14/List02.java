package Day14;

import java.util.ArrayList;
import java.util.Iterator;

public class List02 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		
		list.add(1, 6);
		
		list.remove(0);
		
		list.remove((Integer)6);
		
		list.add(5);
		
		list.add(8);
		
		/*System.out.println(list);
		
		System.out.println("5가 있나요 ? " + list.contains(5));
		
		System.out.println("5가 어디에 있나요 ? " + list.indexOf(5));
		
		System.out.println("1번지에 있는 값 : " + list.get(1));*/
		
		Iterator<Integer> it = list.iterator();
		
		//System.out.println(list.iterator());
		
		while(it.hasNext()) {
			
			Integer tmp = it.next();
			
			System.out.println(tmp + " ");
			
		}
		
		//System.out.println();
		
	}

}