package Day22;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

import lombok.Data;

@Data
public class StudentVer01ByHSM {
	
	private String name;
	
	private Date birthday;
	
	public void setDate(String birthday) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		this.birthday = format.parse(birthday);
		
	}
	
	public String getDateStr() {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		return format.format(birthday);
		
	}

	public StudentVer01ByHSM(String name, String birthday) throws ParseException{
		
		this.name = name;
		
		setDate(birthday);
		
	}

	@Override
	public String toString() {
		
		return "이름 : " + name + " " + "생년월일 : " + getDateStr();
		
	}

	public void update(String name, String birthday) throws ParseException {
		
		this.name = name;
		
		setDate(birthday);
		
	}
	
	public StudentVer01ByHSM(String name) {
		
		this.name = name;
		
	}
	
}