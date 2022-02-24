package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();

        for(int i =0; i<=10;i++){
            intList.add(Integer.valueOf(i));
        }

        for(int i= 0; i<=10;i++){
            System.out.println(i + " ----> " + intList.get(i).intValue());
        }
    }
}
