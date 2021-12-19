package com.dg._01thread;

public class RunThread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        // 多次执行start方法，会出现异常Exception in thread "main" java.lang.IllegalThreadStateException
//        myThread.start();
        System.out.println("运行结束！");
    }
}
