// understand the importance of static members

package Introduction_Java_Programming;

class BankAccount{
	String accNum;  //--> instance field
	float balance;		//--> instance field
	static float minBalance =1000;  //--> static field(shared data)
	
	BankAccount(String n, float bal){
		accNum =n;
		balance = bal;
	}
	
	float getBalance()
	{
		return balance;
		// return minBalance;
	}
	
	static float getMinBalance()
	{
		return minBalance; // OK
		// return balance; // IS NOT OK
	}
	
}

public class Sample21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a1=new BankAccount("A1",100000);
		BankAccount a2=new BankAccount("A2",200000);
		BankAccount a3=new BankAccount("A3",300000);
		System.out.println(a2.getBalance());
		System.out.println(BankAccount.getMinBalance());
		
	}

}
