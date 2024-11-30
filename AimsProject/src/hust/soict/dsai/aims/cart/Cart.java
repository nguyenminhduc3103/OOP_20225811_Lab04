package AimsProject.src.hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.List;

import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    private List<DigitalVideoDisc> items = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (items.size() < 20) {
            if (!items.contains(disc)) {
                items.add(disc);
                System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
            } else {
                System.out.println("The disc \"" + disc.getTitle() + "\" is already in the cart.");
            }
        } else {
            System.out.println("Cannot add more DVDs.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (items.size() < 20) {
                addDigitalVideoDisc(disc);
            } else {
                System.out.println("Cannot add \"" + disc.getTitle() + "\". The cart is full.");
                break;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvds1, DigitalVideoDisc dvds2) {
        addDigitalVideoDisc(dvds1);
        addDigitalVideoDisc(dvds2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (items.remove(disc)) {
            System.out.println("The disc \"" + disc.getTitle() + "\" is removed.");
        } else {
            System.out.println("The disc \"" + disc.getTitle() + "\" was not found in the cart.");
        }
    }

    public double totalCost() {
        double total = 0;
        for (DigitalVideoDisc disc : items) {
            total += disc.getCost();
        }
        return total;
    }

    public void displayCartDetails() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int index = 1;
        for (DigitalVideoDisc disc : items) {
            System.out.println(index + ". " + disc.toString());
            index++;
        }
        System.out.println("Total cost: $" + totalCost());
        System.out.println("***************************************************");
    }

    public void searchById(String id) {
        boolean found = false;
        for (DigitalVideoDisc disc : items) {
            if (Integer.toString(disc.getId()).equals(id)) {
                System.out.println("DVD found: " + disc.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc disc : items) {
            if (disc.isMatch(title)) {
                System.out.println("DVD found: " + disc.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVDs found with title: " + title);
        }
    }
}
