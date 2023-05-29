package aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	private static int nbCompactDiscs = 0;
	
	public CompactDisc() {
		super();
		nbCompactDiscs++;
		setId(nbCompactDiscs);
	}
	
	@Override
	public void play() {
	    System.out.println("Playing album: " + this.getTitle() + " by " + this.getArtist());
	    for (Track track : tracks) {
	      track.play();
	    }
	}
	
	@Override
	public String toString() {
		return "CD - " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " 
			   + artist + " - " + this.getLength() + " min: " + this.getCost() + "$";
	}
	
	private boolean contains(Track Name) {
		for(Track track: tracks) {
			if(track.equals(Name))
				return true;
		}
		return false;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void addTrack(Track Name) {
		if(contains(Name)) System.out.println("Track is already existed");
		else {
			tracks.add(Name);
			System.out.println("Track is added");
		}
	}

	public void removeTrack(Track Name) {
		if(contains(Name)) {
			tracks.remove(Name);
			System.out.println("Track is removed");
		} else
			System.out.println("Track is not in the disc");
	}
	
	public int getLength() {
		int length = 0;
		for(Track track: tracks) {
			length += track.getLength();
		}
		return length;
	}
}
