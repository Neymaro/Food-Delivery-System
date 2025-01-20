package controller;

import model.Courier;
import service.CourierService;

import java.util.List;

public class CourierController {

    private final CourierService courierService;
    // Dependency Injection
    public CourierController(CourierService courierService) {
        this.courierService = courierService;
    }
    // Add Courier
    public String addCourier(String courierName, boolean isAvailable) {
        if(courierName == null || courierName.isEmpty()) {
            return "You have to fill the courier name!";
        }
        Courier courier = courierService.createCourier(courierName, isAvailable);
        return "Courier added successfully!\n"
        + courier.toString();
    }
    // Update Courier
    public String updateCourier(int courierId, boolean newStatus) {
        try{
            boolean success = courierService.updateCourier(courierId,newStatus);
            if (success) {
                return courierService.getCourierById(courierId) + " status updated successfully!";
            }else{
                return "Courier not found or courier is not updated!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    // Show All Courier
    public List<Courier> showAllCourier(){
        List<Courier> couriers = courierService.getAllCouriers();
        if (couriers == null || couriers.isEmpty()) {
            System.out.println("No couriers found!");
            return null;
        }else {
            System.out.println("Courier List:\n");
            for (Courier courier : couriers) {
                System.out.println("ID: " + courier.getCourierID()
                        + " Courier Name: "
                        + courier.getCourierName());
                System.out.println(" ************* ");
            }
        }
        return couriers;
    }
}
