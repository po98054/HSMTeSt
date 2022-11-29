package Day27;

public class ThreadEx02 {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new NewThread02());
		
		t.start(); // Run 메소드 호출
		
		Thread thisThread = Thread.currentThread();
		
		for(int i = 0; i < 20; i++) {
			
			System.out.println(thisThread.getName() + "쓰레드 실행");
			
			try {
				
				Thread.sleep(400);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}

}

class NewThread02 implements Runnable{
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("쓰레드 실행");
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
}