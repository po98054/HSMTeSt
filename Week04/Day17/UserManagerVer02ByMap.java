package Day17;

import java.util.HashMap;

import java.util.Scanner;

public class UserManagerVer02ByMap {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		HashMap<String, MemberVer02ByMap> map = new HashMap<String, MemberVer02ByMap>();
		
		int menu = -1;
		
		do {
			
			System.out.println("--------메뉴-----------");
			
			System.out.println("1. 회원 추가");
			
			System.out.println("2. 회원 검색");
			
			System.out.println("3. 회원 정보 수정");
			
			System.out.println("4. 회원 삭제");
			
			System.out.println("5. 프로그램 종료");
			
			System.out.println("---------------------");
			
			System.out.print("메뉴 선택 : ");
			
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 :
				
				if(addMember(map)) {
					
					System.out.println("---------------------");
					
					System.out.println("회원 가입에 성공하였습니다.");
					
				} else {
					
					System.out.println("---------------------");
					
					System.out.println("입력한 아이디가 이미 존재합니다.");
					
				}
				
				break;
				
			case 2 :
				
				if(!searchMember(map)) {
					
					System.out.println("---------------------");
					
					System.out.println("아이디 또는 비밀번호가 일치하지 않습니다..");
					
				}
				
				break;
				
			case 3 :
				
				if(updateMember(map)) {
					
					System.out.println("---------------------");
					
					System.out.println("회원 정보를 수정했습니다.");
					
				} else {
					
					System.out.println("---------------------");
					
					System.out.println("아이디 또는 비밀번호가 일치하지 않습니다..");
					
				}
				
				break;
				
			case 4 :
				
				if(deleteMember(map)) {
					
					System.out.println("---------------------");
					
					System.out.println("회원 정보를 삭제했습니다.");
					
				} else {
					
					System.out.println("---------------------");
					
					System.out.println("아이디 또는 비밀번호가 일치하지 않습니다..");
					
				}
				
				break;
				
			case 5 :
				
				System.out.println("---------------------");
				
				System.out.println("시스템을 종료합니다.");
				
				break;
				
			default :
				
				System.out.println("---------------------");
				
				System.out.println("메뉴를 잘못 입력했습니다.");
				
				break;
			
			}
			
		} while (menu != 5);

	}
	
	public static boolean addMember(HashMap<String, MemberVer02ByMap> map) {
		
		if(map == null) {
			
			throw new RuntimeException("Map이 Null입니다.");
			
		}
		
		System.out.println("---------------------");
		
		System.out.println("회원 정보를 입력하세요");
		
		System.out.println("---------------------");
		
		System.out.print("아이디 입력 : ");
		
		String id = sc.next();
		
		System.out.print("비밀 번호 입력 : ");
		
		String pw = sc.next();
		
		System.out.print("이름 입력 : ");
		
		String name = sc.next();
		
		System.out.print("나이 입력 : ");
		
		int age = sc.nextInt();
		
		System.out.print("주민 등록 번호 입력 : ");
		
		String residentNumber = sc.next();
		
		// map에 있는지 확인 => 있으면 건너뛰고 없으면 추가
		
		if(map.get(id) != null) {
			
		    return false;
		}
		
		map.put(id, new MemberVer02ByMap(pw, name, residentNumber, age));
		
		return true;
		
	}
	
	public static boolean searchMember(HashMap<String, MemberVer02ByMap> map) {
		
		System.out.println("---------------------");
		
		System.out.println("회원 정보를 입력하세요");
		
		System.out.println("---------------------");
		
		System.out.print("아이디 입력 : ");
		
		String id = sc.next();
		
		System.out.print("비밀 번호 입력 : ");
		
		String pw = sc.next();
		
		// 아이디를 이용하여 회원 정보를 가져옴 -> 일치하는 회원 정보가 없으면 건너뜀 ->>
		// 가져온 회원 정보에서 비밀번호가 같은지를 확인하여 같으면 회원 정보 출력 다르면 종료
		
		MemberVer02ByMap searchTemp = map.get(id);
		
		if(searchTemp == null) {
			
			return false;
			
		}
		
		if(!searchTemp.getPw().equals(pw)) {
			
			return false;
			
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("검색하고자 하는 아이디 : " + id + " " + id + "에 해당되는 회원 정보입니다. " + searchTemp);
		
		return true;
		
	}
	
	public static boolean updateMember(HashMap<String, MemberVer02ByMap> map) {
		
		System.out.println("---------------------");
		
		System.out.println("검색할 회원 정보를 입력하세요");
		
		System.out.println("---------------------");
		
		System.out.print("아이디 입력 : ");
		
		String id = sc.next();
		
		System.out.print("비밀 번호 입력 : ");
		
		String pw = sc.next();
		
		MemberVer02ByMap updateTemp = map.get(id);
		
		if(updateTemp == null || !updateTemp.getPw().equals(pw)) {
			
			return false;
			
		}
		
		System.out.println("---------------------");
		
		System.out.println("수정할 회원 정보를 입력하세요.");
		
		System.out.println("---------------------");
		
		System.out.print("변경할 비밀 번호 입력 : ");
		
		String newPw = sc.next();
		
		System.out.print("이름 입력 : ");
		
		String name = sc.next();
		
		System.out.print("나이 입력 : ");
		
		int age = sc.nextInt();
		
		System.out.print("주민 등록 번호 입력 : ");
		
		String residentNumber = sc.next();
		
		System.out.println("---------------------");
		
		updateTemp.update(newPw, name, residentNumber, age);
		
		return true;
		
	}
	
	public static boolean deleteMember(HashMap<String, MemberVer02ByMap> map) {
		
		System.out.println("---------------------");
		
		System.out.println("삭제할 회원 정보를 입력하세요");
		
		System.out.println("---------------------");
		
		System.out.print("아이디 입력 : ");
		
		String id = sc.next();
		
		System.out.print("비밀 번호 입력 : ");
		
		String pw = sc.next();
		
		MemberVer02ByMap deleteTemp = map.get(id);
		
		if(deleteTemp == null || !deleteTemp.getPw().equals(pw)) {
			
			return false;
			
		}
		
		map.remove(id);
		
		return true;
		
	}
	
}