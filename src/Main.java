import java8.announcoment.Announcoment;
import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Airpline;
import java8.transport.Car;
import java8.transport.Helicopter;

import java.time.LocalDate;
import java.util.Arrays;

import static java8.announcoment.Announcoment.maxPrice;

public class Main {
    public static void main(String[] args) {

        Announcoment announcoment = new Announcoment("Super info", "img", 10, "for news");
        Announcoment announcoment2 = new Announcoment("for work", "img", 5, "for work!");

        Laptop laptop2 = new Laptop("MacBook", "❤️", 900, "new", "Mac OC");
        Laptop laptop3 = new Laptop("MacBook", "❤️", 900, "new", "Mac OC");



        Phone phone = new Phone("Samsung Galaxy A50", "📱", 800, "new phone", "Made in  USA", 64);
        Phone phone1 = new Phone("Iphone 11 pro ", "📱", 1.200, "new phone", "Made in California", 256);


        Home home = new Home("Ihlas", "🏠", 2000.23, "for leving", "floor", 4);
        Home home1 = new Home("Peaksoft", "🚒", 2232.23, "for teaching", "just home", 6);

        Airpline airpline = new Airpline("manas");

        Car car = new Car("Lexus", "🏎", 25000, "for driver", "white", LocalDate.of(2023, 11, 1));
        Car car1 = new Car("BMW", "🏎", 30000, "for driver", "black", LocalDate.of(2020, 10, 5));

        Helicopter helicopter = new Helicopter();

        Announcoment[]announcements= new Announcoment[]{laptop2, laptop3, phone, phone1, home1, home, announcoment, announcoment2, car, car1};
        method(announcements);



    }
    public static void method(Announcoment[]announcoments){
        int [] price = new int [announcoments.length];
        int index = 0 ;
        for (Announcoment announcomentb:announcoments) {
            price[index] = (int) announcomentb.getPrice();
            index++;}
        Arrays.sort(price);
        for (int i = 0; i < announcoments.length; i++) {
            for (int j = 0 ; j < announcoments.length ; j++) {
                if (announcoments[j].getPrice() == price[i])
                    System.out.println(announcoments[j].getName() + " " + announcoments[j].getPrice());
            }

        }

    }

}






//        System.out.println(maxPrice(laptop.getPrice(), laptop2.getPrice()));
//        System.out.println(maxPrice(phone.getPrice(), phone1.getPrice()));
//        System.out.println(maxPrice(home.getPrice(), home1.getPrice()));
//        System.out.println(maxPrice(car.getPrice(), car1.getPrice()));
