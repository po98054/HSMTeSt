package Day32;

public class MathEx01 {
	
	public static void main(String[] args) {
		
		double dnum = 3.14;
		
		System.out.println("dnum의 반올림은 " + Math.round(dnum)); // 3.14를 첫 번째 자리에서 반올림 => 결과 1이기 때문에 버림이지 => 그대로 3이 나옴.
		
		System.out.println("-------------------------------");
		
		System.out.println("dnum의 반올림은 " + Math.round(dnum*10) /10.0);
		
		System.out.println("-------------------------------");
		
		System.out.println("dnum의 버림은 " + Math.floor(dnum));
		
		System.out.println("-------------------------------");
		
		System.out.println("dnum의 올림은 " + Math.ceil(dnum));
		
		System.out.println("-------------------------------");
		
		int a = 4;
		
		int b = 2;
		
		System.out.println("4의 2제곱은 " + (int)Math.pow(a, b) + "입니다.");
		
		System.out.println("-------------------------------");
		
		System.out.println("루트 4는 " + (int)Math.sqrt(a) + "입니다.");
		
	}

}