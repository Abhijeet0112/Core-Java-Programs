package day23.multithreading;

public class MainForDemon {

	public static void main(String[] args) {
		Thread5 t1 = new Thread5();
		Thread5 t2 = new Thread5();
		Thread5 t3 = new Thread5();
		Thread5 t4 = new Thread5();
		Thread5 t5 = new Thread5();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
