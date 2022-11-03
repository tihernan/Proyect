public class Bussiness implements BussinessInterface {

    private String CFI;
    private String phoneNumber;

    public Bussiness() {
    }

    public Bussiness(String CFI, String phoneNumber) {
        this.CFI = CFI;
        this.phoneNumber = phoneNumber;
    }

    Bussiness(String string, String string0, String florida_SA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return super.toString() + "Bussiness{" + "CFI=" + CFI + ", phoneNumber=" + phoneNumber + '}';
    }

}