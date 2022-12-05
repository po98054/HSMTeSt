package Day31;

import lombok.Data;

public class CopyEx01 {
	
	public static void main(String[] args) {
		
		// 얕은 복사 (객체를 공유해서 한쪽이 변경되면 다른 쪽도 변경된다.)
		
		Test t = new Test(10, 20, "유재석");
		
		Test t2 = t;
		
		System.out.println("t의 값 : " + t);
		
		System.out.println("t2의 값 : " + t2);
		
		System.out.println("--------------------");
		
		t.setNum(30);
		
		t.getSub().setName("박수홍");
		
		System.out.println("t의 값 : " + t);
		
		System.out.println("t2의 값 : " + t2);
		
		System.out.println("--------------------");
		
		// 깊은 복사 (필드들을 각각 복사하고 공유하지 않기에 한쪽이 변경되도 다른 쪽이 변경되지 않음)
		
		// 필드가 참조 변수인 경우 생성자를 이용하여 복사 해야 합니다.
		
		Test t3 = new Test(40,50,"김국진");
		
		Test t4 = new Test(t3);
		
		System.out.println("t3의 값 : " + t3);
		
		System.out.println("t4의 값 : " + t4);
		
		System.out.println("--------------------");
		
		t3.setNum(60);
		
		t3.getSub().setName("이광수");
		
		System.out.println("t3의 값 : " + t3);
		
		System.out.println("t4의 값 : " + t4);
		
		System.out.println("--------------------");
		
	}

}

@Data
class Test{
	
	int num;
	
	int num2;
	
	Sub sub;
	
	public Test(int num, int num2, String name) {
		
		this.num = num;
		
		this.num2 = num2;
		
		this.sub = new Sub(name);
		
	}
	
	public Test(Test t) {
		
		this.num = t.num;
		
		this.num2 = t.num2;
		
		this.sub = new Sub(t.sub.getName());
		
	}
	
}

@Data
class Sub {
	
	String name;
	
	public Sub(String name) {
		
		this.name = name;
		
	}
	
	public Sub(Sub s) {
		
		this.name = s.name;
		
	}
	
}