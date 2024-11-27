package day22.Threads;

public class Thread2 extends Thread{
	@Override
	public void run() {
		System.out.println("I run() method of Thread2");
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
