package Day19;

public class Chaining01 {
	
	public static void main(String[] args) {
		
		String str = "James";
		
		System.out.println(str.substring(2).charAt(0));
		
		System.out.println(1);
		
		System.out.println(toString(120).charAt(2));
		
		print(10);
		
	}
	
	public static String toString(int num) {
		
		return num + "";
		
	}
	
	public static void print(int num) {
		
		System.out.println(num);
		
	}

}