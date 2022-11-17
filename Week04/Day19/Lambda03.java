package Day19;

import java.util.function.Consumer;

public class Lambda03 {
	
	public static void main(String[] args) {
		
		Consumer<String> print = str -> System.out.println("출력된 문자열 = " + str);
		
		print.accept("김국진");
		
		
		
	}

}