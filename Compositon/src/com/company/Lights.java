package com.company;

public class Lights {
    private boolean isItOn;

    public Lights(boolean isItOn){
        this.isItOn=isItOn;
    }

    public boolean getisItOn() {
        return isItOn;
    }

    public void lightsswitch(boolean isItOn){
        if (isItOn) {
            System.out.println("light is on ");
        }
        else {
            System.out.println("light is off");
        }
    }
}
