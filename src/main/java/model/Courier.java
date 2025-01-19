package model;

public class Courier {

    private int courierID;
    private String courierName;
    private boolean courierStatus;

    public Courier() {}
    public Courier(String courierName, int courierID, boolean courierStatus) {
        this.courierName = courierName;
        this.courierID = courierID;
        this.courierStatus = courierStatus;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public boolean isCourierStatus() {
        return courierStatus;
    }

    public void setCourierStatus(boolean courierStatus) {
        this.courierStatus = courierStatus;
    }

    public int getCourierID() {
        return courierID;
    }

    public void setCourierID(int courierID) {
        this.courierID = courierID;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "courierID=" + courierID +
                ", courierName='" + courierName + '\'' +
                ", courierStatus=" + courierStatus +
                '}';
    }
}
