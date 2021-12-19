package com.dg._02thread_unsaft;

public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        // 设置线程名称
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由" + Thread.currentThread().getName() + " 计算，count = " + count);
        }
    }
}
