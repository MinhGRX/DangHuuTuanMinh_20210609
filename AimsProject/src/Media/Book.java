package aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media{
	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	private static int nbBooks = 0;
	
	public Book() {
		super();
		nbBooks++;
		setId(nbBooks);
	}

	public String toString() {
		return "Book - " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() +
			   " - " + this.getCost() + "$";
	}
	
	public boolean contains(String authorName) {
		for (String author: authors){
			if(author.equals(authorName)) return true;
		}
		return false;
	}

	public void addAuthor(String authorName) {
			if(contains(authorName)) 
				System.out.println("Author name existed");
			else {
				authors.add(authorName);
				System.out.println("Author name is added");
			}
	}
	
	public void addAuthor(List<String> authorName) {
		for(String author: authorName) {
			if(contains(author)) 
				System.out.println("Author name existed");
			else {
				authors.add(author);
				System.out.println("Author name is added");
			}
		}
	}
	
	public void removeAuthor(String authorName) {
			if(contains(authorName)) {
				authors.remove(authorName);
				System.out.println("Author name is removed");
			} else System.out.println("Author name is not exist");
		
	}
	
	public void removeAuthor(List<String> authorName) {
		for(String author: authorName) {
			if(contains(author)) {
				authors.remove(author);
				System.out.println("Author name is removed");
			} else System.out.println("Author name is not exist");
		}
	}

}
