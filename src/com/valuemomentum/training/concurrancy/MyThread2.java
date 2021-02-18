package com.valuemomentum.training.concurrancy;

public class MyThread2 extends Thread {

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("MyThread2 - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread2 - END "+Thread.currentThread().getName());
    }

    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
    
}