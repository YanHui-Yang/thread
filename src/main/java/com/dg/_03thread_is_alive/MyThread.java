package com.dg._03thread_is_alive;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("run = " + this.isAlive());
    }
}
