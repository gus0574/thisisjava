package ch11.sec02.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("java.lang.String");
			System.out.println("있다");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
