package Lab03;

import AIMS_Project.DigitalVideoDisc;

public class Order {
    public static final int MAX_NUMBER_ORDERED = 10;
    private int qtyOrdered;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

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

}
