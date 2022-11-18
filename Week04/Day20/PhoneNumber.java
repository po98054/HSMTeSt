package Day20;

import lombok.Data;

@Data
public class PhoneNumber{
	
	private String homeNumber;
	
	private String phoneNumber;
	
	private String companyNumber;

	public PhoneNumber(String homeNumber, String phoneNumber, String companyNumber) {
		
		
		this.homeNumber = homeNumber;
		
		this.phoneNumber = phoneNumber;
		
		this.companyNumber = companyNumber;
		
	}

	public PhoneNumber(PhoneNumber p) {
		
		this(p.companyNumber, p.homeNumber, p.phoneNumber);
		
	}

	@Override
	public String toString() {
		
		return " 집 전화번호 : " + homeNumber + " " + " 핸드폰 전화번호 : " + phoneNumber + " " + " 회사 전화번호 : " + companyNumber;
		
	}
	
	
	

}