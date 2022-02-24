package com.company;

public class Main {

    public static void main(String[] args) {
//        BankAccount bankAccount= new BankAccount();//("12345",0,"MGR","mgr@gamil.com",9897);
//        bankAccount.depositFunds(0);
//        bankAccount.withdrawFunds(0);
//        System.out.println(bankAccount.getAccountNumber());
//        System.out.println(bankAccount.getBalance());
//        System.out.println(bankAccount.getCustomerName());
//        System.out.println(bankAccount.getEmail());
//        System.out.println(bankAccount.getPhNo());

        VipCustomer vip1= new VipCustomer("Gautam",1000,"gautam@gamil.com");
        System.out.println(vip1.getCreditLimit());
        System.out.println( vip1.getName());
        System.out.println(vip1.getEmail());

        VipCustomer vip2=new VipCustomer();
        System.out.println(vip2.getName());

        VipCustomer vip3=new VipCustomer("tinka",6000);
        System.out.println(vip3.getEmail());



    }
}
