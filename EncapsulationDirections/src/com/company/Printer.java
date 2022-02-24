package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel =tonerLevel>-1&&tonerLevel<=100?tonerLevel:-1;
        this.duplex = duplex;
        this.pagesPrinted=0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0&&tonerAmount<=100){
            if(tonerLevel+tonerAmount>100){
                return -1;
            }else{
                return tonerLevel +=tonerAmount;
            }
        }
        return -1;
    }
    public int printPages(int pages){
        int pagesToPrint=0;
        if(duplex){
            pagesToPrint=pages/2+pages%2;
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
        pagesPrinted+= pagesToPrint;
        pagesToPrint=pages;
        return pagesToPrint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
