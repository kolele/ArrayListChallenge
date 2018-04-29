package com.kole;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MobilePhone.addContact("sale",123456);
        MobilePhone.addContact("kole",123456);
        MobilePhone.addContact("konjina", 98547);
        MobilePhone.addContact("lebac", 95403);
        MobilePhone.printContacts();
        System.out.println("*********************************************");
        int kobas = MobilePhone.getPosition("lebac");
        System.out.println(kobas);
    }
}
