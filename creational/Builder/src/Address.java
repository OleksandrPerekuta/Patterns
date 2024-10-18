public class Address {
    private String houseNumber;
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public Address(String houseNumber, String street, String city, String state, String zipcode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + houseNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}