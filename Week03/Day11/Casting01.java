package Day11;

public class Casting01 {
	
	public static void main(String[] args) {
		
		// 업캐스팅
		
		Car car = new KiaCar("Kia","핑크","하성민",123,10,4);
		
		car.print();
		
		Car [] carList = new Car[5];
		
		carList[0] = new KiaCar("Kia","핑크","하성민",123,10,4);
		
		carList[1] = new KiaCar("Kia","핑크","유재석",456,20,4);
		
		for(int i = 0; i < 2; i++) {
			
			carList[i].print();
			
		}
		
		carList[0] = new HyundaiCar("Hyundai","노랑","김국진",456,10,4);
	}

}
