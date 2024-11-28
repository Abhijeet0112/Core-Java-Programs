package day23.multithreading;

public class MyThread3 extends Thread{
	@Override
	public void run() {
		try {
			for(int i = 1 ; i<=10 ; i++) {
				Thread.sleep(1000);
				System.out.println("The vvalue of i from MyThread3 is : "+i);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
