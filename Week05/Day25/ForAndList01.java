package Day25;

import java.util.ArrayList;

import java.util.Random;

public class ForAndList01 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int num;
		
		int r;
		
		int min = 1;
		
		int max = 9;
		
		for(int i = min; i <= max; i++) {
			
		    list.add(i);
		}
		
		while(list.size() != 0) {
			
			r = random(0, list.size() - 1);
			
			num = list.remove(r);
			
			result.add(num);
			
		}
		
		System.out.println(result);
		
	}
	
	public static int random(int min, int max) {
		
		if(max < min) {
			
			int temp = max;
			
			max = min;
			
			min = temp;
			
		}
		
		Random r = new Random();
		
		// nextInt(정수) : 0 이상 정수 미만의 랜덤한 정수를 알려줌
		
		return r.nextInt(max - min + 1) + min;
		
	}

}