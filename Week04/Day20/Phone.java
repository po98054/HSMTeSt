package Day20;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Phone {
	
	private String lastName;
	
	private String firstName;
	
	private String company;
	
	private ArrayList<PhoneNumber> numberList = new ArrayList<PhoneNumber>();
	
	/*public boolean addNumber(PhoneNumber number) {
		
		if(number == null) {
			
			throw new RuntimeException("성적 정보가 없어서 추가 할 수 없습니다.");
			
		}
		
		boolean res = numberList.contains(number);
		
		if(res) {
			
			return false;
			
		}
		
		numberList.add(new PhoneNumber(number));
		
		return true;
		
	}*/

	public Phone(String lastName, String company) {
		
		this.lastName = lastName;
		
		this.company = company;
		
	}
	
	public Phone(String lastName, String firstName, String company) {
		
		this.lastName = lastName;
		
		this.firstName = firstName;
		
		this.company = company;
		
	}

	@Override
	public String toString() {
		
		return "성 : " + lastName + " " + "이름 : " + firstName + " " + "회사명 : " + company;
		
	}
	
	

}