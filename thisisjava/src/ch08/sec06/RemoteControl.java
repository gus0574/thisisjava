package ch08.sec06;

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
	
	//static은 클래스 소속이기 때문에 구현객체 없이도 사용할 수 있다.
	public static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
