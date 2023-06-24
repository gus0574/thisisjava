package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(111);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-111);
		rc.turnOff();
	}

}
