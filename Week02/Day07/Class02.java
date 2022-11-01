package Day07;

public class Class02 {
	
	public static void main(String[] args) {
		
		int num1 = 6;
		int num2 = 8;
		
		System.out.println("두 정수의 합 = " + sum(4,4));
		
		System.out.println("두 정수의 합 = " + sum(num1,num2));
		
		sum2(5,6);
		
	}
	
    // 두 정수가 주어지면 두 정수의 합을 알려주는 메소
	
	public static int sum(int num1, int num2) {
		
		return num1 + num2;
		
	}
	
	public static void sum2(int num1, int num2) {
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		
	}

}