package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//        if (hourOfDay < 0 && hourOfDay > 23) {
//            return false;
//        } else if (!barking) {
//            return false;
//        } else if (barking && hourOfDay < 8) {
//            return true;
//        } else if (barking && hourOfDay > 22) {
//            return true;
//        } else {
//            return false;
//        }


//        if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
//            return false;
//        }
//        return true;
//



        if(barking) {
            if (hourOfDay < 8 && hourOfDay >= 0) {
                return true;
            }
            else if (hourOfDay > 22 && hourOfDay <= 23) {
                return true;
            }
        }
        return false;

    }



}

