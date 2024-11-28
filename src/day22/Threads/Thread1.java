package day22.Threads;

public class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("I am run() Thread1");
		try {
			Thread.sleep(null);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
