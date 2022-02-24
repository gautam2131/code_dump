package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
    }
    public static boolean canPack(int bigCount, int smallCount , int goal   ) {


//        int bcKgs=5*bigCount;
//        if(bigCount<0||smallCount<0||goal<0){
//            return false;
//        }
//
//        if(goal<=bcKgs+smallCount){
//            if(goal>=bcKgs){
//                return true;
//            }
//        }
//        return false;
//
//    }
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount * 5 + smallCount < goal) return false;
        return ((goal % 5) <= smallCount);


    }
}
