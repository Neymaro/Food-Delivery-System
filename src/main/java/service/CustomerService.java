package service;
import model.Customer;
import repository.CustomerRepository;
import java.util.List;

public class CustomerService {
    private static CustomerService customerService;
    private CustomerRepository customerRepository = new CustomerRepository();
    private CustomerService() {}
    public static CustomerService getCustomerServiceInstance() {
        if (customerService == null) {
            customerService = new CustomerService();
        }
        return customerService;
    }


    // Add the customer
    public Customer addCustomer(String name, int phoneNumber,int addressId) {
        if (name.isEmpty() || phoneNumber == 0) {
            throw new IllegalArgumentException("Name and phone Number cannot be empty");
        }

        if(addressId == 0) {
            throw new IllegalArgumentException("AddressId cannot be empty");
        }
        return customerRepository.addCustomer(name, phoneNumber, addressId);

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





