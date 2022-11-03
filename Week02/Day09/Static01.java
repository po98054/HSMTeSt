package Day09;

public class Static01 {

	public static void main(String[] args) {
		
		Class01.main(null);
		
		KiaCar k = new KiaCar("하성민");
		
		k.Print();
		
		
		
	}
	
}

class KiaCar{
	
	public final String logo = "KIA";
	
	private String name;
	
	public KiaCar(String name) {
		
		this.name = name;
		
	}
	
	public void Print() {
		
		System.out.println("당신의 이름은 " + name + "이며 당신의 회사는 " + logo);
		
	}
	
}