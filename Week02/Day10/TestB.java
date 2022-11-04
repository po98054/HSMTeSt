package Day10;

public class TestB {
	
	private int num1; // num1은 접근제한자가 private라서 TestA 클래스에서만 사용가능함.
	
	int num2; // num2는 접근제한자가 default라서 어디서나 사용가능하다.
	
	public int num3; // public도 마찬가지지만.. 동일한 패키지내에서만 사용 가능하다..

}