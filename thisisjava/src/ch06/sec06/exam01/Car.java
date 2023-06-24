package ch06.sec06.exam01;

//라이브러리 클래스
class Car {
	//필드 선언
	String model;
	boolean start;
	int speed;
	
	Car(){
		speed = 10;
	}
	
	Car(String model, int speed) {
//		model = this.model;
//		speed = this.speed;
		this.model = model;
		this.speed = speed;
	}
}
