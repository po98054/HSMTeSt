package Day16;

import java.util.HashMap;

public class Map01 {
	
	public static void main(String[] args) {
		
		HashMap<String, String> userList = new HashMap<String, String>();
		
		userList.put("id1", "pw");
		
		userList.put("id2", "pw2");
		
		userList.put("id3", "pw2");
		
		userList.put("id1", "pw2");
		
		System.out.println("UserList에 있는 값 : " + userList);
		
	}

}