package java8.transport;

import java8.announcoment.Announcoment;

import java.time.LocalDate;

public class Car extends Announcoment {
    private String colour;
    private LocalDate yearOfIssue;

    public Car(String name, String imeg, double price, String descriptoin, String colour, LocalDate yearOfIssue) {
        super(name, imeg, price, descriptoin);
        this.colour = colour;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
