package day22.Threads;

public class MyFirstThread implements Runnable{

	@Override
	public void run() {
		for(int i = 10; i>=0; i--){
			try {
				System.out.println("The Value of i is : "+i);
				Thread.sleep(2000);
//				System.out.println("Iam running sfter two second");
//				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
