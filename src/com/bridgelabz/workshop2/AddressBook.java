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

    void editContact(){
        System.out.println("Enter the name of person to edit");
        String name = scanner.next();
        for(Contacts contact : contactList){
            if(name.equals(contact.getName())){
                System.out.println("Edit the details of person: ");

                System.out.println("edit name");
                contact.setName(scanner.next());
                System.out.println("Enter age: ");
                contact.setAge(scanner.next());
                System.out.println("Enter city: ");
                contact.setCity(scanner.next());
                System.out.println("Enter state: ");
                contact.setState(scanner.next());
                System.out.println("Enter Phone number");
                contact.setPhoneNumber(scanner.nextLong());
            }
        }
    }
    void searchName(){
        System.out.println("enter the name of person you want to search: ");
        String name = scanner.next();
        for(Contacts search : contactList){
            if(name.equals(search.getName())){
                System.out.println(search);
            }
        }
    }

    void displayContacts(ArrayList<Contacts> contactList){
        for(Contacts contact : this.contactList){
            System.out.println(contact.toString());
        }
    }

}
