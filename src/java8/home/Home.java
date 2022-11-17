package java8.home;

import java8.announcoment.Announcoment;

public class Home extends Announcoment {
    private  String homeTyp;
    private  int maxGuest;

    public Home(String name, String imeg, double price, String descriptoin, String homeTyp, int maxGuest) {
        super(name, imeg, price, descriptoin);
        this.homeTyp = homeTyp;
        this.maxGuest = maxGuest;
    }

    @Override
    public String toString() {
        return "Home{" +
                "homeTyp='" + homeTyp + '\'' +
                ", maxGuest=" + maxGuest +
                '}';
    }
}
