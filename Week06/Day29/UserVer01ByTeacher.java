package Day29;

import java.io.*;

import java.util.*;

import lombok.Data;

@Data
public class UserVer01ByTeacher implements Serializable{
	
	private static final long serialVersionUID = -5588397836781462118L;

	private String id;
	
	private String pw;
	
	private Date joinDate;
	
	private Authority authority;

	public UserVer01ByTeacher(String id, String pw) {
		
		this(id, pw, Authority.MEMBER);
		
	}
	
	public UserVer01ByTeacher(String id, String pw, Authority authority) {
		
		this.id = id;
		
		this.pw = pw;
		
		this.authority = authority;
		
		joinDate = new Date();
		
	}
	
	@Override
	public String toString() {
		
		return "아이디 : " + id + " 비밀번호 : " + pw + " 회원 가입 일자 : " + joinDate;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		UserVer01ByTeacher other = (UserVer01ByTeacher) obj;
		
		if (id == null) {
			
			if (other.id != null)
				
				return false;
			
		} else if (!id.equals(other.id))
			
			return false;
		
		if (pw == null) {
			
			if (other.pw != null)
				
				return false;
			
		} else if (!pw.equals(other.pw))
			
			return false;
		
		return true;
		
	}

	@Override
	
	public int hashCode() {
		
		final int prime = 31;
		
		int result = 1;
		
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		
		return result;
	}

}

enum Authority {
	
	ADMIN, MEMBER;
	
}