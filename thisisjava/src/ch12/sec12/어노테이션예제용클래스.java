package ch12.sec12;

public class 어노테이션예제용클래스 {
	
	public 어노테이션예제용클래스() {}
	
	@어노테이션생성
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@어노테이션생성("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@어노테이션생성(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}
