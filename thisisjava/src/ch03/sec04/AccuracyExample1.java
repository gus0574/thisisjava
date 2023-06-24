package ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - pieceUnit * number;
		
		System.out.println(result);
		//0.3이 안나옴. 정확한 연산을 위해서는 정수로 연산해야한다 
	}

}
