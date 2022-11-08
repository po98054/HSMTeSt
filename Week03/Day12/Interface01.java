package Day12;

public class Interface01 implements TvRemoteController {
	
	private int channel;
	
	private int volum;
	
	private boolean power;

	@Override
	public void onOff() {
		
		if(power == true) {
			
			System.out.println("현재 전원이 켜져있습니다.");
			
			power = !power;
			
		} else {
			
			System.out.println("현재 전원이 꺼져있습니다.");
			
			power = !power;
			
		}

	}

	@Override
	public void channelNum(int channel) {
		
		if (!power) {
			
			return;
			
		}
		
		this.channel = channel;
		
		System.out.println("현재 채널은 " + this.channel);

	}

	@Override
	public void channelUp() {
		
		if (!power) {
			
			return;
			
		}
		
		this.channel = this.channel + 1;
		
		System.out.println("현재 채널은 " + this.channel);

	}

	@Override
	public void channelDown() {
		
		if (!power) {
			
			return;
			
		}
		
		this.channel = this.channel - 1;
		
		this.channel = this.channel < 1 ? 999 : this.channel ;
		
		System.out.println("현재 채널은 " + this.channel);

	}

	@Override
	public void volumUp() {
		
		if (!power) {
			
			return;
			
		}
		
		this.volum = volum + 1;
		
		this.volum = this.volum < 10 ? this.volum : 10;
		
		System.out.println("현재 음향은 " + this.volum);

	}

	@Override
	public void volumDown() {
		
		if (!power) {
			
			return;
			
		}
		
		this.volum = this.volum - 1;
		
		this.volum = this.volum < 0 ? 0 : this.volum;
		
		System.out.println("현재 음향은 " + this.volum);
		
	}
	
	public void print() {
		
		System.out.println("전원 상태 : " + (power ? "on" : "off") + " 채널 : " + this.channel + " 음향 : " + this.volum);
		
		System.out.println("--------------------------------------------");
		
	}

}
