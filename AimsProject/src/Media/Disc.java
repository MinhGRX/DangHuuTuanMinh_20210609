package aims.media;

public abstract class Disc extends Media{
	private int length;
	private String director;
	
	public Disc() {
		super();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
