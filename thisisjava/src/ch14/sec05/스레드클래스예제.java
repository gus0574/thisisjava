package ch14.sec05;

public class 스레드클래스예제 extends Thread {
	private long sum;
	
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=100; i++) {
			sum += i;
		}
	}
}
