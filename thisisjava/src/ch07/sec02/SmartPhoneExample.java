package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("갤럭시", "검정색");
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요");
		myPhone.sendVoice("반갑습니다");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		System.out.println("와이파이 상태: " + myPhone.wifi);
		myPhone.internet();
	}

}
