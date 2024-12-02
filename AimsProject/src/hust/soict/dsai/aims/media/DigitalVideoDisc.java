package AimsProject.src.hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDiscs = 0; 

    public DigitalVideoDisc(String title) {
        super(++nbDigitalVideoDiscs, title, null, 0.0f, 0, null);
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, null);
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, length, director);
    }

    @Override
    public String toString() {
        return "DVD - " + super.toString();
    }

    public boolean isMatch(String title) {
        return this.getTitle() != null && this.getTitle().equalsIgnoreCase(title);
    }
}

