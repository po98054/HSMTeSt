package Day14;

public class List01 {
	
	public static void main(String [] args) {
		
		A<Integer> a = new A<Integer>();
		
		a.num = 10;
		
		System.out.println(a.num);
		
		A<String> b = new A<String>();
		
		b.num = "Hello";
		
		System.out.println(b.num);
		
	}

}

class A <T>{
	
	T num;
	
}