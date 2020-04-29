// creating our own thread by extending the Thread class


package Multi_Threading;

class Datapro3 extends Thread{
	Datapro3()
	{
		start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());
	}

}
public class Sample8 {

	public static void main(String[] args) {
		Datapro3 d = new Datapro3();
		
		for(int i =1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());
	}

}
