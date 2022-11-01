package Day07;

public class Method04 {
	
	public static void main(String[] args) {
		
		sum(1,10);
		
		sum(5,10);
		
		sum(1,3);
		
		//int start = 1;
		//int end = 4;
		
		//sum(start,end);
		
		sum(1,2);
		
		/* tmp = 0 start = 1 end = 10 => start = 10 end = 1
		 * start = 1 temp = 1 => end = 10 start = 10 => tmp = 1 end = 1 start = 10
		 * int tmp = start
		 * start = end;
		 * end = tmp
		 * */
		
	System.out.println("1 ~ 10 까지의 최종 합계 = " + sum2(1,10));
	System.out.println("5 ~ 10 까지의 최종 합계 = " + sum2(5,10));
	System.out.println(sum2(1,3));
	//System.out.println(start + " ~ " + end + " 까지의 최종 합계 = " + sum2(start,end));
		
	}
	
	public static void sum(int start, int end) {
		
		int sum = 0;
		
		for(int i = start; i <= end; i++) {
			
			sum = sum + i;
			
		}
		
		System.out.println(start + " 부터 " + end + " 까지의 총 합계 = " + sum);
		
	}
	
	public static int sum2(int start, int end) {
		
		int sum = 0;
		
		for(int i = end; i >= start; i--) {
			
			sum = sum + i;
			
		}
		
		return sum;
	
	}


}
