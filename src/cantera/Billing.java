package cantera;

public class Billing {

    private int bill;
    private int priceTon;
    private String finalBill;
    
    public Billing() {
    }
    
    public Billing(int bill, int priceTon, String finalBill) {
        this.bill = bill;
        this.priceTon = priceTon;
        this.finalBill = finalBill;
    }

    /**
     * @return the bill
     */
    public int getBill() {
        return bill;
    }

    /**
     * @param bill the bill to set
     */
    public void setBill(int bill) {
        this.bill = bill;
    }

    /**
     * @return the priceTon
     */
    public int getPriceTon() {
        return priceTon;
    }

    /**
     * @param priceTon the priceTon to set
     */
    public void setPriceTon(int priceTon) {
        this.priceTon = priceTon;
    }

    /**
     * @return the finalBill
     */
    public String getFinalBill() {
        return finalBill;
    }

    /**
     * @param finalBill the finalBill to set
     */
    public void setFinalBill(String finalBill) {
        this.finalBill = finalBill;
    }

    @Override
    public String toString() {
        return "Billing{" + "bill=" + bill + ", priceTon=" + priceTon + ", finalBill=" + finalBill + '}';
    }

}