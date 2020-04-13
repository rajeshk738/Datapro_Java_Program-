// throws Example 2 Bank transaction Example (also covers random no generation)

package Exception_Handling;

import java.util.Scanner;
import java.util.Random;

class MyInvalidAmountException extends Exception{
	
	MyInvalidAmountException(String msg)
	{
		super(msg);
	}
}

class MyInsufficientBalanceException extends Exception{
	
	public MyInsufficientBalanceException(String msg) {
		
		super(msg);
	}
}

//---------------------------------------------------------------------------------

class BankAccount{
	private String accnum;
	private double balance;
	
	BankAccount(String accnum,double balance){
		this.accnum = accnum;
		this.balance = balance;
	}
	
	void deposit(double amt) throws MyInvalidAmountException
	{
		if(amt<100)
			throw new MyInvalidAmountException("attempting to deposit amount: "+amt+", please deposit amount >=100");
		balance+=amt;
	}
	
	void withdraw(double amt) throws MyInvalidAmountException,MyInsufficientBalanceException
	{
		if(amt <100)
			throw new MyInvalidAmountException("attempting to withdraw amount: "+amt+", please withdraw amount >=100");
		
		if(amt>balance)
			throw new MyInsufficientBalanceException("insufficient funds");
		
		balance -= amt;
	}
	
	double getBalance()
	{
		return balance;
	}
	
}
//-----------------------------------------------------------------------------------------------------

public class Sample15 {

	public static void main(String[] args) {
		
		BankAccount obj = new BankAccount("12345", 10000.0);
		Scanner scan = new Scanner(System.in);
		double amt;
		
		Random gen = new Random();
		
		int r;
		
		for(int i=1;i<=5;i++)
		{
			r = gen.nextInt(2);
			
			if(r==0) 				//deposit
			{
				try {
					System.out.println("Enter deposit amount: ");
					amt = scan.nextDouble();
					obj.deposit(amt);
					
					System.out.println("Successfully deposited amount: "+amt);
					System.out.println("Your balance is: "+obj.getBalance());
				}
				
				catch(MyInvalidAmountException e)
				{
					System.out.println("Runtime error1: "+e.getMessage());
				}
			}
			
			else     //withdraw
			{
				try {
					System.out.println("Enter withdraw amount: ");
					amt = scan.nextDouble();
					obj.withdraw(amt);
					
					System.out.println("Successfully withdrew amount: "+amt);
					System.out.println("Your balance is: "+obj.getBalance());
				}
				
				catch(MyInvalidAmountException e)
				{
					System.out.println("Runtime error2: "+e.getMessage());
				}
				
				catch(MyInsufficientBalanceException e)
				{
					System.out.println("Runtime error3: "+e.getMessage());
				}
			}
		}
		
		
	}

}
