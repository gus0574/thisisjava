package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch (insufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("예금액 : " + account.getBalance());
	}

}
