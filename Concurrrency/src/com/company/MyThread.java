package com.company;

public class MyThread implements Runnable{
    private int threadNumber;
    public MyThread(int threadNumber){
        this.threadNumber=threadNumber;
    }
    @Override
    public void run() {
        for(int i =0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println(i + " i am from "+ threadNumber);
        }
    }
}
