package cog.cts.twentytwo;

public class ThreadOneResource implements Runnable {
	
	Resource resource;
	
	public ThreadOneResource(Resource resource) {
		this.resource = resource;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		resource.display("Thread-1");
	}
	
}
