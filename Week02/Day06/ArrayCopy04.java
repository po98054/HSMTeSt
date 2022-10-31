package Day06;

public class ArrayCopy04 {

	public static void main(String[] args) {
		
		int array[] = new int[3];
		
		for(int i = 0; i < array.length; i++) {
			
			int num = (int)(Math.random()*10);
			
			array[i] = num;
			
		}
		
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
		
	}

}
