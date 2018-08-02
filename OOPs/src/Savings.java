
public class Savings extends Account {
	public Savings() {	
	}

	public Savings(String holder) {
		super(holder, 1000);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= (balance-1000))
			balance -= amount;
		else
			System.out.println("Insufficfent funds");
	}
	

}
