package aims.store.Store;

import aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;

    public Store() {
        itemsInStore = new DigitalVideoDisc[0];
    }

    public void addDVD(DigitalVideoDisc dvd) {
        int length = itemsInStore.length;
        DigitalVideoDisc[] newItemsInStore = new DigitalVideoDisc[length + 1];

        for(int i = 0; i < length; i++) {
            newItemsInStore[i] = itemsInStore[i];
        }

        newItemsInStore[length] = dvd;
        itemsInStore = newItemsInStore;
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        int length = itemsInStore.length;
        DigitalVideoDisc[] newItemsInStore = new DigitalVideoDisc[length - 1];

        boolean found = false;
        int j = 0;

        for(int i = 0; i < length; i++) {
            if(itemsInStore[i].equals(dvd)) {
                found = true;
            } else {
                newItemsInStore[j] = itemsInStore[i];
                j++;
            }
        }

        if(found) {
            itemsInStore = newItemsInStore;
        }
    }

    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(DigitalVideoDisc[] itemsInStore) {
        this.itemsInStore = itemsInStore;
    }
}

