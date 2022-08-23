package com.bridgelabz.workshop2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contacts> contactList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    void addContact(){
        Contacts contact = new Contacts();
        System.out.println("Enter name: ");
        contact.setName(scanner.next());
        System.out.println("Enter age: ");
        contact.setAge(scanner.next());
        System.out.println("Enter city: ");
        contact.setCity(scanner.next());
        System.out.println("Enter state: ");
        contact.setState(scanner.next());
        System.out.println("Enter Phone number");
        contact.setPhoneNumber(scanner.nextLong());

        contactList.add(contact);

    }

}
