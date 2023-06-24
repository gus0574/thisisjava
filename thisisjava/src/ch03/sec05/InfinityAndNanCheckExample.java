package ch03.sec05;

public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
		
		if(Double.isInfinite(x/y) || Double.isNaN(x%y)) {
			System.out.println("무한 또는 NaN");
		} else {
			System.out.println("3");
		}
	}

}
