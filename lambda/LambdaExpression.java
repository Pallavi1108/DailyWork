package cog.cts.twentsix.lambda;

public class LambdaExpression {
	public static void main(String[] args) {
//		MyThread t = new MyThread();
//		Thread thread = new Thread(t);
//		thread.start();
	
//	Runnable r = () -> System.out.println("Hello Runnable");
//	Thread t = new Thread(r);
//	t.start();
//	
			

// class MyThread implements Runnable {
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		System.out.println("Hello Runnable");
		Hello h=() -> "Good Morning";
		System.out.println(h.greetings());
		Hello h1=() -> "Good Evening";
		System.out.println(h1.greetings());
		Hello h2=() -> "Good Night";
		System.out.println(h2.greetings());
		
	}

}
@FunctionalInterface   //to make sure it has only one method
 interface Hello
 {
	 String greetings();
	 //public void display();
	 
 }
