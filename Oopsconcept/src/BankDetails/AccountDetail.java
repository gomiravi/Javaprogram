package BankDetails;

public class AccountDetail {
	
	
	 String name;
	 String acctype;
		static double balance;
		int accno;
		double interestRate;
		

	 public AccountDetail(double balance) {

		balance=20000;
		 
	 }
	 public void getName(String name) {
		
		 System.out.println("The Accounter name is:"+name);
	 }
	 public void getAccountno(int accno)
	 {
		 System.out.println("The Accountno:"+accno);

	 }
	 public void getAccounttype(String acctype) {
		 System.out.println("The Accounttype is:"+acctype);

	 }
	 public void addInterest() {
			double interest = getBalance() * interestRate / 100;
			deposit(interest);
			 System.out.println("your interest is:"+interest);

		}
		
		protected double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
		void  deposit(double amount) {
			if (amount > 0) {
				balance = balance + amount;
				 System.out.println("The deposit is:"+balance);

			}
		}

		
		void  withdraw(double amount) {
			if (amount > balance) {
				 //System.out.println("The withdraw is sucess");

			} else {
				balance = balance - amount;

				 //System.out.println("failed the withdraw");

			}

	 
		}
			}
