package business;

public class Account implements Withdrawable, Depositable, Balanceable {
	protected double balance;

	
	
	
	
	public Account() {
		super();
	}
	
	

	public Account(double balance) {
		super();
		this.balance = balance;
	}


	@Override
	public double getBalance() {

		return balance;
	}

	@Override
	public void setBalance(double bal) {
		balance = bal;
	}

	@Override
	public void deposit(double amt) {
		balance += amt;

	}

	@Override
	public void withdraw(double amt) {
		balance -= amt;

	}

}
