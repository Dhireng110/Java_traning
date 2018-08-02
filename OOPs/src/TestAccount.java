
public class TestAccount {

	public static void main(String[] args) {
//		Account ac=new Account("Polo",5000);
//		ac.summary();
//		ac.deposit(3000);
//		System.out.println(ac.getBalance());
//		ac.withdraw(4000);
//		System.out.println(ac.getBalance());
//		ac.withdraw(7000);
//		Savings savings=new Savings("Dhiren");
//		savings.deposit(2000);
//		savings.getBalance();
		Current current=new Current("Dhiren");
		
		current.deposit(5000);
		current.withdraw(19000);
		current.deposit(11000);
		System.out.println(current.getBalance());
		
	}

}
