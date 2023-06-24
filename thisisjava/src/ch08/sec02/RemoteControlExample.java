package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RemoteControl rc = null;
//		rc = new Television();
		RemoteControl rc = new Television();;
		//인터페이스로 사용가능한 객체만 대입 가능. 즉, implements한 클래스
		
		rc.turnOn();
		
		//객체 교체
		rc = new Audio();
		rc.turnOn();
		
		//상수이기 때문에 객체로 접근하지 않고 바로 접근. Math.PI 처럼
		System.out.println(RemoteControl.MAX_VOLUME);
	}

}
