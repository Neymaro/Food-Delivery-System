package controller;

import model.Address;
import service.AddressService;
import java.util.List;

public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }
    // Add Address controller
    public String addAddress(String street, String city, String houseNumber) {
        Address address = addressService.addAddress(city,street,houseNumber);
        return address.toString();
    }

    // Address Get By Id
    public String addressGetById(int id) {
        Address address = addressService.getAddressById(id);
        if(address != null) {return "The Address by " + id + " = " + address.toString();}
        else {return "Address not found";}
    }
    // Updating Address
    public String updateAddress(int id, String street, String city, String houseNumber) {
        Address updatedAddress = addressService.updateAddress(id, street, city, houseNumber);
        return updatedAddress.toString();
    }

    // Show All Address
    public void showAllAddresses() {
        List<Address> addressList = addressService.showAllAddresses();
        if(addressList.isEmpty()){
            System.out.println("No address found");
        }else{
            addressList.forEach(System.out::println);
        }
    }

}
