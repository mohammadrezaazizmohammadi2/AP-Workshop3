import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        
        System.out.println("PhoneBook Started. Enter commands:");

        while (true) {
            String input = scanner.nextLine().trim();
            String[] tokens = input.split(" ");
            
            if (tokens.length == 0 || input.isEmpty()) continue;
            
            String command = tokens[0];

            if (command.equals("exit")) {
                break;
            } 
            else if (command.equals("contacts") && tokens.length >= 4) {
                String action = tokens[1];
                String firstName = tokens[2];
                String lastName = tokens[3];

                if (action.equals("-a")) {
                  
                    System.out.print("Enter Group (or press enter to skip): ");
                    String group = scanner.nextLine().trim();
                    System.out.print("Enter Email (or press enter to skip): ");
                    String email = scanner.nextLine().trim();
                    
                    System.out.print("Enter Country Code (e.g. +98): ");
                    String code = scanner.nextLine().trim();
                    System.out.print("Enter 12-digit Phone Number: ");
                    String number = scanner.nextLine().trim();
                    
                    System.out.print("Enter ZipCode: ");
                    String zip = scanner.nextLine().trim();
                    System.out.print("Enter Country: ");
                    String country = scanner.nextLine().trim();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine().trim();

                    Address address = new Address(zip, country, city);
                    PhoneNumber phone = new PhoneNumber(code, number);
                    Contact newContact = new Contact(firstName, lastName, group, email, phone, address);
                    
                    phoneBook.addContact(newContact);
                } 
                else if (action.equals("-r")) {
                    phoneBook.removeContact(firstName, lastName);
                }
            } 
            else if (command.equals("show")) {
                if (tokens.length == 1) {
                    phoneBook.showAll();
                } else if (tokens.length >= 3 && tokens[1].equals("-g")) {
                    phoneBook.showGroup(tokens[2]);
                } else if (tokens.length >= 4 && tokens[1].equals("-c")) {
                    phoneBook.showContact(tokens[2], tokens[3]);
                }
            } else {
                System.out.println("Invalid command.");
            }
        }
        scanner.close();
    }
}
