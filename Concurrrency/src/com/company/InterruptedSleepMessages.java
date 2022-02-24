package com.company;

public class InterruptedSleepMessages {
    public static void main(String[] args) {
        String[] importantInfo = {
                "Mare eats oats",
                "gautam likes tea",
                "mom likes coffee",
                "tizi likes chicken",
                "rocky likes bones"
        };
        for(int i =0; i<importantInfo.length;i++){
            //pausing for 4 secs.
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                return;
            }
            //print
            Thread.interrupted();
            System.out.println(i + " -> " + importantInfo[i]);

        }
    }
}
