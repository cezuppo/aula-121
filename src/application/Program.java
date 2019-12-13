// COMPREENDE AS AULAS 121,122,123,124,125

package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Anna has a Business Account. Balance after loan: " + acc5.getBalance());
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Anna has a Savings Account. Balance: " + acc5.getBalance());
		}
		
		//SUPERPOSITION
		
		Account acc6 = new Account(1005, "Brian", 1000.0);
		acc6.withdraw(200.0);
		System.out.println("Brian's account balance after withdraw: " + acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1006, "Amanda", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println("Amanda's savings account balance after withdraw: " + acc7.getBalance());
		
		Account acc8 = new BusinessAccount(1007, "Chris", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println("Chris' business account balance after withdraw: " + acc8.getBalance());
		
		Account x = new Account(1020, "John", 1000.0);
		Account y = new SavingsAccount(1023, "Jane", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println("Account " + x.getNumber() + " balance after withdraw of 50.0: " + x.getBalance());
		System.out.println("Savings Account " + y.getNumber() + " balance after withdraw of 50.0: " + y.getBalance());
	}
	
	
}
