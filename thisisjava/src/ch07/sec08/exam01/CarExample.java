package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire tire = new Tire();
		KumhoTire kumhoTire = new KumhoTire();
		HankookTire hankookTire = new HankookTire();
		
		Car myCar = new Car();
		
		myCar.tire = tire;
		myCar.run();
		
		myCar.tire = kumhoTire;
		myCar.run();
		
		myCar.tire = hankookTire;
		myCar.run();
		
		
	}

}
