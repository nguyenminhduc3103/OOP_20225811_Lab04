package AimsProject.src.hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() {
        System.out.println("Playing Track: " + this.title);
        System.out.println("Track length: " + this.length + " mins");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; 
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Track otherTrack = (Track) obj; 
        return this.title != null && this.title.equalsIgnoreCase(otherTrack.title) 
                && this.length == otherTrack.length;
    }

    @Override
    public String toString() {
        return "Track: " +
                "title='" + title + '\'' +
                ", length=" + length;
    }
}