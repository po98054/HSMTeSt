package Day16;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;


public class Map02 {
	
	public static void main(String [] args) {
		
		HashMap<String, String> userList = new HashMap<String, String>();
		
		userList.put("id1", "pw");
		
		userList.put("id2", "pw2");
		
		userList.put("id3", "pw2");
		
		userList.put("id1", "pw2");
		
		System.out.println("UserList에 있는 값 : " + userList);
		
		System.out.println("UserList 중에 id2가 있는 값 : " + userList.get("id2"));
		
		// 방법1. keySet를 이용
		
		Set<String> keySet = userList.keySet();
		
		for(String temp : keySet) {
			
			System.out.println("키 값 : " + temp + " : 값 : " + userList.get(temp));
			
		}
		
		System.out.println();
		
		// 방법2. EntrySet를 이용
		
		Set<Entry<String, String>> entrySet = userList.entrySet();
		
		for(Entry<String, String> temp : entrySet) {
			
			System.out.println("키 값 : " + temp.getKey() + " : 값 : " + temp.getValue());
			
		}
		
	}

}