package Day07;

public class Class01 {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setAddress("인천 연수구 송도동");
		person.setAge(33);
		person.setGender('M');
		person.setName("하성민");
		person.setPhone("010-8628-8654");
		person.setpNo("911108-1754612");
		
		System.out.println("이름 = " + person.getName());
		System.out.println("나이 = " + person.getAge());
		System.out.println("주소 = " + person.getAddress());
		System.out.println("전화 번호 = " + person.getPhone());
		System.out.println("주민 번호 = " + person.getpNo());
	

}
	
}

class Person {
	
	private String pNo;
	private String name;
	private char gender;
	private String address;
	private String phone;
	private int age;
	
	public String getpNo() {
		return pNo;
	}
	
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}