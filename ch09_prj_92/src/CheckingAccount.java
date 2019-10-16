
public class CheckingAccount extends Account {
	private double monthlyFee;
	private double balance;
	
	
	public CheckingAccount(double monthlyFee,double BeginBal) {
		super();
		this.monthlyFee = monthlyFee;
		this.balance = BeginBal;		
	}
	
	
	public CheckingAccount() {
		super();
		
	}


	public void subtractFee() {
		double BalMinusFee = super.getBalance() - monthlyFee;
		super.setBalance(BalMinusFee);
	}
	
	public double getFee() {
		
		return this.monthlyFee;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

//	@Override
//	public void setBalance(double amount) {
//		// TODO Auto-generated method stub
//		super.setBalance(amount);
//	}
	
	
	
}
