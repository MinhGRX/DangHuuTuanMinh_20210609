package aims.media;

import java.util.Comparator;

public abstract class Media implements Comparable<Media> {
	private int id;
	private String title;
	private String category;
	private float cost;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	@Override
	public boolean equals(Object obj) {
		Media media = (Media) obj;
		return (this.title.equals(media.getTitle()));
	}
	
	@Override
	public int compareTo(Media media) {
		if(this.cost > media.getCost()) return 1;
		else if(this.cost < media.getCost()) return -1;
		else return (this.title.compareTo(media.getTitle()));
	}
	
	public Media() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	

}
