package service;

import model.Courier;
import model.Order;
import repository.CourierRepository;
import repository.OrderRepository;
import java.util.List;

public class OrderService {

    private static OrderService orderService;
    private OrderService(){}
    private OrderRepository orderRepository = new OrderRepository();
    private CourierRepository courierRepository = new CourierRepository();

    public static OrderService getOrderServiceInstance() {
        if (orderService == null) {
            orderService = new OrderService();
        }
        return orderService;
    }

    // Creating Order Validation
    public Order createOrder(int customerID, String pickUpAddress,String deliveryAddress){
        if(pickUpAddress.isEmpty() ||deliveryAddress.isEmpty()){
            throw new IllegalArgumentException("PickUpAddress and DeliveryAddress cannot be empty");
        }
        return orderRepository.addOrder(customerID,pickUpAddress,deliveryAddress);
    }

    // Updating Order Status
    public void updateOrderStatus(int orderID, String status){
        Order order = orderRepository.getOrderById(orderID);
        if(order == null){
            throw new IllegalArgumentException("Order not found");
        }
        order.setStatus(status);
    }

    // Assigning the Courier to Order and setting Status
    public void assignCourierToOrder(int orderID, int courierID){
        Order order = orderRepository.getOrderById(orderID);
        if (order == null ){
            throw new IllegalArgumentException("Order not found");
        }
        Courier courier = courierRepository.getCourierById(courierID);
        if (courier == null){
            throw new IllegalArgumentException("Courier not found");
        }
        order.setCourierID(courierID);
        order.setStatus("Order Assigned to Courier");
    }

    // Show all orders

    public List<Order> showAllOrders(){
        return orderRepository.getOrderList();
    }


}
