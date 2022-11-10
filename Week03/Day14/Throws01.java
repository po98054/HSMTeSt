package Day14;

public class Throws01 {
	
	public static void main(String[] args) {
		
		//System.out.println(mod(1,0));
		
		try {
			
			throwTest();
			
		} catch(Exception e) {
			
			System.out.println("예외 발생");
			
		}
		
	}
	
	public static int mod(int num, int num2) throws ArithmeticException{
		
		return num % num2;
		
	}
	
	public static void throwTest() throws Exception{
		
		throw new Exception();
		
	}

}