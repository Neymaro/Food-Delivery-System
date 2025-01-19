package repository;

import model.Address;

import java.util.ArrayList;
import java.util.List;

public class AddressRepository {

    List<Address> addressList =new ArrayList<>();

    // Listing whole address
    public List<Address> getAddressList() {
        return addressList;
    }

    // Adding new address
    public Address addAdress(String city,String street,String houseNumber){
        int newId = getHighestId()+1;
        Address address = new Address(newId,city,street,houseNumber);
        addressList.add(address);
        return address;
    }

    // Get Address By Id

    public Address getAddressById(int id){
        return addressList.stream()
                .filter(address -> address.getAddress_id() == id)
                .findFirst()
                .orElse(null);
    }

    // Finding last assigned ID;
    public int getHighestId(){
        int highestId=0;
        if(!addressList.isEmpty()){
            for(Address address:addressList){
                highestId = Math.max(highestId,address.getAddress_id());
            }
        }
        return highestId;
    }

}
