import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Contact Manager Menu:");
            System.out.println("1. Add a Contact");
            System.out.println("2. View a Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the phone number: ");
                    String phoneNumber = scanner.nextLine();
                    contacts.put(name, phoneNumber);
                    System.out.println("Contact added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the name to view the contact: ");
                    name = scanner.nextLine();
                    if (contacts.containsKey(name)) {
                        System.out.println("Name: " + name);
                        System.out.println("Phone Number: " + contacts.get(name));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting Contact Manager. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}