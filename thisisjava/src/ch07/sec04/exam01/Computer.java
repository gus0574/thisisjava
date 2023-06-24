package ch07.sec04.exam01;

public class Computer extends Calculator {
	
	// @기호는 어노테이션(Annotation) 
	// 어노테이션을 붙이면 재정의가 제대로 되었는지 컴파일러가 확인해줌
	@Override
	public double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
