package Day27;

public class ThreadEx03 {
	
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0; i < 10; i++) {
					
					System.out.println("쓰레드 실행");
					
					try {
						
						Thread.sleep(1000); // 스레드 휴식
						
					} catch (InterruptedException e) {
						
						e.printStackTrace();
						
					}
					
				}
				
			}
			
		};
		
		Thread t = new Thread(runnable);
		
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