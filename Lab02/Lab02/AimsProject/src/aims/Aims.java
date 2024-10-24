package aims;
import java.util.Arrays;
public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        
        // Create a DigitalVideoDisc object with all parameters
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        
        // Create another DigitalVideoDisc object
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        // Create another DigitalVideoDisc object (constructor with fewer parameters)
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        // Print total cost
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
        
        // Print items ordered
        System.out.println(Arrays.toString(anOrder.getItemsOrdered()));
        
        // Remove a DVD from the cart
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.println("Total cost after removing Star Wars: ");
        System.out.println(anOrder.totalCost());
        
        // Print items ordered after removal
        System.out.println(Arrays.toString(anOrder.getItemsOrdered()));
    }
}
