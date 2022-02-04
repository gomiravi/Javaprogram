package BankDetails;

public class BankAccount extends AccountDetail {
	
	public BankAccount(double balance) {
	super(balance);
	// TODO Auto-generated constructor stub
}

public static void main(String[] args)
{
  AccountDetail obj = new AccountDetail(2000.34);
  obj.getName("Gomathi");
  obj.getAccountno(123);
  obj.getAccounttype("saving");
  
  obj.deposit(100);
  obj.withdraw(500);
  obj.addInterest();



}

}