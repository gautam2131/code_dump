package com.company;

public class Main {

    public static void main(String[] args) {
         printYearsAndDays(52560000);

    }
//    public static String printYearsAndDaysCalculator(long min){
//        if (min<0){
//            return "Invalid Value";
//        }
//        long hour=min/60;
//        long days=hour/24;
//        long remainingDays=hour%24;
//        long years=days/365;
//
//        System.out.println(min + " min =" + years + " y and "+ remainingDays + " d");
//        return min + " min =" + years + " y and "+ remainingDays + " d";
//    }
public static void printYearsAndDays(long min){
    if (min<0){
        System.out.println("Invalid Value");
    }else{
       long years=min/525600;
       long days= (min % 525600) / 1440;
        System.out.println(min + " min =" + years + " y and "+ days + " d");
    }
}

}
