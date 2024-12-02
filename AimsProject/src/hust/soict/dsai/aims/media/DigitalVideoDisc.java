package AimsProject.src.hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    private static int nbDigitalVideoDiscs = 0; 

    public DigitalVideoDisc(String title) {
        super(); 
        this.setTitle(title);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs); 
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        super(nbDigitalVideoDiscs + 1, title, category, cost); 
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        super(nbDigitalVideoDiscs + 1, title, category, cost);
        this.director = director;
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(nbDigitalVideoDiscs + 1, title, category, cost);
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs++;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    @Override
    public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + director + " - " +
                length + " mins: $" + this.getCost();
    }

    public boolean isMatch(String title) {
        return this.getTitle() != null && this.getTitle().equalsIgnoreCase(title);
    }
}

