package Day31;

import java.text.ParseException;

import java.util.ArrayList;

import java.util.Scanner;

public class KioskMainVer02 {
	
	// 제품을 관리하는 프로그램을 작성하세요.
	
	// 구매가격 판매가격 (변동사항 없음 -> 상수 (Final)
	
	// 제품 등록(분류, 제품명, 수량, 구매가격, 판매가격)
	
	   // 
	
	// 제품 수정
	
	// 제품 삭제
	
	// 제품 구매
	
	// 제품 판매
	
	// 매출액 확인
	
	  // 년별
	
	    // 제품별
	
	    // 전체
	
	  // 월별

		// 제품별
	
		// 전체
	
	  // 일별
	
		// 제품별
	
		// 전체
	
	static Scanner sc = new Scanner(System.in);
	
	private static ArrayList<KioskVer02> kioskList = new ArrayList<KioskVer02>();
	
	private static KioskVer02 kiosk;

	public static void main(String[] args) throws ParseException {
		
		int menu = -1;
		
		do {
			
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
			
		} while(menu != 7);
		
	}
	
	public static void printMenu() {
		
		System.out.println("---------------메인 메뉴------------------------");
		
		System.out.println("1. 제품 등록");
		
		System.out.println("2. 제품 수정");
		
		System.out.println("3. 제품 삭제");
		
		System.out.println("4. 제품 구매");
		
		System.out.println("5. 제품 판매");
		
		System.out.println("6. 매출액 확인");
		
		System.out.println("7. 프로그램 종료");
		
		System.out.println("---------------------------------------------");
		
		System.out.print("메인 메뉴를 입력하세요 : ");
		
	}
	
	public static void runMenu(int menu) throws ParseException {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("---------------------------------------------");
			
			insertProduct();
			
			System.out.println("---------------------------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("---------------------------------------------");
			
			updateProduct();
			
			System.out.println("---------------------------------------------");
			
			break;
			
		case 3 :
			
			System.out.println("---------------------------------------------");
			
			deleteProduct();
			
			System.out.println("---------------------------------------------");
			
			break;
			
		case 4 :
			
			System.out.println("---------------------------------------------");
			
			purchaseProduct();
			
			System.out.println("---------------------------------------------");
			
			break;
			
		case 5 :
			
			System.out.println("---------------------------------------------");
			
			saleProduct();
			
			System.out.println("---------------------------------------------");
			
			break;
			
		case 6 :
			
			System.out.println("---------------------------------------------");
			
			System.out.println("매출액을 확인하는 기능");
			
			System.out.println("---------------------------------------------");
			
			break;
			
		case 7 :
			
			System.out.println("---------------------------------------------");
			
			System.out.println("프로그램을 종료합니다.");
			
			System.out.println("---------------------------------------------");
			
			break;
			
		default :
			
			System.out.println("---------------------------------------------");
			
			System.out.println("메인 메뉴를 잘못 입력했습니다.");
			
			System.out.println("---------------------------------------------");
			
			break;
		
		}
		
	}
	
	public static void insertProduct() throws ParseException {
		
		System.out.println("---------------------------------------------");
		
		System.out.print("제품의 분류를 입력하세요 : ");
		
		String classification = sc.next();
		
		System.out.print("제품명을 입력하세요 : ");
		
		String productName = sc.next();
		
		System.out.print("수량을 입력하세요 : ");
		
		int Quantity = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("날짜를 입력하세요 : ");
		
		String saleDate = sc.nextLine();
		
		System.out.println("---------------------------------------------");
		
		KioskVer02 kiosk = new KioskVer02(classification, productName, Quantity, saleDate);
		
		kioskList.add(kiosk);
		
		System.out.println("---------------------------------------------");
		
		System.out.println("성공적으로 제품이 등록되었습니다.");
		
		System.out.println("---------------------------------------------");
		
		System.out.println(kiosk);
		
		System.out.println(kioskList);
		
	}
	
	public static void updateProduct() {
		
		System.out.println("---------------------------------------------");
		
		System.out.print("제품의 분류를 입력하세요 : ");
		
		String classification = sc.next();
		
		System.out.print("제품명을 입력하세요 : ");
		
		String productName = sc.next();
		
		System.out.println("---------------------------------------------");
		
		int index = kioskList.indexOf(new KioskVer02(classification, productName));
		
		if(index == -1) {
			
			System.out.println("---------------------------------------------");
			
			System.out.println("제품이 등록되어 있지 않습니다.");
			
			System.out.println("---------------------------------------------");
			
		}
		
		kiosk = kioskList.get(index);
		
		System.out.println("---------------------------------------------");
		
		System.out.print("제품의 분류를 입력하세요 : ");
		
		classification = sc.next();
		
		System.out.print("제품명을 입력하세요 : ");
		
		productName = sc.next();
		
		System.out.println("---------------------------------------------");
		
		kiosk.update(classification, productName);
		
		System.out.println("---------------------------------------------");
		
		System.out.println("성공적으로 제품이 수정되었습니다.");
		
		System.out.println("---------------------------------------------");
		
	}
	
	public static void deleteProduct() {
		
		System.out.println("---------------------------------------------");
		
		System.out.print("제품의 분류를 입력하세요 : ");
		
		String classification = sc.next();
		
		System.out.print("제품명을 입력하세요 : ");
		
		String productName = sc.next();
		
		System.out.println("---------------------------------------------");
		
		int index = kioskList.indexOf(new KioskVer02(classification, productName));
		
		if(index == -1) {
			
			System.out.println("---------------------------------------------");
			
			System.out.println("제품이 등록되어 있지 않습니다.");
			
			System.out.println("---------------------------------------------");
			
		}
		
		kioskList.remove(index);
		
		System.out.println("---------------------------------------------");
		
		System.out.println("성공적으로 제품이 삭제되었습니다.");
		
		System.out.println("---------------------------------------------");
		
	}
	
	public static void purchaseProduct() {
		
		System.out.println("---------------------------------------------");
		
		System.out.print("제품의 분류를 입력하세요 : ");
		
		String classification = sc.next();
		
		System.out.print("제품명을 입력하세요 : ");
		
		String productName = sc.next();
		
		System.out.println("---------------------------------------------");
		
		int index = kioskList.indexOf(new KioskVer02(classification, productName));
		
		if(index == -1) {
			
			System.out.println("---------------------------------------------");
			
			System.out.println("제품이 등록되어 있지 않습니다.");
			
			System.out.println("---------------------------------------------");
			
		}
		
		kiosk = kioskList.get(index);
		
		System.out.println("---------------------------------------------");
		
		System.out.print("구매 수량을 입력하세요 : ");
		
		int Quantity = sc.nextInt();
		
		System.out.println("---------------------------------------------");
		
		kiosk.purchaseUpdate(classification, productName, Quantity);
		
		System.out.println("---------------------------------------------");
		
		System.out.println("성공적으로 제품이 구매되었습니다.");
		
		System.out.println("---------------------------------------------");
		
		System.out.println(kioskList.get(index));
		
	}
	
	public static void saleProduct() throws ParseException {
		
		System.out.println("---------------------------------------------");
		
		System.out.print("제품의 분류를 입력하세요 : ");
		
		String classification = sc.next();
		
		System.out.print("제품명을 입력하세요 : ");
		
		String productName = sc.next();
		
		System.out.println("---------------------------------------------");
		
		int index = kioskList.indexOf(new KioskVer02(classification, productName));
		
		if(index == -1) {
			
			System.out.println("---------------------------------------------");
			
			System.out.println("제품이 등록되어 있지 않습니다.");
			
			System.out.println("---------------------------------------------");
			
		}
		
		kiosk = kioskList.get(index);
		
		System.out.println("---------------------------------------------");
		
		System.out.print("판매 수량을 입력하세요 : ");
		
		int Quantity = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("판매 날짜를 입력하세요 : ");
		
		String saleDate = sc.nextLine();
		
		System.out.println("---------------------------------------------");
		
		kiosk.update(Quantity, saleDate);
		
		System.out.println("---------------------------------------------");
		
		System.out.println("제품이 판매가 되었습니다.");
		
		System.out.println("---------------------------------------------");
		
	}

}