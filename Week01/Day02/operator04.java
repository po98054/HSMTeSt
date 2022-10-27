package Day02;

public class operator04 {

	public static void main(String[] args) {
		
		int num = 20;
		int num2 = 30;
		
		boolean bo1 = num < 30 && num2 > 40; // false (20 < 30 true 30 > 40 false)
		boolean bo2 = num < 30 || num2 > 40; // true
		
		System.out.println(bo1);
		System.out.println(bo2);
		
		int score = 85;
		
		boolean isB = score >= 80 && score < 90; // 85 >= 80 true 85 < 90 true
		
		System.out.println(isB);
		
		num += num;
		
		System.out.println(num); //40
		
		String result = score >= 60 ? "통과" : "탈락";
		
		System.out.println(result);
		
		int max = num > num2 ? num2 : num;
		
		System.out.println(max);
		
		boolean bo3 = num > num2 ? false : true;
		
		System.out.println(bo3);
		
	}

}
