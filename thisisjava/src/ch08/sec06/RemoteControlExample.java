package ch08.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(111);
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(111);
		rc.setMute(false);
		rc.turnOff();
		
		RemoteControl.changeBattery();
	}

}
