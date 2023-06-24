package ch07.sec08.exam02;

public class Driver {
	public void drive(Vehicle vehicle) {
		boolean vehicleType = vehicle instanceof Vehicle;
		boolean busType = vehicle instanceof Bus;
		boolean taxiType = vehicle instanceof Taxi;
		
		vehicle.run();
		
		if(busType == true) {
			System.out.println("vehicle 타입");
		} else if(vehicleType == true) {
			System.out.println("bus 타입");
		} else if (taxiType == true) {
			System.out.println("taxi 타입");
		}
		
	}
}
