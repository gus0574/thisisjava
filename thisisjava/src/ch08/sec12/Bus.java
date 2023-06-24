package ch08.sec12;

public class Bus implements Vehicle{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스");
	}
	
	public void checkFare() {
		System.out.println("요금정산");
	}
}
