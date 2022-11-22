package Day22;

public class ThreadEx01 {
	
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		
		System.out.println("현재 스레드명 : " + t.getName());
		
		//Thread t1 = new Thread(new Thread01());
		
		Thread t1 = new Thread(() -> {for(int i = 0; i < 100; i++)
			
			System.out.print("-");});
		
		t1.start();
		
		for(int i = 0; i < 100; i++) {
			
			System.out.print("|");
			
		}
		
	}

}

class Thread01 implements Runnable {
	
	@Override
	public void run() {
		
		/*for(int i = 0; i < 100; i++) {
			
			System.out.print("-");
		
		}*/
	
	}
	
}