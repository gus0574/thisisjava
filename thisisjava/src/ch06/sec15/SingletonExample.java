package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 싱글톤 패턴이기 때문에 에러
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
	}

}
