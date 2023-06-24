package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		A a = new A();
		
		a.field1 = 11;
		a.field2 = 22;
		
		//private 형태라서 필드자체가안보임
//		a.field3 = 33;
		
		a.method1();
		a.method2();
		
		//private 형태라서 필드자체가안보임
//		a.method3();
	}
}
