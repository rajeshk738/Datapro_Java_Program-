// Ex2 on synchronization


package Multi_Threading;

class Shared1{
	
	synchronized void printElements()
	{
		for(int i=1;i<=4;i++)
			System.out.println(i+": "+Thread.currentThread().getName());
	}
}

class Caller1 extends Thread{
	
	Shared1 s;
	
	Caller1(Shared1 s)
	{
		this.s = s;
		start();
		
	
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		s.printElements();
	}
	
}
public class Sample11 {

	public static void main(String[] args) {
		
		Shared1 s = new Shared1();
		Caller1 obj1 = new Caller1(s);
		Caller1 obj2 = new Caller1(s);
		Caller1 obj3 = new Caller1(s);

	}

}
