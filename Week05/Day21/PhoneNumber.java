package Day21;

import java.util.regex.Pattern;

import lombok.Data;

@Data
public class PhoneNumber {
	
	private String pName;
	
	private String number;
	
	public void setNumber(String number) {
		
		String regex = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		if(Pattern.matches(regex, number)) {
			
			this.number = number;
			
		} else {
			
			throw new RuntimeException("예외 발생 : 번호를 잘못 입력했습니다.");
			
		}
		
	}

	public PhoneNumber(String pName, String number) {
		
		this.pName = pName;
		
		setNumber(number);
		
	}

	@Override
	public String toString() {
		
		return "이름(집, 직장) : " + pName + " " + " 번호 (예 : 010-2345-5678) : " + number;
		
	}

	public void update(String pName, String number) {
		
		this.pName = pName;
		
		this.number = number;
		
	}
	
	
	
}