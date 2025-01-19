package model;

public class Order {

    private int orderID;
    private int customerID;
    private int courierID;
    private String pickUpAddress;
    private String deliveryAddress;
    private String status;

    public Order() {}

    public Order( int orderID, int customerID, String pickUpAddress,String deliveryAddress) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.courierID = 0;
        this.pickUpAddress = pickUpAddress;
        this.deliveryAddress = deliveryAddress;
        this.status = "Created";
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCourierID() {
        return courierID;
    }

    public void setCourierID(int courierID) {
        this.courierID = courierID;
    }

    public String getPickUpAddress() {
        return pickUpAddress;
    }

    public void setPickUpAddress(String pickUpAddress) {
        this.pickUpAddress = pickUpAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customerID=" + customerID +
                ", courierID=" + courierID +
                ", pickUpAddress='" + pickUpAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
