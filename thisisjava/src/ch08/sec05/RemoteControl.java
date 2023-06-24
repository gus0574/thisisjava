package ch08.sec05;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//구현객체가없으면 실행할 수 없다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제");
			setVolume(1);
		}
	}
}
