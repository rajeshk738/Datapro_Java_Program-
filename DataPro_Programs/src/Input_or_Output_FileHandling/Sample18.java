// printing an object directly

package Input_or_Output_FileHandling;

import java.io.Serializable;

class Student implements Serializable{
	private int idno;
	private String sna,course;
	private double fee;
	
	Student(int idno, String sna, String course, double fee)
	{
		this.idno = idno;
		this.sna = sna;
		this.course = course;
		this.fee = fee;
		
	}
	
	public String toString()
	{
		return(idno+","+sna+","+course+","+fee);
	}  
}

public class Sample18 {

	public static void main(String[] args) {
	
		int n=10;;
		Student s = new Student(11, "Anna Hazare", "JSE", 5000.0);
		System.out.println(s); //s.toString();

	}

}
