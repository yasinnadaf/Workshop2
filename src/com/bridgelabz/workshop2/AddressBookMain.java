package com.bridgelabz.workshop2;

import java.util.HashMap;
import java.util.*;

public class AddressBookMain {
    static String currentAddressBook;
    static String addressBookName;
    static HashMap<String, AddressBook> addressBookMap = new HashMap<>();
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit){
            System.out.println("Enter options:\n1) To add contact\n2) To edit Contact\n3) To search name\n4) To add address book or select addressBook\n5) To exit");
            int option = scr.nextInt();
            switch (option) {
                case 1:
                    try {
                        addressBookMap.get(currentAddressBook).addContact();
                    } catch (Exception e){
                        System.out.println("\nNo AddressBook Found\n");

                    }
                    break;
                case 2:
                    try {
                        addressBookMap.get(currentAddressBook).editContact();
                    } catch (Exception e){
                        System.out.println("\nNo AddressBook Found\n");
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        addressBookMap.get(currentAddressBook).searchName();
                    } catch (Exception e){
                        System.out.println("\nNo AddressBook Found\n");
                    }
                    break;
                case 4:
                    chooseAddressBook();
                    break;
                case 5:
                    exit = true;
                default:
                    break;
            }
        } System.out.println(addressBookMap);

    }
        static void chooseAddressBook () {
            System.out.println("""
                    Press 1 to add AddressBook
                    Press 2 to select AddressBook""");

            int option = scr.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter address book name");
                    addressBookName = scr.next().toLowerCase();
                    if (addressBookMap.containsKey(addressBookName)) {
                        System.out.println("\nAddress book already exist\n");
                        chooseAddressBook();
                    } else {
                        AddressBook addressBook = new AddressBook();
                        addressBookMap.put(addressBookName, addressBook);
                        currentAddressBook = addressBookName;
                    }

                    break;
                case 2:
                    System.out.println("Enter address book name");
                    addressBookName = scr.next().toLowerCase();
                    if (!addressBookMap.containsKey(addressBookName)) {
                        System.out.println("\nAddressBook not Found\n");
                        chooseAddressBook();
                    } else
                        currentAddressBook = addressBookName;
                    break;
                default:
                    break;
            }

        }
}
