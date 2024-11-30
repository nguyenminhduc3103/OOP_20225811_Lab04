package AimsProject.src.hust.soict.dsai.aims.store;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int itemCount;

    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
        itemCount = 0;
    }

    public boolean addDVD(DigitalVideoDisc dvd) {
        if (itemCount < itemsInStore.length) {
            itemsInStore[itemCount] = dvd;
            itemCount++;
            System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
            return true;
        } else {
            System.out.println("The store is full. Cannot add the DVD \"" + dvd.getTitle() + "\".");
            return false;
        }
    }

    public boolean removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore[i].getId() == dvd.getId()) {
                for (int j = i; j < itemCount - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[itemCount - 1] = null; // Remove the last DVD
                itemCount--;
                System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
                return true;
            }
        }
        System.out.println("The DVD \"" + dvd.getTitle() + "\" is not found in the store.");
        return false;
    }

    public void displayStoreItems() {
        if (itemCount == 0) {
            System.out.println("No DVDs in store.");
        } else {
            System.out.println("Store Inventory:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println("- " + itemsInStore[i].getTitle());
            }
        }
    }
}
