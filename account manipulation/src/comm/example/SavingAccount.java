package comm.example;

public class SavingAccount extends Account {
	
	 public SavingAccount(int accountNumber, Customer customerObj, double balance) {
		super(accountNumber, customerObj, balance);
		// TODO Auto-generated constructor stub
	}
	private double minimumBalance;

	    public SavingAccount(int accountNumber,Customer customerobj,double balance, double MinimumBalance)
	    {
	     super(accountNumber,customerobj,balance);
	     minimumBalance=MinimumBalance;
	    }

	   
	    public double getMinimumBalance() {
	    return minimumBalance;
	  }

	  public void setMinimumBalance(double minimumBalance) {
	    this.minimumBalance = minimumBalance;
	  }
	   public boolean withdraw(double amount)
	   {
	       if((balance-amount)>minimumBalance)
	       {
	           balance=(balance-amount);
	           return true;
	       }
	       else
	       return false;
	   }

	    

}
