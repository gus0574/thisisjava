package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws insufficientException{
		if(balance < money) {
			throw new insufficientException("잔고부족: " + (money-balance));
		}
		
		balance -= money;
	}
}
