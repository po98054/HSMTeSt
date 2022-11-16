package Day18;

public class Enum01 {
	
	public static void main(String[] args) {
		
		Type type = Type.수입;
		
		System.out.println("구분 : " + type);
		
		System.out.println("구분 : " + Type.지출);
		
	    type = Type.valueOf("지출");
	    
	    System.out.println("구분 : " + type);
		
	}

}

enum Type {
	
	수입, 지출
	
}