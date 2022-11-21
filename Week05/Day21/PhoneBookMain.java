package Day21;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.function.Predicate;

public class PhoneBookMain {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<PhoneBook> list = new ArrayList<PhoneBook>();
		
		int menu = -1;
		
		do {
			
			printmenu();
			
			menu = sc.nextInt();
			
			runMenu(menu, list);
			
		} while(menu != 5);
		
	}
	
	private static void printmenu() {
		
		System.out.println("--------메뉴---------");
		
		System.out.println("1. 전화번호 추가");
		
		System.out.println("2. 전화번호 수정");
		
		System.out.println("3. 전화번호 삭제");
		
		System.out.println("4. 전화번호 조회");
		
		System.out.println("5. 프로그램 종료");
		
		System.out.println("-------------------");
		
		System.out.print("메뉴 선택 : ");
		
	}

	private static void runMenu(int menu, ArrayList<PhoneBook> list) {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("-------------------");
			
			if(insertPhoneBook(list)) {
				
				System.out.println("-------------------");
				
				System.out.println("전화번호를 추가했습니다.");
				
				System.out.println("-------------------");
				
			} else {
				
				System.out.println("-------------------");
				
				System.out.println("전화번호를 추가하지 못했습니다.");
				
				System.out.println("-------------------");
				
			}
			
			break;
			
		case 2 :
			
			System.out.println("-------------------");
			
		/*	if(updatePhoneBook()) {
				
				System.out.println("-------------------");
				
				System.out.println("전화번호를 수정했습니다. ");
				
				System.out.println("-------------------");
				
			} else {
				
				System.out.println("-------------------");
				
				System.out.println("전화번호를 수정하지 못했습니다.");
				
				System.out.println("-------------------");
				
			}*/
			
			break;
			
		case 3 :
			
			System.out.println("-------------------");
			
			if(deletePhone(list)) {
				
				System.out.println("-------------------");
				
				System.out.println("전화번호를 삭제했습니다. ");
				
				System.out.println("-------------------");
				
			} else {
				
				System.out.println("-------------------");
				
				System.out.println("전화번호를 삭제하지 못했습니다.");
				
				System.out.println("-------------------");
				
			}
			
			break;
			
		case 4 :
			
			System.out.println("-------------------");
			
			System.out.println("조회하는 기능");
			
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
		
	}
	
	private static boolean insertPhoneBook(ArrayList<PhoneBook> list) {
		
		sc.nextLine();
		
		System.out.print("성명 : ");
		
		String name = sc.nextLine();
		
		System.out.print("직장명 : ");
		
		String company = sc.nextLine();
		
		ArrayList<PhoneNumber> pnlist;
		
		try {
			
			pnlist = inputPhoneNumbers();
			
		} catch (RuntimeException e) {
			
			return false;
			
		}
		
		// 입력받은 성명, 직장명, 전화번호들(PhoneNumber 리스트)를 이용하여 PhoneBook 객체를 생성
		
		PhoneBook pb = new PhoneBook(name, company, pnlist);
		
		// list에 PhoneBook 객체를 추가
		
		list.add(pb);
		
		return true;
		
	}
	
	private static PhoneNumber inputPhoneNumber() {
		
		System.out.print("이름 (집, 직장 등) : ");
		
		String pName = sc.nextLine();
		
		System.out.print("번호 (예:010-1234-4567) : ");
		
		String number = sc.nextLine();
		
		return new PhoneNumber(pName, number);
		
	}
	
	private static ArrayList<PhoneNumber> inputPhoneNumbers() {
		
		ArrayList<PhoneNumber> pnlist = new ArrayList<PhoneNumber>();
		
		do {
			
			// 입력받은 이름, 번호를 이용하여 PhoneNumber 객체를 만들고
			
			PhoneNumber pn = inputPhoneNumber();
			
			// 만들어진 PhoneNumber 객체를 PhoneNumber 리스트에 추가
			
			pnlist.add(pn);
			
			System.out.println("-------------------");
			
			System.out.print("더 입력하겠습니까? (y/n) : ");
			
		} while(sc.nextLine().charAt(0) != 'n');
		
		return pnlist;
		
	}
	
	private static boolean deletePhone(ArrayList<PhoneBook> list) {
		
		sc.nextLine();
		
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		ArrayList<Integer> indexs = searchPhoneBook(list, (p) -> p.getName().contains(name));
		
		System.out.println("-------------------");
		
		if(indexs == null || indexs.size() == 0) {
			
			return false;
			
		}
		
		for(int i = 0; i < indexs.size(); i++) {
			
			int index = indexs.get(i);
			
			System.out.println((i + 1) + ". " + list.get(index));
			
		}
		
		System.out.println("-------------------");
		
		System.out.print("삭제할 번호를 입력하세요 : ");
		
		int selectIndex = sc.nextInt() - 1;
		
		if(selectIndex < 0 || selectIndex > indexs.size()) {
			
			return false;
			
		}
		
		int deleteIndex = indexs.get(selectIndex);
		
		return list.remove(deleteIndex) != null;
		
	}

	private static ArrayList<Integer> searchPhoneBook(ArrayList<PhoneBook> list, Predicate<PhoneBook> p) {
		
		ArrayList<Integer> indexs = new ArrayList<Integer>();
		
		for(int i = 0; i < list.size(); i++) {
			
			if(p.test(list.get(i))) {
				
				indexs.add(i);
				
			}
			
		}
		
		return indexs;
		
	}

}