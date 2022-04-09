package com.company;

public class Bbi {
    public static void main(String[] args){
        String[] inputArray= {"Gautam Balaji 57 67 87","tizi kutty 5 7 8","Rocky White 6 9 4"
        };
        String[] outputArray=new String[inputArray.length];
        int avg;
       String[] holder;

        for(int i=0;i<inputArray.length;i++){
            holder=inputArray[i].split("\\s+");
            avg = (Integer.parseInt(holder[2])+Integer.parseInt(holder[3])+Integer.parseInt(holder[4]))/3;
            outputArray[i]=holder[0]+" "+holder[1]+" "+Integer.toString(avg);
        }

        for(String i:outputArray){
            System.out.println(i);
        }
    }
}
