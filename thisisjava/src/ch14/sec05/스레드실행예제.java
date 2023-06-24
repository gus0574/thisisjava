package ch14.sec05;

public class 스레드실행예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		스레드클래스예제 sumThread = new 스레드클래스예제();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("1~100합 : "+sumThread.getSum());
	}

}
