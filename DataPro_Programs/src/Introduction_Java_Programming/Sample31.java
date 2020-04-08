// To demonstrate both usages of "super" keyword.

package Introduction_Java_Programming;

class Cricketer{
	private String name;
	private String teamName;
	Cricketer(String name, String teamName)
	{
		this.name = name;
		this.teamName = teamName;
	}
	
	void print()
	{
		System.out.println(name+","+teamName);
	}
	
}

class Batsman extends Cricketer
{
	private int noOfRuns;
	Batsman(String name,String teamName, int noOfRuns)
	{
		super(name,teamName);
		this.noOfRuns = noOfRuns;
		
	}
	
	void print() // ---> function overloading
	{
		super.print();
		System.out.println("No of Runs: "+noOfRuns);
	}
	
}

class Bowler extends Cricketer
{
	private  int noOfWickets;
	
	Bowler(String name, String teamName, int noOfWickets)
	{
		super(name, teamName);
		this.noOfWickets =noOfWickets;
		
	}
	void print()   // ----> function overloading
	{
		super.print();
		System.out.println("No of Wickets: "+ noOfWickets);
	}
	
	
}


public class Sample31 {
	public static void main(String[] args) {
		Batsman b1 = new Batsman("Virat Kohli", "India",68);
		b1.print();
		Bowler b2 = new Bowler("Amit Mishra","India", 4);
		b2.print();
		
	}

}
