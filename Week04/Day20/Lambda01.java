package Day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lambda01 {
	
	public static void main(String[] args) {
		
		// 람다식을 이용하여 생성된 것은 무엇일까요? => 객체
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(25);
		
		list.add(10);
		
		list.add(21);
		
		list.add(14);
		
		System.out.println("정렬 전 리스트 목록 : " + list);
		
		System.out.println("---------------------------");
		
		Comparator<Integer> comparator = (a,b) -> a - b;
		
		Collections.sort(list, comparator);
		
		System.out.println("오름 차순 정렬 후 리스트 목록 : " + list);
		
		System.out.println("---------------------------");
		
		Comparator<Integer> comparator2 = (a,b) -> b - a;
		
		Collections.sort(list, comparator2);
		
		System.out.println("내림 차순 정렬 후 리스트 목록 : " + list);
		
		System.out.println("---------------------------");
		
		System.out.println("정렬 후 리스트 목록 : " + comparator.compare(2,1));
		
	}

}