package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(Integer.MAX_VALUE));
    }
    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum=0;
int counter=0;

        while(number>0){
            counter++;
           int digit=number%10;
           sum +=digit;
           number /=10;
            System.out.println("i cam here"+ counter);

       }
       return  sum;
//        int sum = 0;
//
//        if(number < 10) {
//            return -1;
//        } else {
//            int x = 1;
//            while (true) {
//                sum += ((number/ x) % 10);
//                x *= 10;
//                System.out.println("i came here"+x);
//               if(x==0){
//                   break;
//               }
//            }
//            return sum;
//        }
    }
}
