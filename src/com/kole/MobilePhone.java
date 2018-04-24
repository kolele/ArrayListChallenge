package com.kole;

import java.util.ArrayList;

public class MobilePhone extends Contacts{
    public static ArrayList<Contacts>contacts = new ArrayList<Contacts>();

    public MobilePhone(String name, int phoneNumber, ArrayList<Contacts> contacts) {
        super(name, phoneNumber);
        this.contacts = contacts;
    }

    public static void createContact (String contactID, String name, int number){
        Contacts contact = new Contacts(name,number);
        contacts.add(contact);
        for (int i=0;i<contacts.size();i++){
            System.out.println(contacts.get(i));
        }
    }


}
