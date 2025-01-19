package repository;
import model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    List<Customer> customerList = new ArrayList<>();

    // List all customer function is here
    public List<Customer> getCustomerList() {
        return customerList;
    }

    // Get Customer by Id

    public Customer getCustomerById(int id) {
        return customerList.stream()
                .filter(customer -> customer.getCustomerID() == id)
                .findFirst()
                .orElse(null);
    }

    // Add Customer Function is here
    public Customer addCustomer(String name,int phoneNumber,int addressId) {
        int newId = getCustomerHighestId() + 1;
        Customer customer = new Customer(newId,name,phoneNumber,addressId);
        customerList.add(customer);
        return customer;
    }
    // Setting ID
    public int getCustomerHighestId(){
        int highestId = 0;
        if(!customerList.isEmpty()){
            for(Customer customer : customerList){
                highestId = Math.max(highestId,customer.getCustomerID());
            }
        }
        return highestId;
    }
}
