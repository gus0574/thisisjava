package ch08.sec02;

public interface RemoteControl {
	//public static final은 default라서 생략 가능
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//public 추상 메소드 -> 이 인터페이스로 turnOn이라는 메소드를 사용할 수 있구나~
	public abstract void turnOn(); //public과 abstract 생략 가능
	
}
