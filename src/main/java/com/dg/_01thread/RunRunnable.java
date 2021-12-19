package com.dg._01thread;

public class RunRunnable {

    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
