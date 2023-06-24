package ch14.sec06;

public class User2Thread extends Thread{
	private Calculator calculator;
	
	public User2Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}

}
