package com.company;

public class Fan {
    private boolean isItOn;

    public Fan(boolean isItOn) {
        this.isItOn = isItOn;
    }

    public boolean getisItOn() {
        return isItOn;
    }

    public void fanswitch(boolean isItOn){

        if(isItOn) {
            System.out.println("fan is on");
        }
        else{
            System.out.println("fan is off");
        }
    }

}
