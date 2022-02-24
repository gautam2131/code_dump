package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean updateContact(Contact oldContact , Contact newContact){
        int position =findContact(oldContact);
        if(position<0){
            System.out.println(oldContact.getName() +" was not found");
            return false;
        }else if (findContact(newContact.getName()) >=0 ) {
            System.out.println("contact with name "+ newContact.getName()+" already exists. update was not successful.");
            return false;
        }
            this.myContacts.set(position,newContact);
             System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
            return true;
    }
    public boolean removeContact(Contact contact){
        int position =findContact(contact);
        if(position<0){
            System.out.println(contact.getName() +" was not found");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println("contact was successfully removed");
        return true;
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String name){
        for(int i = 0; i<this.myContacts.size();i++){
           Contact contact = this.myContacts.get(i);
           if(contact.getName().equals(name)){
               return i;
           }
        }
        return -1;
    }

    public Contact queryContact(String contactName){
        int position = findContact(contactName);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("contact list");
        for(int i = 0 ; i<this.myContacts.size();i++){
            System.out.println((i+1)+". "+this.myContacts.get(i).getName()+" -> "+this.myContacts.get(i).getPhoneNumber());

        }
    }


}
