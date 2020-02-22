package cog.cts.twentytwo;

public class ThreadDemoPriority {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);//8
		// here we have Only 1 thread(main)
		ThreadOneSecond threadOne= new ThreadOneSecond(); // New Born State
		ThreadTwoSecond threadTwo= new ThreadTwoSecond(); 
		Thread t1 = new Thread(threadOne);
		Thread t2 = new Thread(threadTwo);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY+2);

		t1.start();// Ready state 
		 t2.start();
		 
			System.out.println(Thread.currentThread().getPriority());
			System.out.println("Thread-1 Priority:" +t1.getPriority());
			System.out.println("Thread-2 Priority:" +t2.getPriority());
	}
}
