package com.company;

import static com.company.ThreadColor.ANSI_RED;

public class AnotherThread extends Thread{
    private int num = 0;

    public AnotherThread(Runnable target) {

        target.run();
    }

    public AnotherThread() {
        super();
    }

    public AnotherThread(int num){
        this.num=num;
    }
    @Override
    public void run(){
        if(num==0){
            System.out.println( ANSI_RED+ "Hello from another thread." + currentThread().getName());
        }else{
            System.out.println( ANSI_RED+ "Hello from another thread "+ num +"  " + Thread.currentThread().getName());
        }


    }

}
