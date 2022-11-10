package Day14;

import lombok.Data;

public class RunTimeException01 {
	
	public static void main(String [] args) {
		
		Parent p = null;
		
		exceptionTest(p);
		
	}
	
	public static void exceptionTest(Parent a) {
		
		a.print();
		
	}

}

@Data
class Parent {
	
	private int num;
	
	public void print() {
		
		System.out.println(num);
		
	}
	
}