package Day11;

public class Polymorphism01 {
	
	public static void main(String[] args) {
		
		connectToComputer(new Mouse());
		
		connectToComputer(new KeyBoard());
		
		connectToComputer(new Speaker());
		
	}
	
	public static void connectToComputer(UsbProduct obj) {
		
		System.out.println(obj.type + "와 연결되었습니다.");
		
	}

}

class UsbProduct{
	
	public String type;
	
}

class Mouse extends UsbProduct{
	
	{
		
		type = "마우스";
		
	}
	
}

class KeyBoard extends UsbProduct{
	
	{
		
		type = "키보드";
		
	}
	
}

class Speaker extends UsbProduct{
	
	{
		
		type = "스피커";
		
	}
	
}