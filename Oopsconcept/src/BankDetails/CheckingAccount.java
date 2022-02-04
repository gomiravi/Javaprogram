package BankDetails;

public class CheckingAccount extends AccountDetail {
	private static  int transactionCount;
	private static final int NUM_FREE = 3;
	private static final double TRANS_FEE = 2.0;


	public CheckingAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}


	
	public void Account() {
		
		transactionCount = 0;
	}

	
 public void deposit(double amount) {
		transactionCount++;

		super.deposit(amount);{
			System.out.println("your transaction is Success");

		}
		
		}

	

	
	public void withdraw(double amount) {
		transactionCount++;

		super.withdraw(amount); {
		
			System.out.println("your withdraw transaction  is:"+amount);

		}
		
	}

	 public void deductFees() {
		if (transactionCount > NUM_FREE)
		{
			double fees = TRANS_FEE * (transactionCount - NUM_FREE);
			super.withdraw(fees); 
				
				System.out.println("your transcation count is: "+transactionCount);
			}
		transactionCount = 0;

					
		}
		
		
	
	 public static void main(String[] args)
		{
		 AccountDetail obj1=new AccountDetail(balance);
		 obj1.getName("Ravi");
		 obj1.getAccountno(234);
		 obj1.getAccounttype("current");
		 obj1.getBalance();
		 CheckingAccount obj2= new CheckingAccount(1);
		 obj2.deposit(300.00);
		 obj2.withdraw(1500);
		 obj2.deductFees();
		 }
		}


