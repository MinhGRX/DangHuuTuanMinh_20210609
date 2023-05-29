package aims.cart.Cart;

import java.util.ArrayList;
import java.util.List;

import aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); 
    
    public void printCart() {
        System.out.println("***********************CART***********************");
        for (Media item: itemsOrdered)
        	System.out.println(item.toString());
        System.out.println("***************************************************");
    }

    public void PlaceOrder() {
		itemsOrdered = new ArrayList<Media>();
	}
    
    public Media search(int id) {
		for(Media item: itemsOrdered) {
			if(item.getId()==id) return item;
		}
		return null;
	}
    
    public void filter(int id) {
		Media item = search(id);
		if(item == null) System.out.println("Can't find item");
		else System.out.println(item.toString());
	}
    
    public void filter(String title) {
		Media item = search(title);
		if(item == null) System.out.println("Can't find item");
		else System.out.println(item.toString());
	}
    
    public List<Media> getItemsOrdered() {
		return itemsOrdered;
	}
    
    public Media search(String title) {
		for(Media item: itemsOrdered) {
			if(item.getTitle().equals(title)) return item;
		}
		return null;
	}
    
    public boolean contains(Media media) {
		for(Media item: itemsOrdered) {
			if(item == media) return true;
		}
		return false;
	}
    
    public float totalCost() {
        float total = 0;
        for (Media item: itemsOrdered) {
            total += item.getCost();
        }
        return total;
    }
 
    public void addMedia(Media media) {
    		if(contains(media)) 
    			System.out.println("Media is already added");
    		else if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
    			itemsOrdered.add(media);
    			System.out.println("Media is added");
    		}
    		else System.out.println("Cannot add. Cart is full");
    }
    
    public void addMedia(List<Media> media) {
    	for(Media mediae: media) {
    		if(contains(mediae)) 
    			System.out.println("Media is already added");
    		else if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
    			itemsOrdered.add(mediae);
    			System.out.println("Media is added");
    		}
    		else System.out.println("Cannot add. Cart is full");
    	}
    }
    
    public void removeMedia(Media media) {
			if(contains(media)) {
				itemsOrdered.remove(media);
				System.out.println("Media is removed");
				
			}
			else System.out.println("Media is not in the cart");
	}
    
    public void removeMedia(List<Media> media) {
		for(Media mediae: media) {
			if(contains(mediae)) {
				itemsOrdered.remove(mediae);
				System.out.println("Media is removed");
				
			}
			else System.out.println("Media is not in the cart");
		}
	}
}