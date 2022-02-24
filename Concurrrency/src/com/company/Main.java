package com.company;

import static com.company.ThreadColor.*;

public class Main {
    public static void main(String[] args){
        System.out.println(ANSI_PURPLE+"I am from main thread " + Thread.currentThread().getName());
        Thread t1 = new AnotherThread();
        t1.start();
        new AnotherThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_BLUE+"I am from anotherThread with runnable cons " + Thread.currentThread().getName());
            }
        });

        Thread t5 = new AnotherThread(1);
        t5.start();

        new Thread(()-> System.out.println(ANSI_GREEN+"I am from t2 "
                + Thread.currentThread().getName())).start();
        new Thread (){
            @Override
            public void run() {
                System.out.println(ANSI_CYAN+"I am from t2 overrode method. "+ Thread.currentThread().getName());
            }
        }.start();

        System.out.println(ANSI_PURPLE+"Second print from the main thread "+ Thread.currentThread().getName());

    }
}
