package Day16;

import java.util.ArrayList;

import java.util.Scanner;

public class UserManagerVer01 {
	
	public static void main(String [] args) throws Exception {
		
		// 회원 정보를 관리하는 프로그램을 작성하세요.
		// 회원 정보는 아이디 비밀번호 이름 나이 주민등록번호로 구성되어있음
		// 기능 1은 회원 추가 기능 2는 회원 검색 기능 3은 회원 정보 수정 기능 4는 회원 삭제 
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		// 회원 추가
		
		AddUser(list);
		
		SearchPerson(list);
		
		
	}
	
    private static void AddUser(ArrayList<Person> list) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("회원 정보 추가");
		
		System.out.println("--------------");
		
		System.out.print("아이디를 입력하세요 : ");
		
		String id = scan.next();
		
		scan.nextLine();
		
		System.out.print("비밀번호를 입력하세요 : ");
		
		String pw = scan.next();
		
		scan.nextLine();
		
		System.out.print("이름을 입력하세요 : ");
		
		String name = scan.next();
		
		scan.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		
		int age = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("주민번호를 입력하세요 : ");
		
		String jumin = scan.next();
		
		list.add(new Person(id, pw, name, age, jumin));
		
		System.out.println("--------------");
		
		System.out.println(list.toString());
    	
    }
    
    private static void SearchPerson(ArrayList<Person> list) throws Exception {
    	
    	System.out.println("--------------");
    	
    	Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		
		String id = scan.next();
		
		System.out.println("--------------");
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).equals(id)) {
				
				System.out.println(list.toString());
				
			}
			
		}
		
		/*if(list.equals(Person)) {
			
			System.out.println("검색된 아이디가 없습니다.");
			
		} else {
			
			System.out.println(list.toString());
			
		}*/
		
		/*ArrayList<Integer> indexList = findPersonList(list, id);
		
		if(indexList == null || indexList.size() == 0) {
			
			throw new Exception("예외 발생 : 검색하고자 하는 아이디가 회원목록에 없습니다.");
			
		}
		
		for(int i = 0; i < indexList.size(); i++) {
			
			System.out.println((i + 1) + ". " + list.get(indexList.get(i)));
			
		}*/
		
		System.out.println("--------------");
    	
    }
    
   /* private static ArrayList<Integer> findPersonList(ArrayList<Person> list, String id) {
		
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).equals(id)) {
				
				list.get(i)
				
			}
			
		}
		
		return list;
		
	}*/
	
}

class Person {
	
	private String id;
	
	private String pw;
	
	private String name;
	
	private int age;
	
	private String jumin;
	
	public Person(String id, String pw, String name, int age, String jumin) {
		
		this.id = id;
		
		this.pw = pw;
		
		this.name = name;
		
		this.age = age;
		
		this.jumin = jumin;
		
	}
	
	public String toString() {
		
		return "아이디 : " + id + " " + "비밀번호 : " + pw + " " + "이름 : " + name + " " + "나이 : " + age + " " + "주민등록번호 : " + jumin;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		Person other = (Person) obj;
		
		if (id == null) {
			
			if (other.id != null)
				
				return false;
			
		} else if (!id.equals(other.id))
			
			return false;
		
		return true;
		
	}
	
}