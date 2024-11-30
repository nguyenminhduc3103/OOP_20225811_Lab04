package AimsProject.src.hust.soict.dsai.aims;
import AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Comedy", "Me and You", 20);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Comedy", "You and Me", 31.128389);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Me");

        DigitalVideoDisc[] dvds = {dvd1, dvd2, dvd3};

        cart.addDigitalVideoDisc(dvds);
        //cart.addDigitalVideoDisc(dvd2);
        //cart.addDigitalVideoDisc(dvd3);


        System.out.println("Total cost: " + cart.totalCost());

        cart.removeDigitalVideoDisc(dvd1);
        System.out.println("Total cost after removing dvd1: " + cart.totalCost());
    }
}