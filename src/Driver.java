public class Driver extends Person {

    private String driversLicence;

    public Driver() {
    }

    public Driver(String driversLicence) {
        this.driversLicence = driversLicence;
    }

    public Driver(String driversLicence, String name, String adress, String ID) {
        super(name, adress, ID);
        this.driversLicence = driversLicence;
    }

    /**
     * @return the driversLicence
     */
    public String getDriversLicence() {
        return driversLicence;
    }

    /**
     * @param driversLicence the driversLicence to set
     */
    public void setDriversLicence(String driversLicence) {
        this.driversLicence = driversLicence;
    }

    @Override
    public String toString() {
        return "Driver{" + "driversLicence=" + driversLicence + '}';
    }
    
}