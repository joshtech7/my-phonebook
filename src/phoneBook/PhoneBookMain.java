package phoneBook;

import java.util.Scanner;

public class PhoneBookMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }


    public static void mainMenu(){
        System.out.println("""
                1-> add phone number
                2 -> search phone number
                3 -> delete contact
                4 -> add to contacts 
                5 -> exit
                """);
        int menu = Integer.parseInt(scanner.nextLine());
        switch (menu){
            case 1:
                addPhoneNumber();
            case 2:
                searchPhoneNumber();
            case 3:
                exits();
                break;
            default:
                System.out.println("wrong input");
        }


    }

    private static void exits() {
        System.out.println("Thank you for using our Phone Book app..");
    }

    private static void searchPhoneNumber() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        User user = new User();
        String name = String.valueOf(user.searchPhoneNumber(firstName));
        System.out.println(name);
        mainMenu();
    }

    private static void addPhoneNumber() {
        System.out.print("Enter first Name:");
        String firstName = scanner.nextLine();
        System.out.print("Enter last Name:");
        String lastName = scanner.nextLine();
        System.out.print("Enter phoneNumber:");
        String phoneNumber = scanner.nextLine();
        User user = new User();
        Contact contact = new Contact(firstName,lastName,phoneNumber);
        user.savePhoneNumber(firstName,lastName,phoneNumber);
        System.out.println("Contact added successfully.... \n");
        System.out.println(contact);
        mainMenu();


    }
}
