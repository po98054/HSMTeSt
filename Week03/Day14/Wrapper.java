package Day14;

public class Wrapper {
	
	public static void main(String[] args) {
		
		int num = 1;
		
		Integer num2 = num; // 박싱
		
		int num3 = num2; // 언박싱
		
		System.out.println("num = " + num + " num2 = " + num2 + " num3 = " + num3 );
		
		num2 = null;
		
		System.out.println("num = " + num + " num2 = " + num2 + " num3 = " + num3 );
		
		// 문자열을 정수로
		
		String str = "12345";
		
		int num4 = Integer.parseInt(str);
		
		System.out.println("str + 1 = " + (str+1) + " num4 + 1 = " + (num4+1));
		
		// 정수를 문자열로
		
		int num5 = 123;
		
		String str2 = Integer.valueOf(num5).toString();
		
		System.out.println("num5 = " + num5 + " str2 = " + str2);
		
		System.out.println("num5 + 1 = " + (num5+1) + " str2 + 1 = " + (str2+1));
		
		String str3 = "" + num5;
		
		System.out.println("num5 = " + num5 + " str3 = " + str3);
		
		System.out.println("num5 + 1 = " + (num5+1) + " str3 + 1 = " + (str3+1));
		
	}

}