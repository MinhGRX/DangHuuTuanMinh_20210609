package aims.store.Store;

import java.util.ArrayList;
import java.util.List;
import aims.media.Media;

public class Store {
    private List<Media> itemsInStore = new ArrayList<Media>();
    private static int MAX_SIZE = 20;
    
	public boolean contains(Media media) {
		for(Media item: itemsInStore) {
			if(item == media) return true;
		}
		return false;
	}

	public Media search(String title) {
		for(Media item: itemsInStore) {
			if(item.getTitle().equals(title)) return item;
		}
		return null;
	}
	
	public void addMedia(Media media) {
			if(contains(media)) 
				System.out.println("Media is already existed");
			else if(itemsInStore.size() < MAX_SIZE) {
				itemsInStore.add(media);
				System.out.println("Media is added");
			} else System.out.println("Cannot add. Store is full");
		
	}
	
	public void addMedia(List<Media> media) {
		for(Media mediae: media) {
			if(contains(mediae)) System.out.println("Media is already existed");
			else if(itemsInStore.size() < MAX_SIZE) {
				itemsInStore.add(mediae);
				System.out.println("Media is added");
			} else System.out.println("Cannot add. Store is full");
		}
	}
	
	public void removeMedia(Media media) {
			if(contains(media)) {
				itemsInStore.remove(media);
				System.out.println("Media is removed");
				
			}
			else System.out.println("Media is not in the store");
				
		
	}
	
	public void removeMedia(List<Media> media) {
		for(Media mediae: media) {
			if(contains(mediae)) {
				itemsInStore.remove(mediae);
				System.out.println("Media is removed");
				
			}
			else System.out.println("Media is not in the store");
				
		}
	}
	
	public void printStore() {
		System.out.println("********************************Store********************************");
		for(Media item: itemsInStore) System.out.println(item.toString());
		System.out.println("*********************************************************************");
	}
}

