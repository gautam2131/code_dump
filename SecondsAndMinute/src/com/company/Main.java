package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        getDurationString(6000);
        System.out.println(getDurationString(60000));

    }
    public static String getDurationString(int min, int sec){
        if ((min<0)||(sec<0)||(sec>59)){

            return "Invalid Value";
        }
        int hour=min/60;
        int reminingMin =min%60;
        return hour + " h " + reminingMin + " m " + sec+" s ";


    }
    public static String getDurationString(int sec){
        if (sec<0){
            return "invalid value";
        }
        int min=sec/60;
        int remainingSec=sec%60;
        System.out.println(min + "min" + remainingSec + "sec");

        return getDurationString(min,remainingSec);


    }


}
