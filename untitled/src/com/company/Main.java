package com.company;

import java.util.Calendar;
import java.util.Scanner;
class MyThread
{
    public static void main(String[] args)
    {
        //Here we are using Anonymous Inner class
        //that extends a class i.e. Here a Thread class
        Thread t = new Thread()
        {
            public void run()
            {
                System.out.println("Child Thread");
            }
        };
        t.start();
        System.out.println("Main Thread");
    }
}