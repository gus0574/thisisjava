package ch08.sec04;

public class Audio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		setVolume(5);
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");
		setVolume(0);
	}
	
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨: " + this.volume);
	}
}
