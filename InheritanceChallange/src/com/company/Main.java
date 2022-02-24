package com.company;

public class Main{

    public static void main(String[] args) {
	 Suv suv=new Suv("left",true, 771,"diesel",60,6);
        System.out.println(suv.getType());
        System.out.println(suv.getSeatCount());
        System.out.println(suv.getModel());
        System.out.println(suv.getWheels());
    }
}
