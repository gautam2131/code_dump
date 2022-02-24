package com.company;

public class Main {

    public static void main(String[] args) {
//        EnhancedPlayer player =new EnhancedPlayer("end",200,"sword");
//        System.out.println("Intial health is "+player.getHealth());
         Printer hp = new Printer(100,false);
         hp.print(50);
        System.out.println(hp.getPagesPrinted());
        System.out.println(hp.getTonerLevel());
    }
}
