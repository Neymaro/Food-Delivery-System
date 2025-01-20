package service;
import model.Address;
import repository.AddressRepository;
import java.util.List;

public class AddressService {
    private static AddressService addressService;
    private AddressRepository addressRepository = new AddressRepository();
    private AddressService() {}

    public static AddressService getAddressServiceInstance() {
        if (addressService == null) {
            addressService = new AddressService();
        }
        return addressService;
    }

    // New Address
    public Address addAddress(String city,String street,String houseNumber) {
        if(street.isEmpty() || houseNumber.isEmpty() || city.isEmpty()) {
            throw new IllegalArgumentException("Please fill all the required fields");
        }
        return addressRepository.addAdress(city,street,houseNumber);
    }

    // Update Address

    public Address updateAddress(int id,String city,String street,String houseNumber) {
        if(street.isEmpty() || houseNumber.isEmpty() || city.isEmpty()) {
            throw new IllegalArgumentException("Please fill all the required fields");
        }
        Address newAddress = addressRepository.updateAddress(id,city,street,houseNumber);
        if(newAddress == null) {
            throw new IllegalArgumentException("Please fill all the required fields");
        }
        return newAddress;
    }

    // Find all address

    public List<Address> showAllAddresses() {
        return addressRepository.getAddressList();
    }

    // Find Address by Id

    public Address getAddressById(int id) {
        if (addressRepository.getAddressById(id) != null) {
            return addressRepository.getAddressById(id);
        }
        throw new IllegalArgumentException("Address not found");
    }



}
