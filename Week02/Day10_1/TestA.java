package Day10_1;

public class TestA { //그러나 import 받으면 사용 가능함..
	
	private int num1; // num1은 접근제한자가 private라서 TestA 클래스에서만 사용가능함.
	
	int num2; // num2는 접근제한자가 default라서 어디서나 사용가능하다. 패키지가 다르기에 num2를 사용 못한다.
	
	public int num3; // public도 마찬가지지만.. 동일한 패키지내에서만 사용 가능하다.. 허나 여기서는 패키지가 다르기에 num3를 사용 못한다. 그러나 import 받으면 사용 가능함..

}