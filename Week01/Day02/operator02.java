package Day02;

public class operator02 {

	public static void main(String[] args) {
		
		int num = 1 , num2 = 2;
		
		System.out.println("값 = " + (num+num2)); // 1 + 2 = 3
		System.out.println("값 = " + (num-num2)); // 1 - 2 = -1
		System.out.println("값 = " + (num*num2)); // 1 * 2 = 2
		System.out.println("값 = " + (num/num2)); // 1 / 2 = 0.5 => 소수점은 버리므로 0이 출력이 됨
		System.out.println("값 = " + ((float)num/(float)num2)); // 소수점까지 완벽하게 출력을 할려면 강제 형변환을 하면됨.
		System.out.println("값 = " + (num%num2)); // 1 나머지 2 = 1
		
		boolean bol = num == num2;
		
		System.out.println(bol);
		
		boolean bo2 = num != num2;
		
		System.out.println(bo2);
		
		num = 2;
		num = 2;
		
		int score = 100;
		
		System.out.println(score + "점은 A학점인가? " + (score >= 90));
		
	}

}
