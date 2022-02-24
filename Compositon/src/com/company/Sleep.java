package com.company;

public class Sleep {
    private boolean amITired;

    public Sleep(boolean amITired) {
        this.amITired = amITired;
    }

    public boolean isAmITired() {
        return amITired;
    }

    public void restOrNot(boolean amITired){
        if(amITired){
            System.out.println("gonna sleep");
        }else{
            System.out.println("lets work");
        }
    }
}
