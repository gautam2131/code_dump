package com.company;

public class Main {

    public static void main(String[] args) {
	boolean value=isLeapYear(1924);
        System.out.println(value);
    }
    public static boolean isLeapYear(int year){
        if(year>=1&&year<=9999){
            if(year%4==0 && year%100!=0){
                return true;
            }
            else{
                return (year%100==0&&year%400==0);
            }
        }
        return false;

    }
}
