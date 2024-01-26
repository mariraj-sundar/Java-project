package BankApplication;


public class BankAccount {

	private double balance = 5000;
	private double dailyDepositLimit = 25000;
	private int transactions = 0;
	
		
	public double getBalance() {
		return balance;
	}
	public synchronized void deposit(double amount) throws Exception{
		if(amount<=0) {
			throw new IllegalArgumentException("Deposit amount must be positive");
		}
			
		if(dailyDepositLimitExceeded(amount)) {
			throw new Exception("Daily Deposit limit Exceeded");
		}
			
		balance = balance + amount;
		transactions++;
			
		System.out.println("Deposit of Rs."+amount+" completed.New balance : Rs."+balance);
	}
	
	public synchronized void withdraw(double amount) throws Exception{
		if(amount<=0) {
			throw new IllegalArgumentException("Deposit amount must be positive");
		}
		
		if(balance-amount<5000) {
			throw new Exception("Withdraw would result in balance below the minimum limit");
		}
		balance-=amount;
		transactions++;
		
		System.out.println("Withdraw of Rs."+amount+" completed.New balance Rs."+balance);
	}
	
	public synchronized boolean dailyDepositLimitExceeded(double amount) {
		if(amount <= dailyDepositLimit) {
			return false;
		}
		return true;
	}

}