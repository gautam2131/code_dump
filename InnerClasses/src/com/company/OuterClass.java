package com.company;

class OuterClass {
    private String outerClassVariable = "Hello";
    public OuterClass(){
        System.out.println("outer class is created");
    }
    public void printMethod(){
        System.out.println("KaKa");
    }
    public OuterClass getCurrentInstance() {
        return this;
    }

    public void setOuterClassVariable(String outerClassVariable) {
        this.outerClassVariable = outerClassVariable;
    }

    public String getOuterClassVariable() {
        return outerClassVariable;
    }

    public class InnerClass{
        private String innerClassVariable = "I am in inner class";
        public InnerClass(){
            System.out.println("Inner class is created");
        }
        public void demoMethod(){
            System.out.println(outerClassVariable + " " + innerClassVariable);
        }
        public OuterClass getOuter() {
            return getCurrentInstance();
        }
    }

}
