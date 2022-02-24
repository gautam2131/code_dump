package com.company;

public class HelloThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello, I am from thread");
    }

    public static void main(String[] args) {

//        com.company.HelloThread t2 = new com.company.HelloThread();
//        Thread t1 = new Thread(t2);
//        t1.start();

       Thread k2 = new Thread(new HelloThread());
       k2.start();


    }

}
