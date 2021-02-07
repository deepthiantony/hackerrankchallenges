package com.company;

public class ThreadLock implements Runnable {
    @Override
    public void run() {
        Lock();
    }

    public void Lock() {
        System.out.println(Thread.currentThread().getName());
        synchronized (ThreadLock.class) {
//            synchronized (this) {
            System.out.println("in block "
                    + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("in block " +
                    Thread.currentThread().getName() + " end");
        }
    }

    public static void main(String[] args) {
        ThreadLock tl = new ThreadLock();
        ThreadLock tl2 = new ThreadLock();
        Thread t1 = new Thread(tl);
        Thread t2 = new Thread(tl2);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();

    }
}
