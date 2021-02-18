package com.valuemomentum.training.concurrancy;
import java.lang.*;
public class MyThread extends Thread{

 

    public MyThread(String string) {
		// TODO Auto-generated constructor stub
	}
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
        // TODO Auto-generated method stub
MyThread Objex = new MyThread();
Objex.create();
System.out.println("This is the main thread");
    }
public void create()
{
    Thread Objth = new Thread(this);
    Objth.start();
}
public void run()
{
    while(true)
    {
        try
        {
            System.out.println("This is the child thread ");
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            
        }
    }
}
}