package com.company;

public class Room {
    public SwitchBoard switchBoard;
    public Bed bed;



    public Room(SwitchBoard switchBoard, Bed bed) {
        this.switchBoard = switchBoard;
        this.bed = bed;
    }

    public SwitchBoard getSwitchBoard() {
        return switchBoard;
    }

    public void sweety(){
        switchBoard.fanon();
    }
    public void cold(){
        switchBoard.fanoff();
    }
    public void  needLight(){
        switchBoard.lightson();
    }
    public void toobright(){
        switchBoard.lightsoff();
    }
    public void feelingtired(){
        bed.sleep();
    }
    public void gotWorkToDo(){
        bed.wakeUp();
    }
}
