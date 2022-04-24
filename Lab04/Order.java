package Lab04;

import Lab04.DigitalVideoDisc;
import java.time.LocalDateTime;

public class Order {
    public static final int MAX_NUMBER_ORDERED = 10;
    private int qtyOrdered;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private LocalDateTime dateOrdered;
    private static int nbOrders = 0;
    public static final int MAX_LIMITED_ORDERS = 5;

    // constructor
    public Order() {
        if (this.nbOrders < MAX_LIMITED_ORDERS) {
            this.nbOrders++;
        } else {
            System.out.println("Maximum number of orders reached");
            System.exit(1);
        }
        this.dateOrdered = LocalDateTime.now();
    }

    // getter for dateOrdered
    public LocalDateTime getDateOrdered() {
        return dateOrdered;
    }

    // setter for dateOrdered
    public void setDateOrdered(LocalDateTime dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    // getter for qtyOrdered
    public int getQtyOrdered() {
        return qtyOrdered;
    }

    // setter for qtyOrdered
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered < MAX_NUMBER_ORDERED) {
            if (checkItemExisted(disc) == 1) {
                System.out.println("Item existed");
            }
            itemOrdered[this.qtyOrdered] = disc;
            this.qtyOrdered++;
        } else {
            System.out.println("Order is full");
        }
    }

    // add list of item
    public void addDigitalVideoDisc(DigitalVideoDisc[] discs) {
        int lenDiscs = discs.length;
        if (lenDiscs + this.qtyOrdered > MAX_NUMBER_ORDERED) {
            System.out.println("Order is full");
        } else {
            for (int i = 0; i < lenDiscs; i++) {
                this.addDigitalVideoDisc(discs[i]);
            }
        }
    }

    // add two items
    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        this.addDigitalVideoDisc(disc1);
        this.addDigitalVideoDisc(disc2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (itemOrdered[i] == disc) {
                itemOrdered[i] = itemOrdered[this.qtyOrdered - 1];
                this.qtyOrdered--;
                break;
            }
        }
    }

    public double totalCost() {
        double totalCost = 0;
        for (int i = 0; i < this.qtyOrdered; i++) {
            totalCost += itemOrdered[i].getCost();
        }
        return totalCost;
    }

    public int checkOrderFull() {
        if (this.qtyOrdered == MAX_NUMBER_ORDERED) {
            return 1;
        } else {
            return 0;
        }
    }

    public int checkItemExisted(DigitalVideoDisc disc) {
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (itemOrdered[i] == disc) {
                return 1;
            }
        }
        return 0;

    }

    public void printOrderDetail(DigitalVideoDisc item) {
        System.out.println("DVD - " + item.getTitle() + " - " + item.getCategory() + " - " + item.getDirector() + " - "
                + item.getLength() + " - " + item.getCost() + " $");

    }

    // print list order
    public void printOrder() {

        System.out.println("*********************Order**************** ********");
        for (int i = 0; i < this.qtyOrdered; i++) {
            this.printOrderDetail(itemOrdered[i]);
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("**************************************************");
    }

}
