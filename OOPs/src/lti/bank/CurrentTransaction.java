package lti.bank;

public class CurrentTransaction extends Transaction{

	public CurrentTransaction() {
	}

	public CurrentTransaction(String type, double amount, double balance) {
		super(type, amount, balance);
		
	}

	@Override
	public String toString() {
		return "Transaction [type=" + type + ", amount=" + amount + ", balance=" + balance + "]";
	}
	
	
}
