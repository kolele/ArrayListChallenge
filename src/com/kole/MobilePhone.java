package com.kole;

import java.util.ArrayList;

public class MobilePhone extends Contacts {
    public static ArrayList<Contacts> contact = new ArrayList<Contacts>();

    public MobilePhone(String name, int phoneNumber, ArrayList<Contacts> contacts) {
        super(name, phoneNumber);
        this.contact = contacts;
    }

    public static void addContact(String name, int number) {
        boolean check = checkIfExists(name);
        if (!check) {
            Contacts contact = new Contacts(name, number);
            MobilePhone.contact.add(contact);
            System.out.println("Added contact named " + contact.getName() + " with number " + contact.getPhoneNumber());
        } else System.out.println("Cannot add contact as it is already present");


    }

    public static void printContacts() {
        System.out.println("There is total " + contact.size() + " contact(s) in your phone book");
        for (int i = 0; i < contact.size(); i++) {
            System.out.println("At position " + (i + 1) + " is contact named " + contact.get(i).getName() + " with phone number " + contact.get(i).getPhoneNumber());
        }
    }

    public static boolean checkIfExists(String name) {
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getName().contains(name)) {
                return true;
            }
        }
        return false;
    }

    public static int getPosition(String name) {
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getName().equals(name)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void updateContact(String name, int number) {
        boolean check = checkIfExists(name);
        int position = getPosition(name);

        if (!check) {
            System.out.println("Contact does not exist");
        } else {
            contact.get(position-1).setName(name);
            contact.get(position-1).setPhoneNumber(number);
        }


    }

    public static void removeContact(int position) {
        contact.remove(position - 1);
        System.out.println("Contact removed");
    }


}