package com.company;

public class Main {

    public static void main(String[] args) {
//	 OuterClass  outer = new OuterClass();
//	 outer.printMethod();
//        OuterClass.InnerClass inner = outer.new InnerClass();
//        inner.demoMethod();

        OuterClass.InnerClass inner = new OuterClass().new InnerClass();

        inner.demoMethod();
        inner.getOuter().printMethod();
        inner.getOuter().setOuterClassVariable("car");
        System.out.println(inner.getOuter().getOuterClassVariable());

    }
}



