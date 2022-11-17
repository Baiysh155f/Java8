package java8.devices;

import java8.announcoment.Announcoment;

public class Laptop  extends Announcoment {
    private String operatongSystem;

    public Laptop(String name, String imeg, double price, String descriptoin, String operatongSystem) {
        super(name, imeg, price, descriptoin);
        this.operatongSystem = operatongSystem;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "operatongSystem='" + operatongSystem + '\'' +
                '}';
    }
}
