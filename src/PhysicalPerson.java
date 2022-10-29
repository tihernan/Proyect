public class PhysicalPerson extends Person implements PhysicalPersonInterface {

    private String cellphone;

    public PhysicalPerson() {
    }

    public PhysicalPerson(String cellphone) {
        this.cellphone = cellphone;
    }

    public PhysicalPerson(String cellphone, String name, String adress, String ID) {
        super(name, adress, ID);
        this.cellphone = cellphone;
    }

    /**
     * @return the cellphone
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        return "PhysicalPerson{" + "cellphone=" + cellphone + '}';
    }
    
}
