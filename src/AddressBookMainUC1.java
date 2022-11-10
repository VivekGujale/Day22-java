//Ability to create a Contacts in Address Book with first and last names, address, city, state, zip, phone number

public class AddressBookMainUC1 {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        personDetails personDetails=new personDetails();
        personDetails.setFirstName("Vivek");
        personDetails.setLastName("Gujale");
        personDetails.setAddress("Kalamboli");
        personDetails.setCity("Panvel");
        personDetails.setState("Maharashtra");
        personDetails.setZipCode(456123);
        personDetails.setPhoneNumber(1234567890l);
        System.out.println(personDetails.toString());

    }
}
