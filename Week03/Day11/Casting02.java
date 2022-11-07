package Day11;

public class Casting02 {
	
	public static void main(String[] args) {
		
		// 클래스 다운 캐스팅은 조건부로 가능
		// 안되는 경우 : 부모 클래스의 객체를 바로 자식 클래스의 객체에 저장하는 경우
		
		//KiaCar kia = (KiaCar)(new Car("Kia","핑크","하성민",123,10,4));
		
		// 되는 경우 : 자식 클래스의 객체를 부모 클래스의 객체에 저장한 후, 부모 클래스의 객체를 다시 자식 클래스의 객체로 저장하는 경우
		
		KiaCar kia = new KiaCar("Kia","핑크","하성민",123,10,4);
		
		Car car = kia;
		
		KiaCar kia2 = (KiaCar)car;
		
		kia2.print();
		
		kia.print();
		
		Car [] carList = new Car[5];
		
		carList[0] = new KiaCar("Kia","핑크","하성민",123,10,4);
		
		carList[1] = new HyundaiCar("Hyundai","노랑","김국진",456,10,4);
		
		for(Car tmp : carList) {
			
			if(tmp == null) {
				
				continue;
				
			}
			
			if(tmp instanceof KiaCar) {
				
				((KiaCar) tmp).hand();
				
			} else if(tmp instanceof HyundaiCar) {
				
				((HyundaiCar) tmp).auto();
				
			}
			
		}
		
	}

}
