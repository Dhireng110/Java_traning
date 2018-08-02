package lti.bank;
public class Current extends Account {
	private int Overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, MIN_CUR_BAL);
		this.Overdraft=OVERDRAFT_AMT;
	}

	@Override
	public void deposit(double amount) {
			Overdraft += amount;
			if (Overdraft > OVERDRAFT_AMT) {
				balance += Overdraft - OVERDRAFT_AMT;
				Overdraft = OVERDRAFT_AMT;
			}
		}

	@Override
	public void withdraw(double amount) {
		if (amount <= (balance + Overdraft)) {
			balance -= amount;
			if (balance < MIN_CUR_BAL) {
				Overdraft += balance;
				balance = MIN_CUR_BAL;
			}
		} else
			System.out.println("Insufficfent funds");
	}

}
