public class PhoneNumber {
    private String countryCode;
    private String number;

    public PhoneNumber(String countryCode, String number) {
        this.countryCode = (countryCode == null || countryCode.isEmpty()) ? "+98" : countryCode;
        
        if (number != null && number.length() == 12) {
            this.number = number;
        } else {
            this.number = "000000000000"; 
            System.out.println("Warning: Phone number must be exactly 12 characters.");
        }
    }

    @Override
    public String toString() {
        return countryCode + " " + number;
    }
}
