package java8.devices;

import java8.announcoment.Announcoment;

public class Phone extends Announcoment {
    private String product;
    private int memory;

    public Phone(String name, String imeg, double price, String descriptoin, String product, int memory) {
        super(name, imeg, price, descriptoin);
        this.product = product;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "product='" + product + '\'' +
                ", memory=" + memory +
                '}';
    }
}
