package Day16;

import java.util.ArrayList;

import java.util.Scanner;

public class UserManagerVer01byArrayList {
	
	public static void main(String [] args) {
		
		// 회원 정보를 관리하는 프로그램을 작성하세요.
		
		// 회원 정보는 아이디 비밀번호 이름 나이 주민등록번호로 구성되어있음
		
		// 기능 1은 회원 추가 기능 2는 회원 검색 기능 3은 회원 정보 수정 기능 4는 회원 삭제 기능 5는 시스템 종료
		
		Scanner sc = new Scanner(System.in);
		
		int menu = -1;
		
		ArrayList<MemberVer01byArrayList> list = new ArrayList<MemberVer01byArrayList>(); // 회원 리스트
		
		// 반복
		
		do {
			
		// 메뉴 출력
			
			printMenu();
		
		// 메뉴 선택
			
			menu = sc.nextInt();
		
		// 선택된 메뉴에 따른 기능 실행
			
			System.out.println("---------------------");
			
			switch(menu) {
			
			case 1 :
				
				addMember(list);
				
				break;
				
			case 2 :
				
				MemberVer01byArrayList searchtemp = searchMember(list);
				
				if(searchtemp == null) {
					
					System.out.println("---------------------");
					
					System.out.println("아이디 또는 비밀번호가 잘못됬습니다.");
					
					System.out.println("---------------------");
					
				} else {
					
					System.out.println("---------------------");
					
					System.out.println("검색한 회원 정보는 : " + searchtemp);
					
					System.out.println("---------------------");
					
				}
				
				break;
				
			case 3 :
				
				// 수정할 회원 아이디와 비밀 번호를 입력하여 일치하는 회원 정보를 가져옴
				
				MemberVer01byArrayList updateTemp = searchMember(list);
				
				if(!updateMember(list, updateTemp)) {
					
					System.out.println("---------------------");
					
					System.out.println("아이디 또는 비밀번호가 잘못 됬습니다.");
					
					System.out.println("---------------------");
					
				} else {
					
					System.out.println("---------------------");
					
					System.out.println("회원 정보 수정이 완료됬습니다.");
					
					System.out.println("---------------------");
					
				}
			
				break;
				
			case 4 :
				
				MemberVer01byArrayList deleteTemp = searchMember(list);
				
				if(list.remove(deleteTemp)) {
					
					System.out.println("---------------------");
					
					System.out.println("삭제가 성공하였습니다.");
					
					System.out.println("---------------------");
					
				} else {
					
					System.out.println("---------------------");
					
					System.out.println("아이디 또는 비밀번호가 잘못 됬습니다.");
					
					System.out.println("---------------------");
					
				}
				
				break;
				
			case 5 :
				
				System.out.println("프로그램 종료하겠습니다.");
				
				break;
				
			default :
				
				System.out.println("잘못된 메뉴를 입력했습니다.");
					
			}
			
		} while (menu != 5);
		
		// 
		
	}
	
	// 메뉴 출력
	
	public static void printMenu() {
		
		System.out.println("--------메뉴-----------");
		
		System.out.println("1. 회원 추가");
		
		System.out.println("2. 회원 검색");
		
		System.out.println("3. 회원 정보 수정");
		
		System.out.println("4. 회원 삭제");
		
		System.out.println("5. 프로그램 종료");
		
		System.out.println("---------------------");
		
		System.out.print("메뉴 선택 : ");
		
	}
	
	public static boolean addMember(ArrayList<MemberVer01byArrayList> list) {
		
		Scanner sc = new Scanner(System.in);
		
		// 회원 정보 입력 => 아이디, 비밀번호, 이름, 나이, 주민등록번호 순으로 입력 받는다.
		
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
		
		// 입력한 정보를 이용한 겍체를 생성(회원 리스트에 비교 및 추가)
		
		MemberVer01byArrayList member = new MemberVer01byArrayList(id, pw, age, name, residentNumber);
		
		// 회원 리스트에 이미 가입된 아이디이면 안내문구 출력 후 종료, 아니면 회원 리스트에 추가
		
		// 회원 아이디가 같은 회원이 있으면
		
		if(list.contains(member)) {
			
			System.out.println("---------------------");
			
			System.out.println("입력한 아이디가 이미 존재합니다.");
			
			System.out.println("---------------------");
			
			return false;
			
		} 
		
		list.add(member);
		
		System.out.println("---------------------");
		
		System.out.println("회원 정보를 추가했습니다.");
		
		System.out.println("---------------------");
		
		return true;
		
	}
	
	public static MemberVer01byArrayList searchMember(ArrayList<MemberVer01byArrayList> list) {
		
		Scanner sc = new Scanner(System.in);
		
		// 아이디 와 비밀번호 입력 => 아이디와 비밀번호를 이용하여 객체를 만듬.
		
		System.out.println("---------------------");
		
		System.out.println("검색할 회원 정보를 입력하세요.");
		
		System.out.println("---------------------");
		
		System.out.print("아이디 : ");
		
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		
		String pw = sc.next();
		
		MemberVer01byArrayList member = new MemberVer01byArrayList(id, pw);
		
		// 회원 리스트에서 아이디가 같은 회원 정보를 가져옴 => 가져온 회원 정보의 비밀번호와 입력한 비밀번호를 비교하여 일치하면 회원 정보를 보여주지만 다르면 종료한다.
		
		int index = list.indexOf(member);
		
		if(index == -1) {
			
			return null;
			
		} 
		
		MemberVer01byArrayList temp = list.get(index);
		
		if(!temp.getPw().equals(member.getPw())) {
			
			return null;
			
		} 
		
		return temp;
		
	}
	
	public static boolean updateMember(ArrayList<MemberVer01byArrayList> list, MemberVer01byArrayList updateTemp) {
		
		Scanner sc = new Scanner(System.in);
		
		if (updateTemp == null) {
			
			return false;
			
		}
		
		// 일치하는 회원 정보가 있으면 비밀번호, 이름, 주민번호, 나이를 입력 받음.
		
		System.out.println("---------------------");
		
		System.out.println("수정할 회원 정보를 입력하세요.");
		
		System.out.print("비밀 번호 입력 : ");
		
		String pw = sc.next();
		
		System.out.print("이름 입력 : ");
		
		String name = sc.next();
		
		System.out.print("나이 입력 : ");
		
		int age = sc.nextInt();
		
		System.out.print("주민 등록 번호 입력 : ");
		
		String residentNumber = sc.next();
		
		System.out.println("---------------------");
		
		// 입력받은 회원 정보를 이용하여 updateTemp를 수정
		
		updateTemp.update(pw, name, residentNumber, age);
		
		return true;
		
	}
	
}