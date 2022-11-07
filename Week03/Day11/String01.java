package Day11;

public class String01 {
	
	public static void main(String[] args) {
		
		String str = "하성민";
		
		System.out.println(str);
		
		str = new String("유재석");
		
		System.out.println(str);
		
		System.out.println("문자열의 길이 : " + str.length());
		
		int arr[] = new int[5];
		
		System.out.println("배열의 길이 : " + arr.length);
		
		System.out.println("문자열 재의 위치 : " + str.indexOf("재"));
		
		str = "유재석"; 
		
		System.out.println("재의 마지막 번지 위치 : " + str.lastIndexOf("재"));
		
		System.out.println("하가 있는지 없는지 여부 확인 : " + str.contains("하"));
		
		System.out.println("1~2번지 추출 : " + str.substring(1));
		
		System.out.println("0~1번지 추출 : " + str.substring(0, 2));
		
		String str2 = "유재석";
		
		System.out.println("str과 str2가 같다? " + (str == str2)); // 객체가 같다.
		
		String str3 = new String("유재석");
		
		System.out.println("str과 str3가 같다 ? " + (str == str3)); // 객체가 다르다.
		
		String str4 = "김국진";
		
		System.out.println("str과 str4의 값이 일치 하는가 ? " + str.equals(str4));
		
		System.out.println("str과 str3의 값이 일치 하는가 ? " + str.equals(str3));
		
		System.out.println("1번지에 있는 값 : " + str4.charAt(1));
		
		String fruit = "사과, 배, 오렌지, 귤";
		
		String fruits [] = fruit.split(",");
		
		for(int i = 0; i < fruits.length; i++) {
			
			System.out.println("fruits[" + i + "] = " + fruits[i]);
			
		}
		
		String str5 = " 대한민국 지도 ";
		
		System.out.println("공백 제거 확인 : " + str5);
		
		System.out.println("공백 제거 확인 :" + str5.trim());
		
	}

}
