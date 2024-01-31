package phoneBook;

import java.util.ArrayList;

public class User {

    ArrayList<Contact> myContacts = new ArrayList<>();
    int totalPhoneNumberCount;


    public Contact savePhoneNumber(String firstName, String lastName, String phoneNUmber){
        Contact contact = new Contact(firstName,lastName,phoneNUmber);
        totalPhoneNumberCount++;
        myContacts.add(contact);
        return contact;

    }

    public ArrayList<Contact> searchPhoneNumber(String firstName ){
        Contact contact1 = new Contact(firstName);

        for (phoneBook.Contact contact:myContacts){
            if (myContacts.equals(contact)) {System.out.println(contact1);
            }
        }
        return null;
    }



    public int getTotalPhoneNumberCount(){
        return totalPhoneNumberCount;
    }
}
