package day23.multithreading;

public class MyThread1 extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("I am run() method of MyThread1");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
