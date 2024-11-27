package day23.multithreading;

public class Thread5 extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("This Daemon Thread...");
		}else {
			System.out.println("This is user Thread");
		}
	}
}
