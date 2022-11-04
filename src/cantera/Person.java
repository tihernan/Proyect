package cantera;

public class Person {

    private String name;
    private String adress;
    private String ID;

    public Person() {
    }

    public Person(String name, String adress, String ID) {
        this.name = name;
        this.adress = adress;
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", adress=" + adress + ", ID=" + ID + '}';
    }
    
}