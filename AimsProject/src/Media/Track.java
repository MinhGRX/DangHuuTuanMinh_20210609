package aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	
	@Override
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		
	}
	
	@Override
	public boolean equals(Object obj) {
		Track track = (Track) obj;
		return (this.title.equals(track.getTitle()) && this.length==track.getLength());
	}
	
	public Track() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}



}
