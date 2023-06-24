package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println("search " + url);
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TurnOn");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TurnOff");
	}
}
