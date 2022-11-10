package Day14;

public class Exception01 {
	
	public static void main(String[] args) {
		
		try {
			
			throwException();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
	public static void throwException() throws Exception {
		
		throw new Exception("예외 발생");
		
	}

}