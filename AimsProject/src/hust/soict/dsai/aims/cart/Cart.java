package AimsProject.src.hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import AimsProject.src.hust.soict.dsai.aims.media.Media;
import AimsProject.src.hust.soict.dsai.aims.media.Playable;


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
    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                return media; 
            }
        }
        return null; 
    }

    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Cart sorted by Title (ascending) and Cost (descending):");
        displayCartDetails(); 
    }

    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Cart sorted by Cost (descending) and Title (ascending):");
        displayCartDetails();
    }

     public void filterMediaInCart(Scanner scanner) {
        System.out.println("Filter by (1) ID or (2) Title:");
        int filterChoice = scanner.nextInt();
        scanner.nextLine();  
        switch (filterChoice) {
            case 1:
                System.out.println("Enter the ID of the media:");
                int id = scanner.nextInt();
                scanner.nextLine();  
                boolean found = false;
                for (Media media : itemsOrdered) {
                    if (media.getId() == id) {
                        System.out.println(media);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("No media found with ID: " + id);
                }
                break;
            case 2:
                System.out.println("Enter the title of the media:");
                String title = scanner.nextLine();
                found = false;
                for (Media media : itemsOrdered) {
                    if (media.getTitle().equalsIgnoreCase(title)) {
                        System.out.println(media);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("No media found with title: " + title);
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    public void sortMediaInCart(Scanner scanner) {
        System.out.println("Sort by (1) Title or (2) Cost:");
        int sortChoice = scanner.nextInt();
        scanner.nextLine(); 
        switch (sortChoice) {
            case 1:
                itemsOrdered.sort(Comparator.comparing(Media::getTitle));
                break;
            case 2:
                itemsOrdered.sort(Comparator.comparingDouble(Media::getCost));
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
        }
        System.out.println("Sorted media in cart:");
        for (Media media : itemsOrdered) {
            System.out.println(media);
        }
    }

    public void playMediaInCart(Scanner scanner) {
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is currently empty.");
            return;
        }

        System.out.println("Enter the title of the media to play:");
        String title = scanner.nextLine();
        Media foundMedia = itemsOrdered.stream()
                                       .filter(media -> media.getTitle().equalsIgnoreCase(title))
                                       .findFirst()
                                       .orElse(null);

        if (foundMedia != null && foundMedia instanceof Playable) {
            ((Playable) foundMedia).play();
        } else if (foundMedia != null) {
            System.out.println("This media cannot be played.");
        } else {
            System.out.println("Media not found in the cart.");
        }
    }

    
    public void emptyCart() {
        itemsOrdered.clear();
        System.out.println("The cart has been emptied.");
    }
    
    public void removeMediaByTitle(String title) {
        Media mediaToRemove = null;
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                mediaToRemove = media;
                break;
            }
        }
        if (mediaToRemove != null) {
            itemsOrdered.remove(mediaToRemove);
            System.out.println(title + " has been removed from the cart.");
        } else {
            System.out.println(title + " not found in the cart.");
        }
    }

    public void clearCart() {
        itemsOrdered.clear();
        System.out.println("The cart has been cleared.");
    }
    
    public boolean isEmpty() {
        return itemsOrdered.isEmpty();
    }

    public List<Media> getMediaList() {
        return new ArrayList<>(itemsOrdered);
    }
}