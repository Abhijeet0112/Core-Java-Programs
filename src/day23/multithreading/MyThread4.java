package day23.multithreading;

public class MyThread4 extends Thread{
	@Override
	public void run() {
		try {
			for(int i = 10 ; i>=1 ; i--) {
				Thread.sleep(1500);
				System.out.println("The vvalue of i from MyThread4 is : "+i);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
