package Day03;

public class For01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int min = 45;
		
		for (int i = 0; i < 10; i++) {
			
			sum = sum + i; // 0 + 0 -> 0 + 1 -> 1 + 2 -> 3 + 3 -> 6 + 4 -> 10 + 5 -> 15 + 6 -> 21 + 7 -> 28 + 8 -> 36 + 9 -> 45
			
		}
		
		System.out.println("마지막 합계는 " + sum + "입니다.");
		
		for (int j = 9; j > 0; j--) {
			
			min = min - j; // 45 - 9 -> 36 - 8 -> 28 - 7 -> 21 - 6 -> 15 - 5 -> 10 - 4 -> 6 - 3 -> 3 - 2 -> 1 - 1 -> 0
			
		}
		
		System.out.println("마지막 차는 " + min + "입니다.");

	}

}
