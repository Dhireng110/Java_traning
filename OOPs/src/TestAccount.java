

import lti.bank.AccountFactory;
import lti.bank.Bank;

public class TestAccount {

	public static void main(String[] args) {
		Bank ac=AccountFactory.openAccount("saving","Polo");
		ac.deposit(3000);
		ac.withdraw(4000);
		ac.deposit(3000);
		ac.deposit(4000);
		ac.deposit(5000);
		ac.deposit(6000);
		ac.deposit(8000);
		ac.withdraw(7000);
		ac.statement();
//		Savings savings=new Savings("Dhiren");
//		savings.deposit(2000);
//		savings.getBalance();
//		Current current=new Current("Dhiren");
//		
//		current.deposit(5000);
//		current.withdraw(19000);
//		current.deposit(11000);
//		System.out.println(current.getBalance());
		
	}

}
