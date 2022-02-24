package com.company;

public class SleepMessages {
    public static void main(String[] args) throws InterruptedException{
      String[] importantInfo = {
              "Mare eats oats",
              "gautam likes tea",
              "mom likes coffee",
              "tizi likes chicken",
              "rocky likes bones"
      };
      for(int i =0; i<importantInfo.length;i++){
          //pausing for 4 secs.
          Thread.sleep(4000);
          //print
          System.out.println(i + " -> " + importantInfo[i]);

      }

    }
}
