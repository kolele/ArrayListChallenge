package com.kole;

import java.util.ArrayList;

public class MobilePhone extends Contacts{
    public static ArrayList<Contacts> contact = new ArrayList<Contacts>();

    public MobilePhone(String name, int phoneNumber, ArrayList<Contacts> contacts) {
        super(name, phoneNumber);
        this.contact = contacts;
    }

    public static void addContact (String name, int number){
        Contacts contact = new Contacts(name,number);
        MobilePhone.contact.add(contact);
        System.out.println("Added contact named " + contact.getName() + " with number " + contact.getPhoneNumber());
    }

    public static void printContacts(){
        for (int i=0; i<contact.size();i++){
            System.out.println("There is " + contact.size() + " contact(s) in your phone book");
            System.out.println("At position " + i + " is contact named " + contact.get(i));
            System.out.println();
        }
    }


    public boolean queryContact(String name){
        if (name != null){
            System.out.println("Contact with name" + name + "already exists!");
            return true;
        } else return false;
    }



}
