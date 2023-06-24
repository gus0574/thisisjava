package ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		//static이 아닌 인스턴스 멤버이기 때문에 a 객체를 생성해야만 사용할 수 있다.
		A.B b = a.new B();
		
		b.methodB();
	}
}
