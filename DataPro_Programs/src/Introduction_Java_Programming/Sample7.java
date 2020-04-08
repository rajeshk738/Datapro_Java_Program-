//Dealing with fields, strings

package Introduction_Java_Programming;

class Student{
	int idno;
	String name,course;
	double fee;
	
	void putData(int n,String na, String c, double f)
	{
		idno = n;
		name =na;
		course = c;
		fee =f;
		
	}
	
	void printData()
	{
		System.out.println(idno+","+name+","+course+","+fee);
	}
}




public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.putData(11, "kohli", ".Net",6500);
		s.printData();
		System.out.println(s.idno+","+s.name+","+s.course+","+s.fee);
		
	}

}
