package day23.multithreading;

public class JoinMainClass {

	public static void main(String[] args) {
		MyThread3 t1 = new MyThread3();
		MyThread4 t2 = new MyThread4();
		try {
			t1.start();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
