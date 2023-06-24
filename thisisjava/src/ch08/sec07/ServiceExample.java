package ch08.sec07;

public class ServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service serv = new ServiceImpl();
		
		serv.method1();
		serv.method2();

		Service.staticMethod1();
		Service.staticMethod2();
	}

}
