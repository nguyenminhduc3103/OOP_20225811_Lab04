package AimsProject.src.hust.soict.dsai.aims.store;

import AimsProject.src.hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

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

    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.isMatch(title)) {
                System.out.println("Found media: " + media.toString());
                return media; // Return the first matching media
            }
        }
        System.out.println("No media found with title: " + title);
        return null; // Return null if no media matches
    }

    public List<Media> getMediaList() {
        return new ArrayList<>(itemsInStore);  // Return a copy of the list
    }
}
