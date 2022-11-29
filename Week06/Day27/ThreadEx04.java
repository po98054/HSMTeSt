package Day27;

public class ThreadEx04 {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(() -> {
			
				for(int i = 0; i < 10; i++) {
					
					System.out.println(i + "쓰레드 실행");
					
					try {
						
						Thread.sleep(1000); // 스레드 휴식
						
					} catch (InterruptedException e) {
						
						e.printStackTrace();
						
					}
					
				}
				
			});
		
		t.start(); // Run 메소드 호출
		
		Thread thisThread = Thread.currentThread();
		
		for(int i = 0; i < 20; i++) {
			
			System.out.println(thisThread.getName() + i + "쓰레드 실행");
			
			try {
				
				Thread.sleep(400);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}

}