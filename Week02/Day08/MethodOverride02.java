package Day08;

public class MethodOverride02 {

	public static void main(String[] args) {
		
		System.out.println(sum());
		System.out.println(sum(1));
		System.out.println(sum(1,2));
		
	}
	
	// 매개변수의 개수를 다양하게 하고 싶을 때
	
	public static int sum(int ...nums) {
		
		if(nums == null || nums.length == 0) {
			
			return 0;
			
		}
		
		int sum = 0;
		
		for(int num : nums) {
			
			sum += num;
			
		}
		
		return sum;
		
	}
	
	public static int sum(int num) {
		
		return num;
		
	}
	
	public static void test(int grade, int classNum, int... score) {
		
		
		
	}

}
