package AimsProject.src.hust.soict.dsai.test.store;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new store with a capacity of 5 DVDs
        Store store = new Store(5);

        // Create new DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99);
        
        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display store inventory
        store.displayStoreItems();
        
        // Remove a DVD from the store
        store.removeDVD(dvd2);

        // Display store inventory again
        store.displayStoreItems();

        // Try to remove a DVD that doesn't exist in the store
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Non-existent DVD", "Drama", "Unknown", 100, 10.99);
        store.removeDVD(dvd4);
    }
}
