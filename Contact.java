public class Contact {
    private String firstName;
    private String lastName;
    private String group;
    private String email;
    private PhoneNumber phoneNumber;
    private Address address;

    public Contact(String firstName, String lastName, String group, String email, PhoneNumber phoneNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = (group == null || group.isEmpty()) ? "-" : group;
        this.email = (email == null || email.isEmpty()) ? "-" : email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGroup() { return group; }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
               "Group: " + group + " | Email: " + email + "\n" +
               "Phone: " + phoneNumber.toString() + "\n" +
               "Address: [" + address.toString() + "]\n" +
               "--------------------------------------------";
    }
}
