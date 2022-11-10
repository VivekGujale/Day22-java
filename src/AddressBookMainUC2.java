//Ability to add a new Contact to Address Book.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMainUC2 {
    private List<personDetails> addressbook = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    private void addPerson() {
        personDetails person = new personDetails();
        System.out.println("Enter First Name");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name");
        String lastName = sc.nextLine();
        System.out.println("Enter Address");
        String address = sc.nextLine();
        System.out.println("Enter City");
        String city = sc.nextLine();
        System.out.println("Enter State");
        String state = sc.nextLine();
        System.out.println("Enter Zip code");
        int zipcode = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Phone Number");
        long phoneNumber = Long.parseLong(sc.nextLine());

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddress(address);
        person.setCity(city);
        person.setState(state);
        person.setZipCode(zipcode);
        person.setPhoneNumber(phoneNumber);

        addressbook.add(person);
    }

    private void showaddressbook() {
        for (int i = 0; i < addressbook.size(); i++) {
            System.out.println(addressbook.get(i));
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        boolean isExit = false;
        AddressBookMainUC2 addressBookMainUC2 = new AddressBookMainUC2();

        while (!isExit) {
            System.out.println(" Select below" +
                    "\n1. Add Person details" +
                    "\n2. show Address book" +
                    "\n3. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addressBookMainUC2.addPerson();
                    break;
                case 2:
                    addressBookMainUC2.showaddressbook();
                    break;
                case 3:
                    isExit = true;
                    break;
                default:
                    System.out.println("Please enter valid details");
            }
        }
    }
}
