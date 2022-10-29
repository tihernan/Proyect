public class Bussiness implements BussinessInterface {

    private String CFI;
    private String phoneNumber;

    public Bussiness() {
    }

    public Bussiness(String CFI, String phoneNumber) {
        this.CFI = CFI;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the CFI
     */
    public String getCFI() {
        return CFI;
    }

    /**
     * @param CFI the CFI to set
     */
    public void setCFI(String CFI) {
        this.CFI = CFI;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Bussiness{" + "CFI=" + CFI + ", phoneNumber=" + phoneNumber + '}';
    }

}