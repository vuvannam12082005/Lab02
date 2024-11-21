package hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
	private int qtyOrdered = 0;
	public static final int MAX_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_ORDERED];
	
	
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_ORDERED) {
			System.out.println("Reached max number ordered");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("Added");
		}
	
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc[] dvdList) {
		for (DigitalVideoDisc disc: dvdList) {
			int space = MAX_ORDERED - qtyOrdered;
			if (space == 0) {
				System.out.println("Full");
				return;
			}
			else {
				itemsOrdered[qtyOrdered] = disc;
				qtyOrdered += 1;
				System.out.println("Add" + disc.getTitle());
				}
		}
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		DigitalVideoDisc[] discs = {disc1, disc2};
		for (DigitalVideoDisc disc : discs) {
			int space = MAX_ORDERED - qtyOrdered;
			if (space == 0) {
				System.out.println("Full");
				return;
			}
			else {
				itemsOrdered[qtyOrdered] = disc;
				qtyOrdered += 1;
				System.out.println("Add" + disc.getTitle());
				}
		}
	}
	
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; i < qtyOrdered - 1; i++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered-1] = null;
				qtyOrdered -= 1;
				System.out.println("Removed");
				return;
			}
		}
		System.out.println("Cannot find the disc");
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}	
		return totalCost;
	}
	
	public String[] getItemsOrdered() {
		String[] listOrdered = new String[qtyOrdered];
		for (int i = 0; i< qtyOrdered; i++) {
			listOrdered[i] = itemsOrdered[i].getTitle();
		}
		return listOrdered;
	}
	
	 public void print() {
		 System.out.println("***********************CART***********************");
		 System.out.println("Ordered Items:");
		 for (DigitalVideoDisc disc : itemsOrdered) {
			 if (disc == null) {
				 System.out.println("Total cost: " + totalCost());
				 break;
			 }
			 else {
				 System.out.println(disc.getID() + ". " + disc.toString());
			 }		 
		 }
	 }
	 
	 public void idSearch(int id) {
		 boolean found = false;
		 for (DigitalVideoDisc disc : itemsOrdered) {
			 if (disc == null) {
				 break;
			 }
			 else if (disc.getID() == id) {
				 System.out.println("found: " + disc.toString());
				 found = true;
				 break;
			 } 
		 }
		 if (found == false) {
			 System.out.println("Empty");
			 }
	 }	
	 
	 public void titleSearch(String title) {
		 boolean found = false;
		 String lowercaseTitle = title.toLowerCase();
		 for (DigitalVideoDisc disc : itemsOrdered) {
			 if (disc == null) {
				 break;
			 }
			 String[] keywords = lowercaseTitle.split(" ");
			 String lowercaseDVDTitle = disc.getTitle().toLowerCase();
			 for (String keyword : keywords) {
			        if (lowercaseDVDTitle.contains(keyword)) {
			            found = true;
			            System.out.println("found: " + disc.toString());
			            break;
			        }
			    }
		 }

		 if (found == false) {
			 System.out.println("Empty");
			 }
	 }
}