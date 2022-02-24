package com.company;

public class MultiThreading {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            MyThread myThread = new MyThread(i);
            Thread t1 = new Thread(myThread);
            t1.start();
            t1.interrupt();
            t1.start();


        }
    }
}
