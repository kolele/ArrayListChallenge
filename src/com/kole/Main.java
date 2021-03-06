package com.kole;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        MobilePhone.addContact("sale",123456);
//        MobilePhone.addContact("kole",123456);
//        MobilePhone.addContact("konjina", 98547);
//        MobilePhone.addContact("lebac", 95403);
//        MobilePhone.printContacts();
//        System.out.println("*********************************************");
//        int kobas = MobilePhone.getPosition("lebac");
//        System.out.println(kobas);
//        System.out.println("*********************************************");
//        MobilePhone.removeContact(4);
//        MobilePhone.printContacts();
//        System.out.println("*********************************************");
//        MobilePhone.updateContact("kole",3713199);
//        MobilePhone.printContacts();
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    MobilePhone.printContacts();
                    break;
                case 2:
                    MobilePhone.addContact(scanner.nextLine(),scanner.nextInt());
                    break;
                case 3:
                    MobilePhone.updateContact(scanner.nextLine(), scanner.nextInt());
                    break;
                case 4:
                    MobilePhone.removeContact(scanner.nextInt());
                    break;
                case 5:
                    quit=true;
                    break;
            }
        }


    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts");
        System.out.println("\t 2 - To add new contact");
        System.out.println("\t 3 - To update contact");
        System.out.println("\t 4 - To remove contact");
        System.out.println("\t 5 - To quit application");
    }
}
