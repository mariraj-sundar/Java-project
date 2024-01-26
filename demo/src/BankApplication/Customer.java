package BankApplication;

public class Customer implements Runnable{
	private BankAccount account;
	
	Customer(BankAccount account){
		this.account = account;
	}
	public void run() {
		try {
			account.deposit(10000);
			account.withdraw(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Transaction Failed "+e.getMessage() );
		}
	}
}
