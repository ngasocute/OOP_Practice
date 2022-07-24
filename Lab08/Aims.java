package hust.soict.globalict;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collection;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import aims.order.Order;

public class Aims {

    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number:0-1-2-3-4");
    }
    public static void showOptions() {
        System.out.println("Choose: ");
        System.out.println("1.Compact disc");
        System.out.println("2.Digital Video Disc");
        System.out.println("3.Book");
        System.out.println("Out");
        System.out.println("Please choose a number: 0-1-2-3");
    }


    public static void main(String[] args) {
        MemoryDaemon mem = new MemoryDaemon();
        Thread th = new Thread(mem);
        th.setDaemon(true);


        Scanner scanner = new Scanner(System.in);
        int n = -1;
        List<Order> listOrder = new ArrayList<Order>();
        int index = -1;
        while(n != 0) {
            showMenu();
            n = scanner.nextInt();
            switch(n) {
                case 1: {
                    Order anOrder = Order.createOrder();
                    listOrder.add(anOrder);
                    index++;
                    if(anOrder != null) {
                        System.out.println("New order is created");
                    }
                    break;
                }
                case 2: {
                    Order temp = listOrder.get(index);
                    int n2 = -1;
                    while(n2 != 0) {
                        showOptions();
                        n2 = scanner.nextInt();
                        switch(n2) {
                            case 1: {
                                CompactDisc cd = new CompactDisc();
                                cd.inputInfo();
                                cd.play();
                                temp.addMedia(cd);
                                break;
                            }
                            case 2: {
                                DigitalVideoDisc dvd = new DigitalVideoDisc();
                                dvd.inputInfo();
                                dvd.play();
                                temp.addMedia(dvd);
                                break;
                            }
                            case 3: {
                                Book b = new Book();
                                b.inputInfo();
                                temp.addMedia(b);
                                break;
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Input ID: ");
                    int id = scanner.nextInt();
                    Order temp = listOrder.get(index);
                    temp.removeById(id);
                    break;
                }
                case 4: {
                    for(int i = 0; i < listOrder.size(); i++) {
                        System.out.println("Order " + (i + 1) + ": ");
                        listOrder.get(i).printList();
                    }
                    break;
                }
            }
        }
        scanner.close();
    // create digital video disc class
    java.util.Collection collection = new java.util.ArrayList();

    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
    dvd1.setCategory("Animation");
    dvd1.setCost(19.95);
    dvd1.setDirector("Roger Allers");
    dvd1.setLength(87);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
    dvd2.setCategory("Science Fiction");
    dvd2.setCost(24.95);
    dvd2.setDirector("George Lucas");
    dvd2.setLength(124);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
    dvd3.setCategory("Animation");
    dvd3.setCost(18.99);
    dvd3.setDirector("John Musker");
    dvd3.setLength(90);

    collection.add(dvd1);
    collection.add(dvd2);
    collection.add(dvd3);

    java.util.Iterator iterator = collection.iterator();
    while(iterator.hasNext()) {
        DigitalVideoDisc dvd = (DigitalVideoDisc)iterator.next();
        System.out.println(dvd.getTitle());
    }
    
    java.util.Collections.sort((java.util.List)collection);

    while(iterator.hasNext()) {
        DigitalVideoDisc dvd = (DigitalVideoDisc)iterator.next();
        System.out.println(dvd.getTitle());
    }
    
}
}