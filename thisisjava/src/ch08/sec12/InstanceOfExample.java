package ch08.sec12;

public class InstanceOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		ride(bus);
	}
	
	public static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			//강제 타입 변환을 통해 인터페이스에는 존재하지 않는 Bus 만의 메소드를 호출할 수 있다.
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}

}
