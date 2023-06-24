package ch11.sec05;

public class ThrowsExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		findClass();
		
//		try {
//			findClass();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
		
//		try {
//			Class.forName("java.lang.String2");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
