package model;

public class Address {

    private int address_id;
    private String city;
    private String street;
    private String houseNumber;

    public Address() {}
    public Address(int address_id, String city, String street, String houseNumber) {
        this.address_id = address_id;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                '}';
    }
}
