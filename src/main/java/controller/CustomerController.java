package controller;

import model.Customer;
import service.CustomerService;

import java.util.List;

public class CustomerController {

    private final CustomerService customerService;
    //Dependency Injection
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    // Add Customer
    public String addCustomer(String name,int phoneNumber,Integer addressId){
        Customer customer = customerService.addCustomer(name,phoneNumber,addressId);
        return customer.toString();
    }

    // Get Customer By ID
    public void getCustomerById(int id){
        Customer customer = customerService.getCustomerById(id);
        System.out.println(customer.toString());
    }

    // Show All Customer
    public void showAllCustomer(){
        List<Customer> customer = customerService.getCustomerList();
        if(customer == null){
            throw new IllegalArgumentException("Customer List is empty");
        }
        else customer.forEach(System.out::println);
    }


}
