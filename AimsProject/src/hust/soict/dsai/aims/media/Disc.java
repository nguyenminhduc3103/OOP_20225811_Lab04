package AimsProject.src.hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc() {
        super();
    }

    public Disc(int id, String title, String category, double cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Length: " + length + " mins";
    }
}