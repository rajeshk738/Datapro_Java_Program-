/* 
 * creating our own thread by implementing Runnable interface-just to 
 * understand importance of runnable target better.
 */

package Multi_Threading;

class Datapro2 implements Runnable{
	int n;
	Datapro2(int p)
	{
		n = p;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName()+", "+n);
		
	}
	
}
public class Sample7 {

	public static void main(String[] args) {
		
			Datapro2 d1 = new Datapro2(87);
			Datapro2 d2 = new Datapro2(23);
			
			Thread th1 = new Thread(d1);
			Thread th2 = new Thread(d2);
			
			th1.start();
			th2.start();
			
			for(int i=1;i<=5;i++)
				System.out.println(Thread.currentThread().getName());
	}

}
