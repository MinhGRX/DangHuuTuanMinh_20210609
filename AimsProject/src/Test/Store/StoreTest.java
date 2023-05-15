package test.store.StoreTest;

import aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import aims.store.Store.Store;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);

        Store store = new Store();

        store.addDVD(dvd1);
        System.out.println("Added DVD " + dvd1.getTitle() + " to store.");
        store.addDVD(dvd2);
        System.out.println("Added DVD " + dvd2.getTitle() + " to store.");

        System.out.println("Items in store:");
        for(DigitalVideoDisc dvd : store.getItemsInStore()) {
            System.out.println(dvd.getTitle());
        }

        store.removeDVD(dvd1);
        System.out.println("Removed DVD " + dvd1.getTitle() + " from store.");
    }
}
