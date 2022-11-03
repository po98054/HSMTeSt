package Day09;

public class FieldInit01 {

	public static void main(String[] args) {
		
		Test02 t = new Test02(3);
		
		t.Print();

	}

}

class Test02{
	
	private int num; // 기본 초기 값으로 초기화.
	
	private int num2 = 1; // 2. 명시적 초기화
	
	private int num3 = 1; // 3. 초기화 블록을 통한 초기화
	
	private int num4 = 1; // 4. 생성자를 통한 초기화.
	
	{
		
		num3 = 2;
		
	}
	
	public Test02(int num4) {
		
		this.num4 = num4;
		
	}
	
	public void Print() {
		
		System.out.println(num + " " + num2 + " " + num3 + " " + num4);
		
	}
	
}