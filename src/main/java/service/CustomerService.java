package service;
import model.Customer;
import model.Address;
import repository.CustomerRepository;
import java.util.List;

public class CustomerService {
    private static CustomerService customerService;
    private CustomerRepository customerRepository = new CustomerRepository();
    private AddressService addressService = AddressService.getAddressServiceInstance();
    private CustomerService() {}
    public static CustomerService getCustomerServiceInstance() {
        if (customerService == null) {
            customerService = new CustomerService();
        }
        return customerService;
    }


    // Add the customer
    public Customer addCustomer(String name, int phoneNumber,Integer addressId) {
        if(addressId == null || addressId == 0 ) {
            String city = "default";
            String street = "default";
            String houseNumber = "default";
            Address address = addressService.addAddress(city,street,houseNumber);
            addressId = address.getAddress_id();
        }
        return customerRepository.addCustomer(name,phoneNumber,addressId);
        }

    // Show all Customer

    public List<Customer> getCustomerList(){
        return customerRepository.getCustomerList();}

    // Get Customer by Id
    public Customer getCustomerById(int id) {
        if (customerRepository.getCustomerById(id) != null) {
            return customerRepository.getCustomerById(id);
        }
        else{
            throw new IllegalArgumentException("Customer not found");
        }
    }

    }





