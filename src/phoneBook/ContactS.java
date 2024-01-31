package phoneBook;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;



    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    public Contact(String firstName){
        this.firstName = firstName;
    }

    public Object setFirstName(String firstName) {
        this.firstName = firstName;
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("""
                first Name: %s
                last Name; %s
                Phone Number: + 234 %s
                """,firstName,lastName,phoneNumber);
    }
}
