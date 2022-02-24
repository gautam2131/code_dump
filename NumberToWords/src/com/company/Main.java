package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(reverse(0));
        numberToWords(0);

    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count =0;

       do{
           count++;
           number /=10;
       }while (number!=0);
       return count;
    }
    public static int reverse(int number){
        int reverse=0;
        while(number!=0){
            int a =number%10;
            reverse *=10;
            reverse +=a;
            number /=10;
        }
        return reverse;
    }
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        int reveresed= reverse(number);
        int digitCount=getDigitCount(number);
        int digitCount1=getDigitCount(reveresed);
        while(true){
            int a =reveresed%10;
            switch (a){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }
            reveresed /=10;
            if (reveresed==0){
                break;
            }

        }
        while (digitCount1!=digitCount){
            System.out.println("Zero");
            digitCount1++;
        }

    }
}
