package ch08.sec05;

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
	
	private int audioVolume;
	
	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		if(mute) {
			this.audioVolume = this.volume;
			setVolume(RemoteControl.MIN_VOLUME);
			System.out.println("무음 처리합니다." + this.volume);
		} else {
			this.volume = this.audioVolume;
			System.out.println("무음 해제합니다." + this.volume);
		}
	}
}
