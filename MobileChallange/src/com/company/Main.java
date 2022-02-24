package com.company;

import java.util.Scanner;

public class Main {
        private static Scanner scanner = new Scanner(System.in);
        private static MobilePhone mobilephone = new MobilePhone("9894771798");
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action: ( 6 to show avilable actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Phone is shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilephone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;


            }

        }

    }
    private static void addNewContact(){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number ");
        String phNo = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phNo);
        if(mobilephone.addNewContact(newContact)){
            System.out.println("contact is added");
        }
    }
    private static void updateContact(){
        System.out.println("Enter old contact name: ");
        String name = scanner.nextLine();
        Contact oldContact = mobilephone.queryContact(name);
        if (oldContact == null){
            System.out.println("contact not found" );
            return;
        }
        System.out.println("Enter name");
        String newName = scanner.nextLine();
        System.out.println("Enter phone number ");
        String newPhNo = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newPhNo);

       if(mobilephone.updateContact(oldContact,newContact)) {
           System.out.println("success");
       }else{
           System.out.println("Error updating record");
       }

    }

    private static void removeContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact contact = mobilephone.queryContact(name);
        if (contact == null){
            System.out.println("contact not found" );
            return;
        }
        mobilephone.removeContact(contact);
    }

    public static void queryContact(){
        System.out.println("Enter contact name");
        String name = scanner.nextLine();
        Contact contact = mobilephone.queryContact(name);
        if (contact == null){
            System.out.println("no contact found");
            return;
        }
        System.out.println("Name : "+ contact.getName()+ " phone number is " + contact.getPhoneNumber());
        mobilephone.queryContact(name);
    }
    private static void startPhone(){
        System.out.println("Phone is starting.....");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n"+
                           "1  - to print contacts\n" +
                "2  - to add a new contact\n"+
                "3  - to update  an existing contact\n"+
                "4  - to remove an existing contact\n"+
                "5  - to query if an existing contact exists\n"+
                "6  - to print a list of available actions.");
        System.out.println("Choose your action");

    }
}
