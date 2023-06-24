package ch06.sec06.exam01;

//실행 클래스
public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car 객체 생성 (라이브러리 클래스 사용)
		Car myCar = new Car();	//myCar 변수는 스택, Car객체는 힙에 생성
		
		//Car 객체의 필드 값 읽기
		System.out.println(myCar.model);
		System.out.println(myCar.start);
		System.out.println(myCar.speed);
		
		Car newCar = new Car("그랜저", 100);
		
		System.out.println(newCar.model);
		System.out.println(newCar.start);
		System.out.println(newCar.speed);
	}

}
