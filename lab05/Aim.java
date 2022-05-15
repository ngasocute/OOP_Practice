package Lab05;

import Lab05.Order;
import Lab05.DigitalVideoDisc;

public class Aim {
    public static void main(String[] args) {
        // create order class
        Order order = new Order();
        // create digital video disc class
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        order.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        order.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        order.addDigitalVideoDisc(dvd3);

        // System.out.println("Total cost: " + order.totalCost());
        order.printOrder();

    }

}
