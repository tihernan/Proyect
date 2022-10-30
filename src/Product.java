public class Product {

    private String productID;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", name=" + name + ", price=" + price + '}';
    }
    
}