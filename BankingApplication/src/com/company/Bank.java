package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName){
        this.name = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        if(findBranch(name)==null){
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }
    private Branch findBranch(String branchName){
        for(int i = 0; i< this.branches.size(); i++){
          Branch checkingBranch = this.branches.get(i);
            if(checkingBranch.getName().equals(branchName))
            {
                return checkingBranch;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName , String customerName , double initialAmount){
        Branch branch =  findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName , String customerName ,double amount){
        Branch branch = findBranch(branchName);
        if( branch != null){
            return branch.addCustomerTransaction( customerName , amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName , boolean showTransactions){

        Branch branch = findBranch(branchName);
        if( branch != null){
            System.out.println("Customer details for branch " + branch.getName() );

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for( int i =0; i< branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: "+ branchCustomer.getName()+"["+(i+1)+"]");
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j = 0; j< transactions.size(); j++){
                        System.out.println("["+(j+1)+"] Amount "+ transactions.get(j) ) ;
                    }
                }
            }
            return true;
        }
        else {
            return false;
        }

    }
}

