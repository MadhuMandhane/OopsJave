package com.valuemomentum.training.concurrancy;

public class ThreadRunExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t1 = new Thread (new HeavyWorkRunnable(),"t1");
Thread t2 = new Thread (new HeavyWorkRunnable(),"t2");
System.out.println("Starting Runnable threads");
t1.start();//invoke run method
t2.start();
System.out.println("Runnable thread has been started");
Thread t3 = new MyThread ("t3");
Thread t4 = new MyThread ("t4");
System.out.println("Starting MyThreads");
t3.start();
t4.start();
System.out.println("My Threads has been started");
	}

}
