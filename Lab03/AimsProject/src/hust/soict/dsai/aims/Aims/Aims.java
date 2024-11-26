package hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart.Cart;


import java.util.Arrays;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		// Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
//		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
//		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
//		anOrder.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc[] dvds = {dvd1, dvd2, dvd3};
		anOrder.addDigitalVideoDisc(dvds);
//		anOrder.addDigitalVideoDisc(dvd2, dvd3);
		
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		System.out.println(Arrays.toString(anOrder.getItemsOrdered()));
		
//		anOrder.removeDigitalVideoDisc(dvd2);
//		System.out.println("Total cost is: ");
//		System.out.println(anOrder.totalCost());
		
		System.out.println(Arrays.toString(anOrder.getItemsOrdered()));
		anOrder.print();
	}
}