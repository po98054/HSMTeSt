package Day08;

public class MethodOverride {

	public static void main(String[] args) {
		
		System.out.println(sum(1,2));
		System.out.println(sum(2,5,5));
		System.out.println(sum(2.3,1.2));
		
		
	}
	
	public static int sum(int num, int num2) {
		
		return num + num2;
		
	}
	
	public static int sum(int num, int num2, int num3) {
		
		return num + num2 + num3;
		
	}
	
	public static double sum(double num, double num2) {
		
		return num + num2;
		
	}

}
