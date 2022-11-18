package Day20;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Scanner;

public class PhoneListMain {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 전화번호를 관리하는 프로그램을 작성하세요.
		
		// 메뉴
		
		// 1. 전화번호 추가 (성, 이름, 직장, 전화번호들 (이름 : 번호))
		
		// 2. 전화번호 수정
		
		// 2-1 이름으로 검색(성 + 이름)
		
		// 2-2 검색된 사람들 중에서 선택
		
		// 2-3 성, 이름을 수정할 건지 OR 기존 등록된 전화번호를 수정할 건지 OR 새 전화번호를 등록할건지를 선택하여 동작
		
		// 3. 전화번호 삭제
		
		// 3-1 이름으로 검색(성 + 이름)
		
		// 3-2 검색된 사람들 중에서 선택
		
		// 3-3 선택된 사람의 연락처를 삭제
		
		// 4. 전화번호 조회
		
		// 4-1 이름으로 검색
		
		// 4-2 검색된 사람들 중에서 선택
		
		// 4-3 선택된 사람의 연락처를 출력
		
		int menu = -1;
		
		ArrayList<Phone> list = new ArrayList<Phone>();
		
		do {
			
			System.out.println("------메뉴---------");
			
			System.out.println("1. 전화번호 추가");
			
			System.out.println("2. 전화번호 수정");
			
			System.out.println("3. 전화번호 삭제");
			
			System.out.println("4. 전화번호 조회");
			
			System.out.println("5. 종료");
			
			System.out.println("-------------------");
			
			System.out.print("메뉴 선택 : ");
			
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 :
				
				System.out.println("-------------------");
				
				System.out.println("전화번호를 추가하세요.");
				
				System.out.println("-------------------");
				
				System.out.print("성 : ");
				
				String lastName = sc.next();
				
				System.out.print("이름 : ");
				
				String firstName = sc.next();
				
				System.out.print("회사명 : ");
				
				String company = sc.next();
				
				System.out.println("-------------------");
				
			    System.out.print("집 전화번호 : ");
					
			    String homeNumber = sc.next();
					
			    System.out.print("핸드폰 전화번호 : ");
					
			    String phoneNumber = sc.next();
					
			    System.out.print("회사 전화번호 : ");
					
			    String companyNumber = sc.next();
			    
			    int index = list.size();
			    
			    boolean res = list[index].addScore(new Score(sub, dict, middle, fin, perfor));
				
				if (res) {
					
					System.out.println("성적을 등록했습니다.");
					
				} else {
					
					System.out.println("성적 등록에 실패했습니다.");
					
				}
				
				std[index].printScore();
					
			  
				
			case 2 :
				
				System.out.println("-------------------");
				
				System.out.println("수정하는 기능");
				
				break;
				
			case 3 :
				
				System.out.println("-------------------");
				
				System.out.println("삭제하는 기능");
				
				break;
				
			case 4 :
				
				System.out.println("-------------------");
				
				System.out.print("이름 : ");
				
				firstName = sc.next();
				
				break;
				
			case 5 :
				
				System.out.println("-------------------");
				
				System.out.println("프로그램을 종료합니다.");
				
				break;
				
			default :
				
				System.out.println("-------------------");
				
				System.out.println("메뉴를 잘못 입력했습니다.");
				
				break;
			
			}
			
		} while(menu != 5);
		
	}

}