
public abstract class Account {
	private int acntNo;
	private String holder;
	protected double balance;

	private static int autogen = 1001;

	public Account() {

	}

	public Account(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
	}

	public void summary() {
		System.out.println("a/c no: " + acntNo);
		System.out.println("holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public abstract void withdraw(double amount);
}
