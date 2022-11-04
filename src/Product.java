public class Product {

    private String productID;
    private String name;
    private double price;
    double productInventary;

    public Product() {
    }

    public Product(String productID, String name, double price, double productInventary) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.productInventary = productInventary;
    }

    /**
     * @return the productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(String productID) {
        this.productID = productID;
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
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the productInventary
     */
    public double getProductInventary() {
        return productInventary;
    }

    /**
     * @param productInventary the productInventary to set
     */
    public void setProductInventary(double productInventary) {
        this.productInventary = productInventary;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", name=" + name + ", price=" + price + ", productInventary=" + productInventary + '}';
    }
}