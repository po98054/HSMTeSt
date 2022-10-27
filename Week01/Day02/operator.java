package Day02;

public class operator {

	public static void main(String[] args) {
		
		boolean bo1 = true;
		boolean bo2 = !bo1;
		
		System.out.println(bo1);
		System.out.println(bo2);
		System.out.println(!bo2);
		
		int a = 10;
		int b = 20;
		int sum = ++a + b; // 31 
		
		System.out.println(sum);
		System.out.println(a);
		
		System.out.println(a);
		
		int sum2 = a++ + b; // 31
		
		System.out.println(sum2);
		System.out.println(a);
		
		int a2 = 2;
		int b2 = 3;
		
		System.out.println("a = " + a2); // 2
		System.out.println("a = " + a2++); // 2
		
		System.out.println(a2);
		System.out.println("a2 + a = " + (a2+a)); //15
		
		System.out.println("b2 = " + b2); // 3
		System.out.println("++b2 = " + ++b2); //4
		
		System.out.println("b2 = " + b2); // 4
		System.out.println("b + b2 = " + (b+b2)); // 24
		
		System.out.println("a2 = " + a2); // 3
		System.out.println("a2 = " + a2--); // 3
		
		System.out.println(a2);
		System.out.println("a2 + a = " + (a2+a)); //14
		
		System.out.println("b2 = " + b2); // 4
		System.out.println("--b2 = " + --b2); //3
		
		System.out.println("b2 = " + b2); // 3
		System.out.println("b + b2 = " + (b+b2)); // 23
		
	}

}
