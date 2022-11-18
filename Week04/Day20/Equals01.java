package Day20;

import java.util.ArrayList;

import lombok.Data;

public class Equals01 {
	
	public static void main(String[] args) {
		
		Test test = new Test();
		
		test.setNum(25);
		
		System.out.println("숫자 : " + test.getNum());
		
		System.out.println("Test 객체와 Integer 객체 간의 일치 여부 확인(Equals) : " + test.equals((Integer)test.getNum()));
		
		ArrayList<Test> list = new ArrayList<Test>();
		
		list.add(test);
		
		System.out.println("Test 리스트와 Integer 객체 간의 일치 여부 확인(Contains) : " + list.contains((Integer)test.getNum()));
		
		System.out.println("Test 리스트와 Integer 객체 간의 일치 여부 확인(indexof) : " + list.indexOf((Integer)test.getNum()));
		
	}

}

@Data
class Test {
	
	private int num;

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass()) {
			
			// 클래스가 다른 경우 obj가 Integer로 변환이 가능한 경우
			
			if(obj instanceof Integer) {
				
				return num == (Integer) obj;
				
			}
			
			return false;
			
		}
		
		Test other = (Test) obj;
		
		if (num != other.num)
			
			return false;
		
		return true;
		
	}
	
}