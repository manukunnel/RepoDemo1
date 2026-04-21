package encapsulation;

public class Account {
	private double balance;
	public void setBalance(double balance)
	{
		if(balance>=1000)
		this.balance = balance;
		else
		System.out.println("Balance less than $1000");
	}
	public void deposit(double amount)
	{
		if(amount>=1000)
			this.balance += amount;
			else
			System.out.println("Amount less than $1000");
	}
	public void withdraw(double amount)
	{
		if(amount>0)
		{
			this.balance = this.balance-amount;
			
		}
		if(this.balance<1000)
		{
			System.out.println("your balance is less than $1000");
		}
	}
	public double getBalance()
	{
		return this.balance;
	}


}
