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

    public boolean queryContact(String name){
        if (name != null){
            System.out.println("Contact with name" + name + "already exists!");
            return true;
        } else return false;
    }



}
