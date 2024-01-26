package BankApplication;

public class MultiThreadingBanking {

	public static void main(String[] args) {
		BankAccount sharedAccount = new BankAccount();
		
		Thread customer1 = new Thread(new Customer(sharedAccount));
		Thread customer2 = new Thread(new Customer(sharedAccount));
		
		customer1.start();
		customer2.start();
		
		try {
			customer1.join();
			customer2.join();
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Final Balance Rs."+sharedAccount.getBalance());
	}

}
