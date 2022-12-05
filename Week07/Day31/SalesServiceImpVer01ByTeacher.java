package Day31;

import java.util.*;

import java.util.function.Predicate;

public class SalesServiceImpVer01ByTeacher implements SalesServiceVer01ByTeacher{

	@Override
	public SalesVer01ByTeacher inputSales(String saleType) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 일시 (yyyy-MM-dd) : ");
		
		String date = sc.nextLine();
		
		System.out.print(" 분류 : ");
		
		String type = sc.nextLine();
		
		System.out.print(" 제품명 : ");
		
		String title = sc.nextLine();
		
		System.out.print(" 수량 : ");
		
		int amount = sc.nextInt();
		
		if(amount <= 0) {
			
			return null;
			
		}
		
		ProductVer01ByTeacher product = new ProductVer01ByTeacher(type, title, 0, 0);
		
		SalesVer01ByTeacher sales = new SalesVer01ByTeacher(product, amount, 0, date, SalesType.valueOf(saleType));
		
		return sales;
		
	}
	
	public void printByYear(List<SalesVer01ByTeacher> salesList) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 연도를 입력하세요 : ");
		
		String year = sc.nextLine();
		
		String date = year;
		
		printSales(salesList, s -> {
			
			String salesDate = s.getDateStr().substring(0, date.length());
			
			return salesDate.equals(date);
			
		});
		
	}
	
	@Override
	public void printSales(List<SalesVer01ByTeacher> salesList , Predicate<SalesVer01ByTeacher> p) {
		
		if(salesList == null || salesList.size() == 0) {
			
			System.out.println("-----------------------------");
			
			System.out.println(" 결과가 없습니다. ");
			
			System.out.println("-----------------------------");
			
		}
		
		int count = 0;
		
		int buyPrice = 0;
		
		int sellPrice = 0;
		
		for(SalesVer01ByTeacher sales : salesList) {
			
			if(p.test(sales)) {
				
				System.out.println("----------------------------");
				
				System.out.println(sales);
				
				System.out.println("----------------------------");
				
				count = count + 1;
				
				if(sales.getType() == SalesType.구매) {
					
					buyPrice += sales.getPrice();
					
				} else {
					
					sellPrice += sales.getPrice();
					
				}
				
			}
			
		}
		
		if(count == 0) {
			
			System.out.println("-------------------------------");
			
			System.out.println(" 결과가 없습니다. ");
			
			System.out.println("--------------------------------");
			
		} else {
			
			System.out.println("----------------------------------");
			
			System.out.println(" 구매 금액 : " + buyPrice);
			
			System.out.println(" 판매 금액 : " + sellPrice);
			
			System.out.println(" 매출 정산 : " + (sellPrice - buyPrice));
			
			System.out.println("-----------------------------------");
			
		}
		
	}
	
	public void printByMonth(List<SalesVer01ByTeacher> salesList) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 연도를 입력하세요 : ");
		
		String year = sc.nextLine();
		
		System.out.print(" 월을 입력하세요 : ");
		
		String month = sc.nextLine();
		
		String date = year + "-" + (month.length() < 2 ? "0" + month : month);
		
		printSales(salesList, s -> {
			
			String salesDate = s.getDateStr().substring(0, date.length());
			
			return salesDate.equals(date);
			
		});
		
	}
	
	public void printByDay(List<SalesVer01ByTeacher> salesList) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 연도를 입력하세요 : ");
		
		String year = sc.nextLine();
		
		System.out.print(" 월을 입력하세요 : ");
		
		String month = sc.nextLine();
		
		System.out.print(" 일을 입력하세요 : ");
		
		String day = sc.nextLine();
		
		String date = year + "-" + (month.length() < 2 ? "0" + month : month) + "-" + (day.length() < 2 ? "0" + day : day);
		
		printSales(salesList, s -> {
			
			String salesDate = s.getDateStr().substring(0, date.length());
			
			return salesDate.equals(date);
			
		});
		
	}

}