package com.company;

public class SimpleThreads {

    public static void threadMessage(String message){

        System.out.println(Thread.currentThread().getName() + " : " + message);
    }

    public static class MessageLoop implements Runnable {

        @Override
        public void run() {
            String[] importantInfo = {
                    "Mare eats oats",
                    "gautam likes tea",
                    "mom likes coffee",
                    "tizi likes chicken",
                    "rocky likes bones"
            };
            for (int i = 0; i < importantInfo.length; i++) {
                //pausing for 4 secs.
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("I wasn't done here.");
                }
                threadMessage(importantInfo[i]);

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        threadMessage("Starting messageLoop thread");
        MessageLoop messageLoop = new MessageLoop();
        Thread thread = new Thread(messageLoop);
        thread.start();
        threadMessage("Waiting for MessageLoop thread to finish");
        int k = Integer.MAX_VALUE;

        while(thread.isAlive()){

            thread.join(1000);
            threadMessage("still waiting");
        }
        threadMessage("Finally done");

    }
}