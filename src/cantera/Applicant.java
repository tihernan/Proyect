package cantera;

public class Applicant implements BussinessInterface, PhysicalPersonInterface {

    private int applicantID;
    String username;
    String password;
    
    public Applicant() {
    }
    
    public Applicant(int applicantID, String username, String password) {
        this.applicantID = applicantID;
        this.username = username;
        this.password = password;
    }

    /**
     * @return the applicantID
     */
    public int getApplicantID() {
        return applicantID;
    }

    /**
     * @param applicantID the applicantID to set
     */
    public void setApplicantID(int applicantID) {
        this.applicantID = applicantID;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Applicant{" + "applicantID=" + applicantID + ", username=" + username + ", password=" + password + '}';
    }
    
}