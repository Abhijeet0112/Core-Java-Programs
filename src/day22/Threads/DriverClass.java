package day22.Threads;

public class DriverClass {

	public static void main(String[] args) {
		MyFirstThread t1 = new MyFirstThread();
		t1.run();
		//Start Thread
		Thread tr = new Thread(t1);
		tr.start();
		
		MySecondThread t2 = new MySecondThread();
		MySecondThread t3 = new MySecondThread();
		t2.start();
		t3.start();
	}

}
