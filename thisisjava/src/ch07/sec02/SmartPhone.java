package ch07.sec02;

public class SmartPhone extends Phone{
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		super();	// 부모의 생성자 호출, 없어도 컴파일 시 추가됨
		//만약 부모의 생성자에 매개변수가 필요할경우 super(매개변수)를 명시해야함.
		this.model = model;
		this.color = color;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
