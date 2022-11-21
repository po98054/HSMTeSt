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



	public void print() {
		
		System.out.println("이름 : " + name + " " + " 회사명 : " + company + " ");
		
		System.out.println("-------------------");
		
		for(PhoneNumber temp : pnlist) {
			
			System.out.println(temp);
			
		}
		
	}



	public void update(String name, String company) {
		
		this.name = name;
		
		this.company = company;
		
	}



	public void printPhoneNumbers() {
		
		for(int i = 0; i < pnlist.size(); i++) {
			
			System.out.println((i + 1) + ". " + pnlist.get(i).toString());
			
		}
		
	}
	
}