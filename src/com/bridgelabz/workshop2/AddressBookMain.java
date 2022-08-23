package com.bridgelabz.workshop2;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    static final String MY_ADDRESSBOOK = "my address book";

    public static void main(String[] args) {

        HashMap<String, AddressBook> addressBookMap = new HashMap<>();
        AddressBook myAddressBook = new AddressBook();

        myAddressBook.addContact();
        System.out.println(myAddressBook.contactList);

        addressBookMap.put(MY_ADDRESSBOOK,myAddressBook);

    }

}