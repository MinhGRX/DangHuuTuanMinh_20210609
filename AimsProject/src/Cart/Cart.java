package aims.cart.Cart;

import aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < this.qtyOrdered; i++) {
            System.out.println((i+1) + ". DVD - " + itemsOrdered[i].getTitle() + " - "
					+ itemsOrdered[i].getCategory() + " - "
					+ itemsOrdered[i].getDirector() + " - "
					+ (itemsOrdered[i].getLength() == 0 ? "Unknown" : itemsOrdered[i].getLength()) + " : "
					+ (itemsOrdered[i].getCost() == 0 ? "Unknown" : itemsOrdered[i].getCost()) + "$");
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("***************************************************");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean check = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i+1; j < qtyOrdered; j++) {
                    itemsOrdered[j-1] = itemsOrdered[j];
                };
                qtyOrdered--;
                check = true;
                System.out.println("The disc has been removed");
                break;
            }
        }
        if (!check) {
            System.out.println("The disc has not been found");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	if (qtyOrdered + 2 >= MAX_NUMBERS_ORDERED) {
    		System.out.println("The Cart is full!!");
    	} else {
    		itemsOrdered[qtyOrdered] = dvd1;
    		itemsOrdered[qtyOrdered + 1] = dvd2;
    		qtyOrdered = qtyOrdered + 2;
    		System.out.println("The DVD " + dvd1.getTitle() + " have been added!");
    		System.out.println("The DVD " + dvd2.getTitle() + " have been added!");
    	}
    }
    
}