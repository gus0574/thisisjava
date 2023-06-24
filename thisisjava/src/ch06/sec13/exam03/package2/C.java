package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	public C() {
		//클래스와 생성자 둘 다 public 이기 때문에 사용 가능
		A a = new A();
		
		a.field1 = 111;
		a.method1();
		
		//default이기 때문에 타 패키지에서 사용 불가
//		a.field2 = 222;
//		a.method2();
		
		//private이기 때문에 타 패키지에서 사용 불가
//		a.field3 = 333;
//		a.method3();
	}
}
