package Day21;

import java.util.ArrayList;

import lombok.Data;

@Data
public class PhoneBook {
	
	private String name;
	
	private String company;
	
	private ArrayList<PhoneNumber> pnlist = new ArrayList<PhoneNumber>();

	public PhoneBook(String name, String company, ArrayList<PhoneNumber> pnlist) {
		
		this.name = name;
		
		this.company = company;
		
		this.pnlist = pnlist;
		
	}
	
	

	@Override
	public String toString() {
		
		return " 성명 : " + name + " " + " 회사명 : " + company + " " + "전화번호 : " + pnlist;
		
	}
	
	public PhoneBook(String name) {
		
		this.name = name;
		
	}
	
}