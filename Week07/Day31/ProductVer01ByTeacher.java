package Day31;

import lombok.Data;

@Data
public class ProductVer01ByTeacher {
	
	private String type;
	
	private String title;
	
	private int amount;
	
	private final int buyPrice;
	
	private final int sellPrice;
	
	public ProductVer01ByTeacher(String type, String title, int buyPrice, int sellPrice) {
		
		this.type = type;
		
		this.title = title;
		
		this.buyPrice = buyPrice;
		
		this.sellPrice = sellPrice;
		
	}
	
	public ProductVer01ByTeacher(ProductVer01ByTeacher p) {
		
		this.type = p.type;
		
		this.title = p.title;
		
		this.amount = p.amount;
		
		this.buyPrice = p.buyPrice;
		
		this.sellPrice = p.sellPrice;
		
	}
	
	public void addAmount(int amount) {
		
		this.amount += amount;
		
	}
	
	public String toString() {
		
		return title + "의 분류는 " + type + "이며 " + title + "의 갯수는 " + amount + "개 이며 " + title + "의 구매가격은 " + buyPrice + "원 이며 " 
		       + title + "의 판매가격은 " + sellPrice + "원 입니다.";
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		ProductVer01ByTeacher other = (ProductVer01ByTeacher) obj;
		
		if (title == null) {
			
			if (other.title != null)
				
				return false;
			
		} else if (!title.equals(other.title))
			
			return false;
		
		if (type == null) {
			
			if (other.type != null)
				
				return false;
			
		} else if (!type.equals(other.type))
			
			return false;
		
		return true;
		
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		
		int result = 1;
		
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		
		return result;
		
	}
	
}