package Day16;

import java.util.HashMap;

import lombok.Data;

public class Map03 {
	
	public static void main(String [] args) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("User", new User("abc", "def"));
		
		map.put("age", 22);
		
		map.put("address" , "서울시");
		
		System.out.println("map에서 User에 해당 되는 값 : " + map.get("User"));
		
		System.out.println("map에서 age에 해당 되는 값 : " + map.get("age"));
		
		System.out.println("map에서 address에 해당 되는 값 : " + map.get("address"));
		
		System.out.println("map에서 123에 해당 되는 값 : " + map.get("123"));
		
	}
	
}

@Data
class User {
	
	private String id;
	
	private String pw;
	
	public User(String id, String pw) {
		
		this.id = id;
		
		this.pw = pw;
		
	}
	
}