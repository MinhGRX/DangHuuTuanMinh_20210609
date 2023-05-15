package test.cart.CartTest;

import aims.cart.Cart.Cart;
import aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Matrix", "Action", "Lana Wachowski", 136, 9.99f);
        cart.addDigitalVideoDisc(dvd4);

        
        System.out.println("BEFORE REMOVE");
        cart.printCart();

        cart.removeDigitalVideoDisc(dvd4);

        System.out.println("AFTER REMOVE");
        cart.printCart();
    }
}