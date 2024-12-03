package AimsProject.src.hust.soict.dsai.aims.store;

import AimsProject.src.hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" is already in the store.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("The media \"" + media.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" is not found in the store.");
        }
    }

    public void displayStoreItems() {
        if (itemsInStore.isEmpty()) {
            System.out.println("No media items in store.");
        } else {
            System.out.println("Store Inventory:");
            for (Media media : itemsInStore) {
                System.out.println(media.toString());
            }
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsInStore) {
            if (media.isMatch(title)) {
                System.out.println("Found media: " + media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with title: " + title);
        }
    }
}
