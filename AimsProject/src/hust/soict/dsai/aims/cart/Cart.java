package AimsProject.src.hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import AimsProject.src.hust.soict.dsai.aims.media.Media;


public class Cart {
    // Collection of Media objects (DigitalVideoDisc, Book, CompactDisc)
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    // Add a Media item (could be DigitalVideoDisc, Book, or CompactDisc)
    public void addMedia(Media media) {
        if (itemsOrdered.size() < 20) {
            if (!itemsOrdered.contains(media)) {
                itemsOrdered.add(media);
                System.out.println("The item \"" + media.getTitle() + "\" has been added.");
            } else {
                System.out.println("The item \"" + media.getTitle() + "\" is already in the cart.");
            }
        } else {
            System.out.println("Cannot add more items. The cart is full.");
        }
    }

    // Add multiple Media items (could be DigitalVideoDisc, Book, or CompactDisc)
    public void addMedia(Media[] mediaList) {
        for (Media media : mediaList) {
            if (itemsOrdered.size() < 20) {
                addMedia(media);
            } else {
                System.out.println("Cannot add \"" + media.getTitle() + "\". The cart is full.");
                break;
            }
        }
    }

    // Remove a Media item
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The item \"" + media.getTitle() + "\" has been removed.");
        } else {
            System.out.println("The item \"" + media.getTitle() + "\" was not found in the cart.");
        }
    }

    // Calculate the total cost of all items in the cart
    public double totalCost() {
        double total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();  // Assuming getCost() is available in Media and its subclasses
        }
        return total;
    }

    // Display all items in the cart
    public void displayCartDetails() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int index = 1;
        for (Media media : itemsOrdered) {
            System.out.println(index + ". " + media.toString());
            index++;
        }
        System.out.println("Total cost: $" + totalCost());
        System.out.println("***************************************************");
    }

    // Search by Media ID
    public void searchById(String id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (Integer.toString(media.getId()).equals(id)) {
                System.out.println("Item found: " + media.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No item found with ID: " + id);
        }
    }

    // Search by Media title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                System.out.println("Item found: " + media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found with title: " + title);
        }
    }
}