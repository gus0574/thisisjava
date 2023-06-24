package ch08.sec07;

public interface Service {
	default void method1() {
		System.out.println("method1");
		common();
	}
	default void method2() {
		System.out.println("method2");
		common();
	}
	private void common() {
		System.out.println("method1 중복코드");
		System.out.println("method2 중복코드");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1 중복코드");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 중복코드");
		staticCommon();
	}
	private static void staticCommon() {
		System.out.println("staticMethod1 중복코드");
		System.out.println("staticMethod2 중복코드");
	}
}
