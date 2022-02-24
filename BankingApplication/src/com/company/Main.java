package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("State Bank Of India");
	    bank.addBranch("chennai");
	    bank.addCustomer("chennai", "gautam", 3000);
        bank.addCustomer("chennai", "tizi", 3000);
        bank.addCustomer("chennai", "rocky", 3000);


        bank.addBranch("bangalore");
        bank.addCustomer("bangalore", "gautam ", 300);
        bank.addCustomer("bangalore", "gautam", 2000);
        bank.addCustomer("bangalore", "rockyop", 30);


        bank.addCustomerTransaction("chennai", "gautam", 300);
        bank.addCustomerTransaction("chennai", "tizi", 8000);
        bank.addCustomerTransaction("chennai", "rocky", 30);

        bank.listCustomers("chennai",true);


        if(!bank.addCustomer("chennai","gautam",3000))
        {
            System.out.println("customer already exists");
        }
    }
}
