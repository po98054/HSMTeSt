package Day16;

import lombok.Data;

@Data
public class MemberVer01byArrayList {
	
	// 회원 정보는 아이디 비밀번호 이름 나이 주민등록번호로 구성되어있음
	
	private String id;
	
	private String pw;
	
	private int age;
	
	private String name;
	
	private String residentNumber;
	
	// 회원 검색은 ID를 통해서 검색을 한다.

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		MemberVer01byArrayList other = (MemberVer01byArrayList) obj;
		
		if (id == null) {
			
			if (other.id != null)
				
				return false;
			
		} else if (!id.equals(other.id))
			
			return false;
		
		return true;
		
	}

	public MemberVer01byArrayList(String id, String pw, int age, String name, String residentNumber) {
		
		this.id = id;
		
		this.pw = pw;
		
		this.age = age;
		
		this.name = name;
		
		this.residentNumber = residentNumber;
		
	}

	public MemberVer01byArrayList(String id, String pw) {
		
		this.id = id;
		
		this.pw = pw;
		
	}

	public void update(String pw, String name, String residentNumber, int age) {
		
		this.pw = pw;
		
		this.age = age;
		
		this.name = name;
		
		this.residentNumber = residentNumber;
		
	}
	
}