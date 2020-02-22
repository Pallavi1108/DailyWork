package cog.cts.twentytwo;

public class ThreadOne extends Thread {

	@Override
	public void run() {
	for (int i = 1; i<=10; i++) {
		if(i % 2!=0) {
	//	System.out.println("Thread 1: "+i);
		System.out.println("Thread-1: "+i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

	

}
