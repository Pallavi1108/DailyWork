package cog.cts.twentytwo;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t); //[main, s,main]
		System.out.println(t.getName()); //main
		t.setName("Thread-1");
		System.out.println(t);//this method will change name of the thread
		System.out.println(t.getPriority()); //5
		System.out.println("Is Daemon? :" + t.isDaemon());
		System.out.println("Is Alive:" + t.isAlive());

	}

}
