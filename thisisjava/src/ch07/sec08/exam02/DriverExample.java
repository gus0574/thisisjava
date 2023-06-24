package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
//		driver.drive(new Vehicle());
//		driver.drive(new Bus());
//		driver.drive(new Taxi());
		
		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(vehicle);
		driver.drive(bus);
		driver.drive(taxi);
		
		// 상위 또는 하위 클래스에 속해야만 instanceof 사용가능
		boolean result = vehicle instanceof Bus;
		System.out.println(result);
	}

}
