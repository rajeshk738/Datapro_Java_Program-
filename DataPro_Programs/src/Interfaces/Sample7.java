// Runtime polymorphism example 2

package Interfaces;

interface Payable
{
	double getPaymentAmount();
	void printData();
}

class Invoice implements Payable
{
	private String description;
	private double pricePerItem;
	private int quantity;
	
	Invoice(String des,double price,int q)
	{
		description = des;
		pricePerItem = price;
		quantity = q;
	}
	
	public void printData()
	{
		System.out.println(description+", "+pricePerItem+", "+ quantity);
	}
	
	public double getPaymentAmount()
	{
		return pricePerItem * quantity;
	}
}

abstract class Employee implements Payable
{
	private int idno;
	private String name;
	Employee(int n, String na)
	{
		idno = n;
		name = na;
	}
	
	public void printData()
	{
		System.out.println(idno+ ", "+name);
	}

}

class SalariedEmployee extends Employee
{
	private double weeklySalary;
	SalariedEmployee(int n,String na,double sal)
	{
		super(n,na);
		weeklySalary = sal;
	}
	
	public void print()
	{
		super.printData();
		System.out.println(weeklySalary);
	}
	
	public double getPaymentAmount()
	{
		return 4*weeklySalary;
	}
}

public class Sample7 {

	public static void main(String[] args) {
		
		Payable arr[] = new Payable[4];
		arr[0] = new Invoice("NoteBooks",30,5);
		arr[1] = new Invoice("Stapler",50,1);
		
		arr[2]  = new SalariedEmployee(11, "Praveen Kumar", 10000.0);
		arr[3] = new SalariedEmployee(12, "Peterson", 20000.0);
		
		for(Payable p: arr)
		{
			p.printData();
			System.out.println(p.getPaymentAmount());
			System.out.println();
		}
		

	}

}
