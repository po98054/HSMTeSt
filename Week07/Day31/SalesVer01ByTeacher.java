package Day31;

import java.util.*;

import lombok.Data;

//어떠한 제품을 구매/판매 했는지에 대한 내역을 기록하는 클래스

@Data
public class SalesVer01ByTeacher {
	
	// 제품 정보, 수량, 타입 (구매/판매), 총금액, 일시 (yyyy-MM-dd)
	
	private ProductVer01ByTeacher product;
	
	private int amount;
	
	private int price;
	
	private Date date;
	
	private SalseType type;
	
	public SalesVer01ByTeacher(ProductVer01ByTeacher product, int amount, int price, Date date, SalseType type) {
		
		this.product = product;
		
		this.amount = amount;
		
		this.price = price;
		
		this.date = date;
		
		this.type = type;
		
	}

}

enum SalseType {
	
	판매, 구매
	
}