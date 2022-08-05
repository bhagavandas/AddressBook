package com.bl.AddressBook;

import java.util.Scanner;

public class ContactPerson extends AddressBookMain {
	
	public void addNewContact(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber, String email) {
		Scanner add = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		firstName = add.next();
		System.out.println("Enter Last Name : ");
		lastName = add.next();
		System.out.println("Enter Address : ");
		address = add.next();
		System.out.println("Enter City : ");
		city = add.next();
		System.out.println("Enter State : ");
		state = add.next();
		System.out.println("Enter Zip : ");
		zip = add.nextInt();
		System.out.println("Enter Phone Number : ");
		phoneNumber = add.nextInt();
		System.out.println("Enter Email : ");
		email = add.next();
		
		System.out.println("New Contact Details : ");
		
		System.out.println(firstName + " " + lastName + "\t" + address + ", " + "\n\t"
				+ city + "\n\t" + state + ", " + zip + "  Ph.No: "
				+ phoneNumber + "\n\t" + email);
		
		
	}

}
