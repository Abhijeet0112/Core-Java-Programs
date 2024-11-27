package day22.Threads;

public class MySecondThread extends Thread{

	@Override
	public void run() {
		for (int i = 1; i<=10;i++) {
			try {
				System.out.println("The value of i in 2nd Thread"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
