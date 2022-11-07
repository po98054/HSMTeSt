package Day11;

public class String02 {
	
	public static void main(String[] args) {
		
		String str = "Hello World! My Name Is Hong";
		
		String search = "o";
		
		int count = 0;
		
		String tmp = str;
		
		while(true) {
			
			int index = tmp.indexOf(search);
			
			System.out.println(index);
			
			if(index == -1) {
				
				break;
				
			}
			
			tmp = tmp.substring(index + search.length());
			
			System.out.println(tmp);
			
			count = count + 1;
			
			System.out.println(count);
			
			System.out.println("-----------------------------------");
			
		}
		
		System.out.println("----------------------");
		
		System.out.println(str + "에는 " + search + "가 " + count + "번 있습니다.");
		
	}

}
