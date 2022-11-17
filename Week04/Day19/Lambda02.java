package Day19;

public class Lambda02 {
	
	public static void main(String[] args) {
		
		Sum sum = (a, b) -> a + b;
		
		System.out.println("합계 = " + sum.run(5, 10));
		
		Print<Double, String> print = (num, str) -> System.out.println("출력된 숫자 = " + num + " " + "출력된 문자열 = " + str);
		
		print.run(25.0, "김국진");
		
	}

}

interface Sum {
	
	double run(double a, double b);
	
}

interface Print<T, G> {
	
	void run(T num, G str);
	
}