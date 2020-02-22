package cog.cts.twentytwo;

public class ThreadDemoSecond {
	public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	// here we have Only 1 thread(main)
	ThreadOneSecond threadOne= new ThreadOneSecond(); // New Born State
	ThreadTwoSecond threadTwo= new ThreadTwoSecond(); 
	Thread t1 = new Thread(threadOne);
	Thread t2 = new Thread(threadTwo);
	t1.start();// Ready state 
	 t2.start();
}
}