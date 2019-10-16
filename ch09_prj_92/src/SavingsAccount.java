
public class SavingsAccount extends Account {
	
	private double monIntRate;
	private double monIntPymt;
	private double balance;
	
	public SavingsAccount(double monIntRate,double BeginBal) {
		super();
		this.monIntRate = monIntRate;
		this.balance = BeginBal;
	}
	
	
	
	
public void calcMonIntPymt() {
		monIntPymt = monIntRate*super.getBalance();
		super.setBalance(monIntPymt + super.getBalance());
	}

	/**
	 * @return the monIntPymt
	 */
	public double getMonIntPymt() {
		return monIntPymt;
	}
	
	
	
}
