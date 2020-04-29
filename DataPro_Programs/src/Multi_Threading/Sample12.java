// Demo on Producer/Consumer problem

package Multi_Threading;

class Shared3{
	int n;
	synchronized void get()
	{
		System.out.println("Got: "+n);
	}
	
	synchronized void put(int n)
	{
		this.n = n;
		System.out.println("Put: "+n);
	}
}

class Producer implements Runnable{
	
	Shared3 s;
	Thread th;
	
	Producer(Shared3 s)
	{
		this.s = s;
		th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		int i=0;
		
		while(true)
		{
			s.put(i++);
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		
	}
	
}

class Consumer implements Runnable{
	
	Shared3 s;
	Thread th;
	
	Consumer(Shared3 s){
		this.s = s;
		th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		
		while(true)
		{
		  s.get();
		  
		  try {
			  Thread.sleep(100);
		  }
		  catch(InterruptedException exp)
		  {
			  
		  }
		
		}
		
	}
	
}

public class Sample12 {

	public static void main(String[] args) {
		
		Shared3 s = new Shared3();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		System.out.println("Press Ctrl+c to stop the program");

	}

}
