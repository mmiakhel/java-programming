package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country = "USA";

    //constructor method - automatically called
    public Address() {
        System.out.println("Address Constructor");
        street = "123 Unknown St";
        city = "Unknown";
        state = "Unknown";
        zipcode = "00000";
    }

    //2nd constructor, overloaded constructor --> provides shortcut to initialize variables
    //in same statement: ex: Address ad = new Address("123 Java St", "Boston", "MA", "43212");
    public Address(String street, String city, String state, String zipcode) {
        setStreet(street); //reuse the code in the setter method
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }

    public void setState(String state) {
        if(street.isEmpty() || street.length() > 50) {
            System.out.println("ERROR: Invalid street");
        } else {
            this.state = state;
        }
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    //public Address(street, city, state, zipcode)




    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipcode;
    }
}
