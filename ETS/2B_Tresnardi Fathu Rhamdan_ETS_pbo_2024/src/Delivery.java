
public class Delivery extends paymentService{
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private float weight;
    private int quantity;
    private double priceItem;
    private String productName;

    public Delivery(City city, double priceItem, String productName, int quantity, ServicePackage servicePackage, Status status, float weight) {
        this.city = city;
        this.priceItem = priceItem;
        this.productName = productName;
        this.quantity = quantity;
        this.servicePackage = servicePackage;
        this.status = status;
        this.weight = weight;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ServicePackage getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(ServicePackage servicePackage) {
        this.servicePackage = servicePackage;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getTotal(){
        return this.priceItem * this.quantity;
    }

    @Override
    String getPaymentMethod() {
        return "OVO | QRIS | CASH";
    }

    @Override
    String getPaymentStatus() {
        return "Waiting Payment";
    }
}
