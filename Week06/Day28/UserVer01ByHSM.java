package Day28;

import lombok.Data;

@Data
public class UserVer01ByHSM {
	
	private String id;
	
	private String pw;

	public UserVer01ByHSM(String id, String pw) {
		
		this.id = id;
		
		this.pw = pw;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		UserVer01ByHSM other = (UserVer01ByHSM) obj;
		
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
	public String toString() {
		
		return "ID : " + id + " PW : " + pw;
		
	}
	
}