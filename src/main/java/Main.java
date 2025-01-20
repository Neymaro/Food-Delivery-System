import controller.AddressController;
import controller.CourierController;
import controller.CustomerController;
import controller.OrderController;
import service.AddressService;
import service.CourierService;
import service.CustomerService;
import service.OrderService;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        CourierController courierController = new CourierController(CourierService.getCourierServiceInstance());
        AddressController addressController = new AddressController(AddressService.getAddressServiceInstance());
        CustomerController customerController = new CustomerController(CustomerService.getCustomerServiceInstance());
        OrderController orderController = new OrderController(OrderService.getOrderServiceInstance());
        





    }
}
