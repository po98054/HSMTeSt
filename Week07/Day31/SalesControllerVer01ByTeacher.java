package Day31;

import java.util.*;

public class SalesControllerVer01ByTeacher {
	
	private List<SalesVer01ByTeacher> salesList;
	
	private List<ProductVer01ByTeacher> productList;
	
	private ProductServiceVer01ByTeacher productService;
	
	private SalesServiceVer01ByTeacher salesService;
	
	public SalesControllerVer01ByTeacher(List<SalesVer01ByTeacher> salesList, List<ProductVer01ByTeacher> productList) {
		
		this.salesList = salesList;
		
		this.productList = productList;
		
		productService = new ProductServiceImpVer01ByTeacher();
		
		salesService = new SalesServiceImpVer01ByTeacher();
		
	}
	
	public void sales(String type) {
		
		// 구매할 제품 정보 입력(타입, 제품명, 수량)
		
		SalesVer01ByTeacher sales = salesService.inputSales(type);
		
		// 입력한 제품의 정보를 가져옵니다. 
		
		ProductVer01ByTeacher product = productService.getProduct(productList, sales.getProduct());
		
		if(product == null) {
			
			System.out.println("-------------------------------------");
			
			System.out.println(" " + type + "의 정보를 잘못 입력했습니다. ");
			
			System.out.println("-------------------------------------");
			
			return;
			
		}
		
		sales.setProduct(new ProductVer01ByTeacher(product));
		
		int amount = sales.getAmount();
		
		amount = type.equals("구매") ? amount : -amount;
		
		// 판매시 판매 수량은 재고량보다 클 수 없다.
		
		if(amount < 0 && product.getAmount() < -amount) {
			
			System.out.println("--------------------------");
			
			System.out.println(" 재고량이 부족합니다. ");
			
			System.out.println("--------------------------");
			
			return;
			
		}
		
		product.addAmount(amount);
		
		// 매출 금액을 계산
		
		sales.calculate(type);
		
		// 전체 매출에 현재 매출 정보를 추가
		
		System.out.println("----------------------------------");
		
		salesList.add(sales);
		
		System.out.println(" 제품의 " + type + "가 완료됬습니다. ");
		
		System.out.println("-----------------------------------");
		
	}

	public void print() {
		
		int subMenu = -1;
		
		Scanner sc = new Scanner(System.in);
		
		final int exit = 4;
		
		do {
			
			printSubMenu();
			
			subMenu = sc.nextInt();
			
			sc.nextLine();
			
			exeSubMenu(subMenu);
			
		} while(subMenu != exit);
		
	}

	public void printSubMenu() {
		
		System.out.println("-------------------출력 서브 메뉴----------------");
		
		System.out.println(" 1. 년별 매출액 확인 ");
		
		System.out.println(" 2. 월별 매출액 확인 ");
		
		System.out.println(" 3. 일별 매출액 확인 ");
		
		System.out.println(" 4. 이전 ");
		
		System.out.println("---------------------------------------------");
		
		System.out.print(" 출력 서브 메뉴를 선택하십시오 : ");
		
	}
	
	public void exeSubMenu(int subMenu) {
		
		switch(subMenu) {
		
		case 1 :
			
			System.out.println("----------------------------------");
			
			salesService.printByYear(salesList);
			
			System.out.println("----------------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("----------------------------------");
			
			salesService.printByMonth(salesList);
			
			System.out.println("----------------------------------");
			
			break;
			
		case 3 :
	
			System.out.println("----------------------------------");
	
			salesService.printByDay(salesList);
	
			System.out.println("----------------------------------");
	
			break;
	
		case 4 :
	
			System.out.println("----------------------------------");
	
			System.out.println(" 메인 메뉴로 돌아갑니다. ");
	
			System.out.println("----------------------------------");
	
			break;
	
		default :
	
			System.out.println("----------------------------------");
	
			System.out.println(" 출력 서브 메뉴를 잘못 선택했습니다.");
	
			System.out.println("----------------------------------");
	
			break;
		
		}
		
	}
	
}