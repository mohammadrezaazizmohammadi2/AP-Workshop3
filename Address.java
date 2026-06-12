public class Address {
    private String zipCode;
    private String country;
    private String city;

    public Address(String zipCode, String country, String city) {
        this.zipCode = (zipCode == null || zipCode.isEmpty()) ? "-" : zipCode;
        this.country = (country == null || country.isEmpty()) ? "-" : country;
        this.city = (city == null || city.isEmpty()) ? "-" : city;
    }

    @Override
    public String toString() {
        return "City: " + city + ", Country: " + country + ", ZipCode: " + zipCode;
    }
}
