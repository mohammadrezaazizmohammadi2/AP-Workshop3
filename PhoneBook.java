import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Ok");
    }

    public void removeContact(String firstName, String lastName) {
        Contact toRemove = null;
        for (Contact c : contacts) {
            if (c.getFirstName().equals(firstName) && c.getLastName().equals(lastName)) {
                toRemove = c;
                break;
            }
        }
        if (toRemove != null) {
            contacts.remove(toRemove);
            System.out.println("Ok");
        } else {
            System.out.println("Not found");
        }
    }

    public void showContact(String firstName, String lastName) {
        for (Contact c : contacts) {
            if (c.getFirstName().equals(firstName) && c.getLastName().equals(lastName)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Not found");
    }

    public void showGroup(String groupName) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getGroup().equals(groupName)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) System.out.println("No contacts found in group: " + groupName);
    }

    public void showAll() {
        if (contacts.isEmpty()) {
            System.out.println("Phonebook is empty.");
            return;
        }
        for (Contact c : contacts) {
            System.out.println(c.getFirstName() + " " + c.getLastName());
        }
    }
}
