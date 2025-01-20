package controller;

import model.Order;
import service.OrderService;

import java.util.List;

public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Add Order
    public String addOrder(int customerID, String pickUpAddress,String deliveryAddress){
        if(customerID != 0 && pickUpAddress != null && deliveryAddress != null){
            Order order = orderService.createOrder(customerID,pickUpAddress,deliveryAddress);
            return order.toString();
        }
        return null;
    }

    // Update Order
    public String updateOrder(int orderID, String status){
        Order order = orderService.getOrderById(orderID);
        if(order != null){
            order.setStatus(status);
        }
        return order.toString();
    }

    // Show All Order

    public List<Order> showAllOrder(){
        List<Order> order = orderService.showAllOrders();
        if (order != null && !order.isEmpty()) {
            return order;
        }
        return null;
    }

}
