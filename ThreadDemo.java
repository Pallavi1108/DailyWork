package cog.cts.twentytwo;

public class ThreadDemo {
	public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	// here we have Only 1 thread(main)
	ThreadOne threadOne= new ThreadOne(); // New Born State
	ThreadTwo threadTwo= new ThreadTwo(); 
	 threadOne.start();// Ready state 
	 threadTwo.start();
	for(int i = 1; i<=5; i++)
	{
		System.out.println(Thread.currentThread().getName()+ ":"+i);
	}
	}
}
