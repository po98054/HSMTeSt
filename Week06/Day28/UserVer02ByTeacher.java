package Day28;

import java.io.*;

import java.util.*;

import lombok.Data;

@Data
public class UserVer02ByTeacher implements Serializable{
	
	private static final long serialVersionUID = -5588397836781462118L;

	private String id;
	
	private String pw;
	
	private Date joinDate;
	
	private Authority authority;

	public UserVer02ByTeacher(String id, String pw) {
		
		this(id, pw, Authority.MEMBER);
		
	}
	
	public UserVer02ByTeacher(String id, String pw, Authority authority) {
		
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
		
		UserVer02ByTeacher other = (UserVer02ByTeacher) obj;
		
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
	
}

enum Authority {
	
	ADMIN, MEMBER;
	
}