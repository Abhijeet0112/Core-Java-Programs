package day22.Threads;

public class MyTimer extends Thread{
	@Override
	public void run() {
		for(int i =0;i<=60;i++) {
			if(i<=9) {
				System.out.println("00.0"+i);
			}else {
				System.out.println("00."+i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
