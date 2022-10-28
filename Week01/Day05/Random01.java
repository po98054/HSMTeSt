package Day05;

public class Random01 {

	public static void main(String[] args) {
		
		// 랜덤 정수 생성 예제
		
		// math.random(); 0이상 1미만의 랜덤 실수 생성 => 0.xx를 말하는 거임.
		// math.rha
		
		int min = 1; 
		int max = 9;
		
		System.out.println("최소값 = " + min + " 최대값 = " + max);
		
		int r = (int)(Math.random()*(max-min+1)+min);
		
		System.out.println(r);

	}

}
