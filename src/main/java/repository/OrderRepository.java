package repository;

import model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    List<Order> orderList = new ArrayList<>();

    // Listing Orders
    public List<Order> getOrderList() {
        return orderList;
    }

    // Adding Order methods
    public Order addOrder(int customerID, String pickUpAddress,String deliveryAddress) {
        int newId = getOrderHighestId() + 1;
        Order order = new Order(newId,customerID,pickUpAddress,deliveryAddress);
        orderList.add(order);
        return order;
    }
    // get order by ID method
    public Order getOrderById(int id){
        return orderList.stream()
                .filter(order -> order.getOrderID() == id)
                .findFirst()
                .orElse(null);
    }
    // Changing Order Status
    public boolean updateOrderStatus(int orderid , String status) {
        Order order = getOrderById(orderid);
        if(order != null) {
            order.setStatus(status);
            return true;
        }
        return false;
    }
    // Assigning Courier to Order
    public boolean assignCourierToOrder(int orderID, int courierID) {
        Order order = getOrderById(orderID);
        if(order != null) {
            order.setCourierID(courierID);
            return true;
        }
        return false;
    }

    // Finding Last ID
    public int getOrderHighestId(){
        int highestId = 0;
        if(!orderList.isEmpty()){
            for (Order order : orderList) {
                highestId = Math.max(highestId,order.getOrderID());
            }
        }
        return highestId;
    }
}
