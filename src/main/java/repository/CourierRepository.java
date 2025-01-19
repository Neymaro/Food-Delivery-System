package repository;
import model.Courier;
import java.util.ArrayList;
import java.util.List;

public class CourierRepository {

    List<Courier> courierList = new ArrayList<>();

    // Getting all couriers here
    public List<Courier> getCourierList() {
        return courierList;
    }

    // Get CourierBy Id
    public Courier getCourierById(int id) {
        return courierList.stream()
                .filter(courier -> courier.getCourierID() == id)
                .findFirst()
                .orElse(null);
    }

    // Add Courier Functionality
    public Courier addCourier(String name, boolean isAvailable) {
        int newId = getHighestId()+1;
        Courier courier = new Courier(name,newId,isAvailable);
        courierList.add(courier);
        return courier;
    }

    //Updating Courier isAvailable
    public boolean updateCourierAvailability(int id, boolean isAvailable) {
        for(Courier courier : courierList) {
            if(courier.getCourierID() == id) {
                courier.setCourierStatus(isAvailable);
                return true;
            }
        }
        return false;
    }

    // Creating unique ID for the new Courier . Finding with Math.max method the latest Id
    public int getHighestId(){
        int highestId = 0;
        if(!courierList.isEmpty()){
            for(Courier courier : courierList){
                highestId = Math.max(highestId,courier.getCourierID());
            }
        }
        return highestId;
    }
}
