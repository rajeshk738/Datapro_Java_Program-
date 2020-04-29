// solution to Producer1/Consumer1 problem [ wait(), notify() ]


package Multi_Threading;

class Shared4{
	int n;
	boolean available = false;
	
	synchronized void get()
	{
		if(!available)
		{
			try {
				wait();
			}
			catch(InterruptedException e) {
				
			}
		}
		System.out.println("Got: "+n);
		available = false;
		notify();
	}
	
	synchronized void put(int n)
	{
		if(available)
		{
			try {
				wait();
			}
			catch(InterruptedException e) {
				
			}
		}
		
		this.n = n;
		System.out.println("Put: "+n);
		available = true;
		notify();
	}
}

class Producer1 implements Runnable{
	
	Shared4 s;
	Thread th;
	
	Producer1(Shared4 s)
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

class Consumer1 implements Runnable{
	
	Shared4 s;
	Thread th;
	
	Consumer1(Shared4 s){
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

public class Sample13 {

	public static void main(String[] args) {
		
		Shared4 s = new Shared4();
		Producer1 p = new Producer1(s);
		Consumer1 c = new Consumer1(s);
		System.out.println("Press Ctrl+c to stop the program");

	}

}
