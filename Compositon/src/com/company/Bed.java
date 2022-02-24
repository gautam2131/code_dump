package com.company;

public class Bed {
    private Sleep sleep;

    public Bed(Sleep sleep) {
        this.sleep = sleep;
    }

    public Sleep getSleep() {
        return sleep;
    }
    public void sleep(){
        sleep.restOrNot(true);
    }
    public void wakeUp(){
        sleep.restOrNot(false);
    }
}
