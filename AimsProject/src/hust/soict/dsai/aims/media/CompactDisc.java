package AimsProject.src.hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist; 
    private ArrayList<Track> tracks; 

    public CompactDisc(String title, String category, double cost, String director, int length, String artist) {
        super(0, title, category, cost, length, director); 
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    public CompactDisc(String title, String artist) {
        super(); 
        this.setTitle(title);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track \"" + track.getTitle() + "\" is already in the CD.");
        } else {
            tracks.add(track);
            System.out.println("The track \"" + track.getTitle() + "\" has been added to the CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("The track \"" + track.getTitle() + "\" has been removed from the CD.");
        } else {
            System.out.println("The track \"" + track.getTitle() + "\" is not found in the CD.");
        }
    }

    public int getLength() {
        return tracks.stream().mapToInt(Track::getLength).sum();
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD Artist: " + this.artist);
        System.out.println("CD Tracks:");
        for (Track track : tracks) {
            track.play(); // Calls the play() method of each track
        }
    }

    @Override
    public String toString() {
        return "CD - " + super.toString() + 
               ", Artist: " + artist + 
               ", Tracks: " + tracks.size() + 
               ", Total Length: " + getLength() + " mins";
    }
}