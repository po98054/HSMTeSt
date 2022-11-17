package Day19;

import java.text.DecimalFormat;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

import lombok.Data;

@Data
public class ItemVer03 {
	
	private String type;
	
	private String purpose;
	
	private String content;
	
	private int money;
	
	private Date date;

	public ItemVer03(String type, String purpose, String content, int money, String date) throws ParseException {
		
		this.type = type;
		
		this.purpose = purpose;
		
		this.content = content;
		
		this.money = money;
		
		setDate(date);
		
	}
	
	public void setDate(String date) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		this.date = format.parse(date);
		
	}
	
	public String getDateStr() {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		return format.format(date);
		
	}
	
	public String getMoneyStr() {
		
		DecimalFormat df = new DecimalFormat("###,###");
		
		return df.format(money);
		
	}
	
	public void print() {
		
		System.out.println("-------------------------");
		
		System.out.println("구분(수입/지출) : " + type);
		
		System.out.println("분류(식비/교통비 등) : " + purpose);
		
		System.out.println("내용 : " + content);
		
		System.out.println("금액 : " + getMoneyStr() + "원 ");
		
		System.out.println("일시 : " + getDateStr());
		
		System.out.println("-------------------------");
		
	}
	
	@Override
	public String toString() {
		
		return "구분(수입/지출) : " + type + " " + "분류(식비/교통비 등) : " + purpose + " " + "내용 : " + content + " " + "금액 : " + getMoneyStr() + "원 " + "일시 : " + getDateStr();
		
	}

}