public class Account{
	
	private int id ;
	private double balance ;
	private double annualInterestRate ;
	
	Account()
	{	id = 0;
		balance = 1000;
		annualInterestRate = 4.50;}
	
	Account(int id, double balance)
	{	this.id = id;
		this.balance = balance;
		annualInterestRate = 4.50;}
	
	Account(int id, double balance, double annualInterestRate)
	{	this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;}
	
	public int getId()
	{	return id;}
	
	public double getBalance()
	{	return balance;}
	
	public double getRate()
	{	return annualInterestRate;}
	
	public void setId(int id)
	{	this.id = id;}
	
	public void setBalance(double balance)
	{	this.balance = balance;}
	
	public void setRate(double annualInterestRate)
	{	this.annualInterestRate = annualInterestRate;}
	
	public double getMonthlyInterestRate()
	{	return (annualInterestRate/12);}
	
	public void withdraw(double amount)
	{	if(amount>balance)
			System.out.println("Insufficient Funds");
		else
			balance -= amount;}
	
	public void deposit(double amount)
	{	balance+=amount;	}
	
	public String toString()
	{	String result = "ID is:" + id + " Balance is:" + balance + " Annual Interest Rate is :" + annualInterestRate;
		return result;}
}
