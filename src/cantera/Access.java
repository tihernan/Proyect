package cantera;

import java.util.Date;
/**
 * Esta es la descricion 
 * @author pablonoguera
 */
public class Access {

    private Date accessDate;
    private String accessHour;
    private String choferName;
    private Date exitDate;
    private String exitHour;
    private double tons;

    public Access() {
    }

    public Access(Date accessDate, String accessHour, String choferName, Date exitDate, String exitHour, double tons) {
        this.accessDate = accessDate;
        this.accessHour = accessHour;
        this.choferName = choferName;
        this.exitDate = exitDate;
        this.exitHour = exitHour;
        this.tons = tons;
    }

    /**
     * @return the accessDate
     */
    public Date getAccessDate() {
        return accessDate;
    }

    /**
     * @param accessDate the accessDate to set
     */
    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }

    /**
     * @return the accessHour
     */
    public String getAccessHour() {
        return accessHour;
    }

    /**
     * @param accessHour the accessHour to set
     */
    public void setAccessHour(String accessHour) {
        this.accessHour = accessHour;
    }

    /**
     * @return the choferName
     */
    public String getChoferName() {
        return choferName;
    }

    /**
     * @param choferName the choferName to set
     */
    public void setChoferName(String choferName) {
        this.choferName = choferName;
    }

    /**
     * @return the exitDate
     */
    public Date getExitDate() {
        return exitDate;
    }

    /**
     * @param exitDate the exitDate to set
     */
    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    /**
     * @return the exitHour
     */
    public String getExitHour() {
        return exitHour;
    }

    /**
     * @param exitHour the exitHour to set
     */
    public void setExitHour(String exitHour) {
        this.exitHour = exitHour;
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

    @Override
    public String toString() {
        return "Access{" + "accessDate=" + accessDate + ", accessHour=" + accessHour + ", choferName=" + choferName + ", exitDate=" + exitDate + ", exitHour=" + exitHour + ", tons=" + tons + '}';
    }
    
    
}
