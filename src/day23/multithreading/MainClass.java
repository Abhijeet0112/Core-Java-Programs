package day23.multithreading;

public class MainClass {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		System.out.println("Name of my thread1 : "+t1.getName());
		System.out.println("Name of my thread1 : "+t2.getName());

		
		t1.setName("My First Thired");
		t2.setName("My Second Thired");
		System.out.println("Name of my thread1 : "+t1.getName());
		System.out.println("Name of my thread1 : "+t2.getName());
		
		Thread mainThread = Thread.currentThread();
		System.out.println("Main thread name : "+ mainThread.getName());
		
		System.out.println("Priority of main Thread : "+ mainThread.getPriority());
		System.out.println("Priority of MyThread1 : "+ t1.getPriority());
		System.out.println("Priority of MyThread2 : "+ t2.getPriority());
		
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		
		t1.start();
		t2.start();
		
		System.out.println("Priority of main Thread : "+ mainThread.getPriority());
		System.out.println("Priority of MyThread1 : "+ t1.getPriority());
		System.out.println("Priority of MyThread2 : "+ t2.getPriority());
		
		
		System.out.println("ID of MyThread1 : "+ t1.getId());
		System.out.println("Id of MyThread2 : "+ t2.getId());
	}

}
