public class Vehicle {

    private String carID;

    public Vehicle() {
    }

    public Vehicle(String carID) {
        this.carID = carID;
    }

    /**
     * @return the carID
     */
    public String getCarID() {
        return carID;
    }

    /**
     * @param carID the carID to set
     */
    public void setCarID(String carID) {
        this.carID = carID;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "carID=" + carID + '}';
    }
    
}