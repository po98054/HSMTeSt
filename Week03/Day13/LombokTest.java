package Day13;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class LombokTest {
	
	public static void main(String[] args) {
		
		TestA t = new TestA();
		
		t.setNum(10);
		
		System.out.println(t.getNum());
		
		System.out.println(t);
		
		TestA t1 = new TestA();
		
		t1.setNum(10);
		
		System.out.println(t.equals(t1));
		
	}

}

@Getter
@Setter
@ToString
class TestA{
	
	private int num;
	
}