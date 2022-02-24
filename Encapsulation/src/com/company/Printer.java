package com.company;

public class Printer {
    private int tonerLevel;
    private boolean isItDuplex;
    private int pagesPrinted=0;
    public Printer( int tonerLevel,boolean isItDuplex){
        if(tonerLevel>=0 &&tonerLevel<=100){
            this.tonerLevel=tonerLevel;
        }
        this.isItDuplex=isItDuplex;
    }
    public void print(int print){
        pagesPrinted+=print;
        System.out.println("No of pages printed for this session is " +print);
        tonerLevel -=print;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void isEmpty(){
        if(tonerLevel==0){
            System.out.println("Printer is empty");
        }else{
            System.out.println("Toner Level is "+ tonerLevel);
        }
    }

}
