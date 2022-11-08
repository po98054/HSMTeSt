package Day12;

public class Object02 {
	
	public static void main(String[] args) {
		
		Object01 std = new Object01(1, 2);
		
		Object01 std2 = new Object01(1, 3);
		
		std.toString();
		
		std2.toString();
		
		System.out.println("두 개체를 ==로 비교 : " + (std == std2));
		
		System.out.println("두 개체를 equals로 비교 : " + std.equals(std2));
		
	}

}
