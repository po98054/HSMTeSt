package Day22;

import java.text.ParseException;

public class StudentLogVer01ByHSM extends StudentVer01ByHSM{
	
	private String state;

	public StudentLogVer01ByHSM(String name, String birthday) throws ParseException {
		
		super(name, birthday);
		
	}

	public StudentLogVer01ByHSM(String name, String birthday, String state) throws ParseException {
		
		super(name, birthday);
		
		this.state = state;
		
	}
	
}