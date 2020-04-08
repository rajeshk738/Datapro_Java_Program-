//private fields, setters and getters


package Introduction_Java_Programming;

class Student1 {
	private int idno;
	private String name,course;
	private double fee;
	
	void putData(int n,String na,String c,double f)
	{
		idno =n;
		name =na;
		course =c;
		fee =f;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	String getName()
	{
		return name;
	}
	
	void setCourse(String course)
	{
		this.course = course;
	}
	
	String getCourse()
	{
		return course;
	}
	
	void setFee(double fee)
	{
		this.fee = fee;
	}
	
	double getFee()
	{
		return fee;
	}
	void printData()
	{
		System.out.println(idno+","+name+","+course+","+fee);
	}
}



public class Sample8 {

	public static void main(String[] args) {
		
		Student1 s = new Student1();
		s.putData(11, "kohli", ".Net",6500);
		s.printData();
		s.setName("Virat Kohli");
		s.printData();
		s.setFee(8000.0);
		System.out.println("Fee: "+s.getFee());
		
	}

}
