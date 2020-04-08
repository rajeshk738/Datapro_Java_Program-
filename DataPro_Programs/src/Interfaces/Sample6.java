// Demo on abstract functions and abstract classes, also acts as an example for Runtime polymorphism

package Interfaces;

abstract class Emp{
	private int idno;
	private String name;
	Emp(int idno,String name)
	{
		this.idno = idno;
		this.name = name;
	}
	
	void print()
	{
		System.out.println(idno+", "+name);
	}
	
	abstract double earning();        // --------> abstract unimplemented method. it should be implemented in derived classes.
}

class Boss extends Emp				// -----> if a class extends the abstract class and not implements the abstract method then
{									//        the extended class should be abstract.
	private double weeklySalary;
	Boss(int idno,String name,double weeklySalary)
	{
		super(idno,name);
		this.weeklySalary = weeklySalary;
	}
	
	void print()
	{
		super.print();
		System.out.println(weeklySalary);
	}
	
	double earning()					// -----> abstract method implemented
	{
		return weeklySalary;
	}
	
	
}

class CommWorker extends Emp
{
	private double monthlySalary,ets;
	private int quantity;
	
	CommWorker(int idno,String name, double monthlySalary,double ets, int quantity)
	{
		super(idno,name);
		this.monthlySalary = monthlySalary;
		this.ets =ets;
		this.quantity = quantity;
	}
	
	void print()
	{
		super.print();
		System.out.println(monthlySalary+", "+ets+", "+quantity);
	}
	

	@Override
	double earning() {
		
		return monthlySalary+ets*quantity;
		
	}


}

public class Sample6 {
	
	static void fun(Emp bref) 			//up casting
	{
		if(bref instanceof Boss)
			System.out.println("Boss's details are: ");
		else
			System.out.println("CommWorker's details are: ");
		bref.print();
		System.out.println("Earning: "+bref.earning()+"\n");
	}

	public static void main(String[] args) {
		
		Boss b = new Boss(11, "Gavaskar", 10000.0);
		CommWorker  c = new CommWorker(12, " Kapil Dev", 20000.0, 1000.0, 5);
		fun(b);
		fun(c);
				
		
		
	}

}
