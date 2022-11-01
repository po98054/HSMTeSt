package Day07;

public class Method06 {
	
	public static void main(String[] args) {
		
		int array[] = new int[3];
		
		// 저장하고 출력한 함수를 호출하는 코드
		
		int min = 1;
		int max = 9;
		
		System.out.println(random(min,max));
		
		saveArray(array,9,1);
		
		printArray(array);
		
	}
	
	// 1 ~ 9 사이의 랜덤한 수를 배열에 저장하는 코드
	public static void saveArray(int array[], int max, int min) {
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int)(Math.random()*(max - min + 1) + min);
			
		}
		
	}
	
	// 배열에 저장한 수를 출력하는 코드
	public static void printArray(int array[]) {
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("array[" + i + "] = " + array[i]);
			
		}
		
	}
	
	public static int random(int max, int min) {
		
		return (int)(Math.random()*(max - min + 1) + min);
		
	}
	
}
