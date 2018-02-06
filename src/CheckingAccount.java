public class CheckingAccount extends Account{
	
	private double overdraftLimit;
	
	CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit)
	{	super(id,balance,annualInterestRate);
		this.overdraftLimit = overdraftLimit;}
	
	public void withdraw(double amount)
	{	if(super.getBalance() + overdraftLimit < amount)
			System.out.println("Insufficient Funds");
		else
			 super.setBalance(super.getBalance()-amount);}
	
	public String toString()
	{
		String result = super.toString() + " Overdraft Limit is:" + overdraftLimit;
		return result;
	}
	
	public static void main(String[] args)
	{
		CheckingAccount ck = new CheckingAccount(113,45000,10,5000);
		ck.withdraw(48000);
		System.out.println("Checking account -- " + ck.toString());
		Account ac = new Account(110,10000,10);
		System.out.println("Account -- " + ac.toString());
		ac.withdraw(12000);
	}
}