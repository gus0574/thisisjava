package ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.tire1 = new HankookTire();
		myCar.tire2 = new HankookTire();
		myCar.run();
		
		myCar.tire1 = new KumhoTire();
		myCar.run();
	}

}
