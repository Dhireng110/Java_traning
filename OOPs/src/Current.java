
public class Current extends Account {
	private int Overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, 5000);
		this.Overdraft=10000;
	}

	@Override
	public void deposit(double amount) {
			Overdraft += amount;
			if (Overdraft > 10000) {
				balance += Overdraft - 10000;
				Overdraft = 10000;
			}
		}

	@Override
	public void withdraw(double amount) {
		if (amount <= (balance + Overdraft)) {
			balance -= amount;
			if (balance < 0) {
				Overdraft += balance;
				balance = 0;
			}
		} else
			System.out.println("Insufficfent funds");
	}

}
