package functionalInterfaces;

public class RunnableMyDemo implements Runnable {
	
	private Thread t;
	private String threadName;
	
	public RunnableMyDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating therad: " + threadName);
	}
	
	public void run() {
		System.out.println("Running: " + threadName);
		
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread: " + threadName + " interrupted");
		}
		System.out.println("Thread " + threadName + " exiting");
		
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}	
	}
	
	

}
