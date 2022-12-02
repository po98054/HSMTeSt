package Day31;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

import lombok.Data;

@Data
public class KioskVer02 {
	
	// 필드 : 분류, 제품명, 수량, 구매가격, 판매가격
	
	private String classification;
	
	private String productName;
	
	private int Quantity;
	
	private final int purchasePrice = 6000;
	
	private final int salePrice = 5000;
	
	private Date saleDate;
	
	// 생성자
	
	public KioskVer02(String classification, String productName, int Quantity) {
		
		this.classification = classification;
		
		this.productName = productName;
		
		this.Quantity = Quantity;
		
	}
	
	public KioskVer02(String classification, String productName, int Quantity, String saleDate) throws ParseException {
		
		this.classification = classification;
		
		this.productName = productName;
		
		this.Quantity = Quantity;
		
		setDate(saleDate);
		
	}
	
	public KioskVer02(String classification, String productName) {
		
		this.classification = classification;
		
		this.productName = productName;
		
	}
	
	public KioskVer02(String classification) {
		
		this.classification = classification;
		
	}

	@Override
	public String toString() {
		
		return productName + "의 분류는 " + classification + "이며 " + productName + "의 갯수는 " + Quantity + "개 이며 " + productName + "의 구매가격은 " + purchasePrice + "원 이며 "
				+ productName + "의 판매가격은 " + salePrice + "원 입니다." + productName + "의 판매일자는 " + getDateStr();
	}
	
	public void update(String classification, String productName) {
		
		this.classification = classification;
		
		this.productName = productName;
		
	}

	public void purchaseUpdate(String classification, String productName, int quantity) {
		
		this.classification = classification;
		
		this.productName = productName;
		
		this.Quantity = this.Quantity + quantity;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		KioskVer02 other = (KioskVer02) obj;
		
		if (classification == null) {
			
			if (other.classification != null)
				
				return false;
			
		} else if (!classification.equals(other.classification))
			
			return false;
		
		if (productName == null) {
			
			if (other.productName != null)
				
				return false;
			
		} else if (!productName.equals(other.productName))
			
			return false;
		
		return true;
		
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		
		int result = 1;
		
		result = prime * result + ((classification == null) ? 0 : classification.hashCode());
		
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		
		return result;
		
	}
	
	public void setDate(String saleDate) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		this.saleDate = format.parse(saleDate);
		
	}
	
	public String getDateStr() {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		return format.format(saleDate);
		
	}

	public void update(int quantity, String saleDate) throws ParseException {
		
		this.Quantity = this.Quantity - quantity;
		
		setDate(saleDate);
		
	}
	
}