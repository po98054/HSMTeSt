package Day18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.Scanner;

public class AccountServiceImpVer02 implements AccountServiceVer02{
	
	@Override
	public ItemVer02 inputItem(Scanner sc) throws ParseException {
		
		System.out.println("-------------------------");
		
		// 내역 정보를 입력 (구분, 목적, 내용, 금액, 일시)
		
		System.out.print("구분(수입/지출) : ");
		
		String type = sc.next();
		
		System.out.print("분류(식비/교통비 등) : ");
		
		String purpose = sc.next();
		
		sc.nextLine();
		
		System.out.print("내용 : ");
		
		String content = sc.nextLine();
		
		System.out.print("금액(정수) : ");
		
		int money = sc.nextInt();
		
		System.out.print("일시(2022-11-16) : ");
		
		String date = sc.next();
		
		System.out.println("-------------------------");
		
		return new ItemVer02(type, purpose, content, money, date);
		
	}

	@Override
	public void insertItem(ArrayList<ItemVer02> list, ItemVer02 item) {
		
		// 리스트에 내역 추가 => 추가한 내역들을 날짜를 기준으로 정렬
		
		list.add(item);
		
		Collections.sort(list, new Comparator<ItemVer02>() {

			@Override
			public int compare(ItemVer02 o1, ItemVer02 o2) {
				
				if(o1 == null) {
					
					return 1;
					
				}
				
				if(o2 == null) {
					
					return -1;
					
				}
				
				return o1.getDate().compareTo(o2.getDate());
				
			}
			
		});
		
	}

	@Override
	public void printItem(ArrayList<ItemVer02> list) {
		
		
		
	}

	@Override
	public boolean updateItem(ArrayList<ItemVer02> list, int index, ItemVer02 item) {
		
		if(index < 0 || index >= list.size()) {
			
			return false;
			
		}
		
		list.set(index, item);
		
		return true;
		
	}

	@Override
	public boolean deleteItem(ArrayList<ItemVer02> list, int index) {
		
		if(index < 0 || index >= list.size()) {
			
			throw new RuntimeException("예외 발생 : 내역을 잘못 선택했습니다.");
			
		}
		
		list.remove(index);
		
		return true;
		
	}

	@Override
	public void printMenu() {
		
		System.out.println("---------메뉴--------------");
		
		System.out.println("1. 내역 추가");
		
		System.out.println("2. 내역 확인");
		
		System.out.println("3. 내역 수정");
		
		System.out.println("4. 내역 삭제");
		
		System.out.println("5. 종료");
		
		System.out.println("-------------------------");
		
		System.out.print("메뉴 선택 : ");
		
	}

	@Override
	public void runMenu(ArrayList<ItemVer02> list, int menu, Scanner sc) throws ParseException {
		
		switch(menu) {
		
		case 1 :
		
			// 가계부에 내역 추가 => 입력 받은 정보를 이용하여 내역 객체 생성 => 내역 리스트에 내역을 추가
			
			insertItem(list, inputItem(sc));
			
			break;
			
		case 2 :
			
			System.out.println("-------------------------");
			
			for(ItemVer02 temp : list) {
				
				temp.print();
				
			}
			
			break;
			
		case 3 :
			
			int index = selectItem(list, sc, inputDate(sc));
			
			// 수정할 내역 전체를 입력 => 입력된 내용으로 수정
			
			ItemVer02 item = inputItem(sc);
			
			updateItem(list, index, item);
			
			break;
			
		case 4 : 
			
			// 해당 일자에 기록된 내역들을 출력 => 삭제할 내역을 선택
			
			int index2 = selectItem(list, sc, inputDate(sc));
						
			// 선택된 내역을 삭제
			
			deleteItem(list, index2);
			
			System.out.println("-------------------------");
			
			System.out.println("성공적으로 삭제가 완료되었습니다.");
			
			System.out.println("-------------------------");
			
			break;
			
		case 5 :
			
			break;
			
		default :
			
			System.out.println("-------------------------");
			
			System.out.println("메뉴를 잘 못 입력했습니다.");
			
			break;
		
		}
		
	}

	@Override
	public int selectItem(ArrayList<ItemVer02> list, Scanner sc, String date) {
		
		// 해당 일자에 기록된 내역들을 출력
		
	   // 날짜가 같은 내역들의 번지를 정수형 리스트에 저장
					
	   ArrayList<Integer> indexList = new ArrayList<Integer>();
					
	  // 날짜가 같은 내역들을 모음
					
     for(int i = 0; i < list.size(); i++) {
						
		if(list.get(i).getDateStr().equals(date)) {
							
			indexList.add(i);
							
		}
		
	if(indexList.size() == 0) {
		
		throw new RuntimeException("예외 발생 : 해당 일시에는 내역이 없습니다.");
		
	}
						
	}
					
	// 날짜가 같은 내역들을 출력
					
	for(int i = 0; i < indexList.size(); i++) {
						
		System.out.println((i + 1) + "번 내역");
						
		list.get(indexList.get(i)).print();
						
	}
					
	System.out.print("수정/삭제할 내역 선택 : ");
					
	// 수정할 내역을 선택
					
	int index = sc.nextInt() - 1;
	
	if(index < 0 || index >= indexList.size()) {
	
		throw new RuntimeException("예외 발생 : 내역을 잘 못 선택했습니다.");
		
	}
		
	return indexList.get(index);
		
	}

	@Override
	public String inputDate(Scanner sc) throws ParseException {
		
		System.out.println("-------------------------");
		
		// 년, 월, 일을 입력 (2022-11-16)
		
		System.out.print("검색할 일시를 입력하세요 : ");
		
		String date = sc.next();
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		
		f.parse(date);
		
		System.out.println("-------------------------");
		
		return date;
		
	}
	
}