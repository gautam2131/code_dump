package com.company;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phNo;

    public BankAccount(){
        this("2123",0,"default","default",232);
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber,int balance,String customerName, String email,int phNo){
        System.out.println("acc constructor with parameters");
        this.accountNumber=accountNumber;
        this.balance =balance;
        this.customerName=customerName;
        this.email=email;
        this.phNo=phNo;
    }

    public BankAccount(String customerName, String email, int phNo) {
        this("99999",100,customerName,email,phNo);
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public int getPhNo(){
        return this.phNo;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhNo(int phNo){
        this.phNo=phNo;
    }
    public void depositFunds(int funds ){
        this.balance=balance+funds;
        System.out.println("Your Balance = "+ balance);
    }
    public void withdrawFunds(int funds){
        if(funds>this.balance){
            System.out.println("insufficient funds");
        }else{
            this.balance=balance-funds;
            System.out.println("Your balance = " + balance);
        }
    }
}
