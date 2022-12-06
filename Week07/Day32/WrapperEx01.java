package Day32;

public class WrapperEx01 {
	
	public static void main(String[] args) {
		
		// 문자열을 정수로 (문자열을 정수 OR 실수로 바꾸는 메소드명 parse타입)
		
		String str = "123";
		
		int num = Integer.parseInt(str);
		
		System.out.println("str의 값은 " + num + "입니다.");
		
	    System.out.println("-------------------------------");
	    
	    // 문자열을 실수로
		
		str = "3.14";
		
		double dnum = Double.parseDouble(str);
		
		System.out.println("str의 값은 " + dnum + "입니다.");
		
		System.out.println("-------------------------------");
		
		// 정수를 문자열로 바꾸는 메소드는 valueOf
		
		num = 30;
		
		str = String.valueOf(num);
		
		System.out.println("str의 값은 " + str + "입니다.");
		
	}

}