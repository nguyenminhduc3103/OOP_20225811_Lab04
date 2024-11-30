package AimsProject.src.hust.soict.dsai.test.cart;
import AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99);
        cart.addDigitalVideoDisc(dvd3);

        // Test the print method
        cart.displayCartDetails();

        // To-do: Test the search methods here
        cart.searchById("1");
        cart.searchById("3");

        cart.searchByTitle("The Lion King");
        cart.searchByTitle("Unknown Movie");
    }
    
}
