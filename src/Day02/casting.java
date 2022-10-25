package Day02;

public class casting {

	public static void main(String[] args) {
		
		int num = 10;
		int num2 = 20;
		
		float sum = num + num2;
		
		System.out.println(num + " + " + num2 + " = " + sum);
		
		float num3 = 10.1f;
		float num4 = 10.2f;
		
		int sum2 = (int) num3 + (int) num4;
		
		System.out.println(num3 + " + " + num4 + " = " + sum2);
		
		float num5 = 1.234f;
		
		System.out.printf("%.2f", num5);
	}

}
