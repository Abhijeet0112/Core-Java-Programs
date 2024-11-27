package day22.Threads;
public class MainClassforTh1AndTh2 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		System.out.println("Name of MyThread1 : "+t1.getName());
		System.out.println("Name of MyThread2 : "+t2.getName());
		
		t1.start();
		t2.start();
	}

}
