package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int number){
            int reverse=0;

            int a =number;
            while(true){


                int lastDigit=number%10;
                reverse*=10;
                reverse +=lastDigit;
                number /=10;
//            System.out.println("1");
                if(number==0){
//                System.out.println("2");
                    break;
                }

            }
            return reverse==a;
    }
    }
