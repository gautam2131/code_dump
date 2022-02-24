package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner getu=new Scanner(System.in);
        System.out.println("enter your year of birth");
        int yearOfBirth=getu.nextInt();
        int age=2020-yearOfBirth;
          getu.nextLine();
        System.out.println("Type your name ");
        String name=getu.nextLine();

        System.out.println("Your name is " + name +" and your age is "  +age );

    }
}
