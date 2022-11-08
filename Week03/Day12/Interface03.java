package Day12;

public class Interface03 {
	
	public static void main(String[] args) {
		
		// 인터페이스를 통해 객체 생성 불가
		
		//TvRemoteController tv = new TvRemoteController();
		
		// but 인터페이스 참조 변수에 객체 저장 가능
		
		TvRemoteController tv = new Interface01();
		
		tv.onOff();
		
		tv.channelNum(50);
		
		tv.channelDown();
		
		tv.channelUp();
		
		tv.volumUp();
		
		tv.volumDown();
		
		((Interface01)tv).print();
		
		Interface01 tv2 = new Interface01();
		
		//tv2.channelNum(80);
		
		tv2.print();
		
		tv2.onOff();
		
		for(int i = 0; i < 10; i++) {
			
			tv2.volumUp();
			
		}
		
		for(int i = 0; i < 2; i++) {
			
			tv2.channelDown();
			
			//tv2.volumDown();
			
		}
		
		//tv2.channelUp();
		
		tv2.print();
		
	}

}
