package Day28;

import lombok.Data;

@Data
public class CateBoardVer01ByHSM {
	
	private static int count = 0;
	
	private String name;
	
	private int num;

	public CateBoardVer01ByHSM(String name) {
		
		this.name = name;
		
		count = count + 1;
		
		num = count;
		
	}

	@Override
	public String toString() {
		
		return "번호 : " + num + name;
		
	}
	
}