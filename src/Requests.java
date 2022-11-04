
import java.util.Date;

public class Requests {

    private Date date;
    private String time;
    private double tons;
    private int applicantNumber;
    private String state;
    private Vehicle vehicle;

    public Requests() {
    }

    public Requests(Date date, String time, double tons, int applicantNumber, String state, Vehicle vehicle) {
        this.date = date;
        this.time = time;
        this.tons = tons;
        this.applicantNumber = applicantNumber;
        this.state = state;
        this.vehicle = vehicle;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the tons
     */
    public double getTons() {
        return tons;
    }

    /**
     * @param tons the tons to set
     */
    public void setTons(double tons) {
        this.tons = tons;
    }

    /**
     * @return the applicantNumber
     */
    public int getApplicantNumber() {
        return applicantNumber;
    }

    /**
     * @param applicantNumber the applicantNumber to set
     */
    public void setApplicantNumber(int applicantNumber) {
        this.applicantNumber = applicantNumber;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Requests{" + "date=" + date + ", time=" + time + ", tons=" + tons + ", applicantNumber=" + applicantNumber + ", state=" + state + ", vehicle=" + vehicle + '}';
    }
    
    public void tramitarSolicitud(){
        for (Object producto : this.product) {
            Explotions.extraerMaterial((Product) producto);
        }
    }
}