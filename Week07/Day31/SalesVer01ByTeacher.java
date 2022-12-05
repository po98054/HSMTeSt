package Day31;

import java.text.ParseException;

import java.text.SimpleDateFormat;

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
	
	private SalesType type;
	
	public SalesVer01ByTeacher(ProductVer01ByTeacher product, int amount, int price, String date, SalesType type){
		
		this.product = product;
		
		this.amount = amount;
		
		this.price = price;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			
			this.date = sdf.parse(date);
			
		} catch (ParseException e) {
			
			this.date = null;
			
		}
		
		this.type = type;
		
	}

	public void calculate(String type) {
		
		if(product == null) {
			
			return;
			
		}
		
		int price = 0;
		
		if(SalesType.valueOf(type) == SalesType.구매) {
			
			price = product.getBuyPrice() * amount;
			
		} else if(SalesType.valueOf(type) == SalesType.판매) {
			
			price = product.getSellPrice() * amount;
			
		}
		
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "해당 " + product.getTitle() + "의 정보는 " + product + "이며 해당 "+ product.getTitle() + "의 총 수량은 " + amount + "이며 해당 "
	            + product.getTitle() + "의 구매가/판매가는 " + price + "이며 해당 " + product.getTitle() + "의 구매/판매 일자는 " + getDateStr() + "이며 해당 " + product.getTitle()
	            + "의 타입은 " + type.toString() + "입니다.";
	
	}
	
	public String getDateStr() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		if(date == null) {
			
			return "";
			
		}
		
		return sdf.format(date);
		
	}
	
}

enum SalesType {
	
	판매, 구매
	
}