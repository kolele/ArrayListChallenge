package com.kole;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        MobilePhone.addContact("sale",123456);
        MobilePhone.addContact("kole",123456);
        MobilePhone.addContact("konjina", 98547);
        MobilePhone.printContacts();
        System.out.println("*********************************************");
        boolean test = MobilePhone.checkIfExists("somina");
        System.out.println(test);
    }
}
