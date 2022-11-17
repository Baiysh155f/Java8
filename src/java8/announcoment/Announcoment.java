package java8.announcoment;

public class Announcoment {
    private String name;
    private String imeg;
    private double price;
    private String descriptoin;

    public Announcoment() {

    }

    @Override
    public String toString() {
        return "Announcoment{" +
                "name='" + name + '\'' +
                ", imeg='" + imeg + '\'' +
                ", price=" + price +
                ", descriptoin='" + descriptoin + '\'' +
                '}';
    }

    public Announcoment(String name, String imeg, double price, String descriptoin) {
        this.name = name;
        this.imeg = imeg;
        this.price = price;
        this.descriptoin = descriptoin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImeg() {
        return imeg;
    }

    public void setImeg(String imeg) {
        this.imeg = imeg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptoin() {
        return descriptoin;
    }

    public void setDescriptoin(String descriptoin) {
        this.descriptoin = descriptoin;
    }

    public static double maxPrice(double price1, double price2) {
     return Math.max(price1,price2);
    }
}
