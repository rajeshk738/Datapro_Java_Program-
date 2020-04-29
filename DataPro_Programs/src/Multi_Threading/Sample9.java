// Demo on isAlive() and join()

package Multi_Threading;

class Datapro4 implements Runnable{
	Thread th;
	
	Datapro4(){
		
		th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());
		
	}
}
public class Sample9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("First line");
		
		Datapro4 obj1 = new Datapro4();
		Datapro4 obj2 = new Datapro4();
		Datapro4 obj3 = new Datapro4();
		
		System.out.println(obj1.th.getName()+" is alive: "+obj1.th.isAlive());
		System.out.println(obj2.th.getName()+" is alive: "+obj2.th.isAlive());
		System.out.println(obj3.th.getName()+" is alive: "+obj3.th.isAlive());
		
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());
		
		obj1.th.join();
		obj2.th.join();
		obj3.th.join();
		
		System.out.println(obj1.th.getName()+ " is alive: "+obj1.th.isAlive());
		System.out.println(obj2.th.getName()+" is alive: "+obj2.th.isAlive());
		System.out.println(obj3.th.getName()+" is alive: "+obj3.th.isAlive());
		System.out.println("Last line");
		
	}

}
