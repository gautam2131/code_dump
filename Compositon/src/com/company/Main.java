package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Sleep sleep =new Sleep(true);
        Bed bed =new Bed(sleep);
        SwitchBoard switchBoard=new SwitchBoard(new Fan(true),new Lights(true));
	      Room myroom =new Room(switchBoard,bed );
	      myroom.toobright();
	      myroom.feelingtired();

    }
}
