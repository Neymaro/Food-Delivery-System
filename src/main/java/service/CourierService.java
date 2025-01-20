package service;

import model.Courier;
import repository.CourierRepository;

import java.util.List;

public class CourierService {
    private static CourierService courierService;
    private CourierRepository courierRepository =new CourierRepository();

    public static CourierService getCourierServiceInstance(){
        if(courierService == null){
            courierService = new CourierService();
        }
        return courierService;
    }

    // Add Courier
    public Courier createCourier(String name,boolean isAvailable){
        if (name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        return courierRepository.addCourier(name,isAvailable);
    }

    // Finding Courier by id
    public Courier getCourierById(int id){
        if (courierRepository.getCourierById(id)==null){
            throw new IllegalArgumentException("Courier not found");
        }
        return courierRepository.getCourierById(id);
    }

    // Find all courier

    public List<Courier> getAllCouriers(){
        return courierRepository.getCourierList();
    }

    // Updating Courier Available
    public boolean updateCourier(int id,boolean isAvailable){
        Courier courier = courierRepository.getCourierById(id);
        if (courier == null){
            throw new IllegalArgumentException("Courier not found");
        }
        if (courier.isCourierStatus() == isAvailable ){
            throw new IllegalArgumentException(id + " status is already :" + " " + courier.isCourierStatus());
        }
        return courierRepository.updateCourierAvailability(id,isAvailable);
    }
}
