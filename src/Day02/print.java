package Day02;

public class print {
	
	public static void main(String[] args) {
		
		String name = "하성민";
		
		System.out.println("이름 : " + name);
		
		int age = 30;
		
		System.out.println("나이 : " + age);
		
		System.out.println("당신의 이름은 " + name + "이며 " + name + "의 나이는 " + age + "살 입니다.");
		
		int num1 = 10;
		int num2 = 20;
		
		char operator = '+';
		
		int sum = num1 + num2;
		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + sum); // 공란을 포함한 경우
		
		System.out.println(num1 + operator + num2 + " = " + sum); // 공란을 뺀 경우
		
		System.out.println(num1 + operator + num2 + " = " + (num1+num2));
		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1+num2));
		
	}

}
