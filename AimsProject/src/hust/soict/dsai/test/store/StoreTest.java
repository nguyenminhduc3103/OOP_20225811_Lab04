package AimsProject.src.hust.soict.dsai.test.store;

import AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.media.Book;
import AimsProject.src.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new store
        Store store = new Store();

        // Create new Media items
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99);
        Book book1 = new Book(1, "Harry Potter", "Fantasy", 29.99);

        // Add Media to the store
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(book1);

        // Display store inventory
        store.displayStoreItems();

        // Remove a Media item from the store
        store.removeMedia(dvd2);

        // Display store inventory again
        store.displayStoreItems();

        // Try to remove a Media item that doesn't exist in the store
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Non-existent DVD", "Drama", "Unknown", 100, 10.99);
        store.removeMedia(dvd4);
    }
}
