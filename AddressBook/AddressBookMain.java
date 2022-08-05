package com.bl.AddressBook;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program");

		String[][] addressbooks = new String[10][8];
		ContactPerson obj = new ContactPerson();

		addressbooks[0][0] = "First Name";
		addressbooks[0][1] = "Last Name";
		addressbooks[0][2] = "Address";
		addressbooks[0][3] = "City";
		addressbooks[0][4] = "State";
		addressbooks[0][5] = "Zip";
		addressbooks[0][6] = "Phone Number";
		addressbooks[0][7] = "Email";

		addressbooks[1][0] = "Bravo";
		addressbooks[1][1] = "K";
		addressbooks[1][2] = "ECIL,Hyderabad";
		addressbooks[1][3] = "Hyderabad";
		addressbooks[1][4] = "Telangana";
		addressbooks[1][5] = "500001";
		addressbooks[1][6] = "5846985485";
		addressbooks[1][7] = "bl@gmail.com";

		addressbooks[2][0] = "David";
		addressbooks[2][1] = "Hussey";
		addressbooks[2][2] = "Ongole, Andhra Pradesh";
		addressbooks[2][3] = "Ongole";
		addressbooks[2][4] = "AP";
		addressbooks[2][5] = "523001";
		addressbooks[2][6] = "9584258466";
		addressbooks[2][7] = "hussey@yahoo.com";

		
		System.out.println(addressbooks[1][0] + " " + addressbooks[1][1] + "\t" + addressbooks[1][2] + ", " + "\n\t"
				+ addressbooks[1][3] + "\n\t" + addressbooks[1][4] + ", " + addressbooks[1][5] + "  Ph.No: "
				+ addressbooks[1][6] + "\n\t" + addressbooks[1][7]);
		
		System.out.println(addressbooks[2][0] + " " + addressbooks[2][1] + "\t" + addressbooks[2][2] + ", " + "\n\t"
				+ addressbooks[2][3] + "\n\t" + addressbooks[2][4] + ", " + addressbooks[2][5] + "  Ph.No: "
				+ addressbooks[2][6] + "\n\t" + addressbooks[2][7]);

		obj.addNewContact(null, null, null, null, null, 0, 0, null);
		
	}
}
