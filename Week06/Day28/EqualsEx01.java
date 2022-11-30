package Day28;

import java.util.ArrayList;

import java.util.List;

import lombok.Data;

public class EqualsEx01 {
	
	public static void main(String [] args) {
		
		// List에서 제공하는 indexOf와 Contains
		
		ArrayList<Test> list = new ArrayList<Test>();
		
		list.add(new Test(1,1));
		
		list.add(new Test(2,3));
		
		List<Test> list2 = new ArrayList<Test>();
		
		list2.add(new Test(1,1));
		
		list2.add(new Test(2,3));
		
		System.out.println("두 리스트 비교 : " + list.containsAll(list2));
		
	}

}

@Data
class Test {
	
	int num;
	
	int num2;
	
	public Test(int num, int num2) {
		
		this.num = num;
		
		this.num2 = num2;
	}
	
}