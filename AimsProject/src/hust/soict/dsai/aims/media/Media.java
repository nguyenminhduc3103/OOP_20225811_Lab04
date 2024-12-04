package AimsProject.src.hust.soict.dsai.aims.media;
import java.util.Comparator;

public class Media {
    private int id;
    private String title;
    private String category;
    private double cost;

    public Media() {}

    public Media(int id, String title, String category, double cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isMatch(String title) {
        return getTitle() != null && getTitle().equalsIgnoreCase(title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; 
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        Media otherMedia = (Media) obj; 
        return this.title != null && this.title.equalsIgnoreCase(otherMedia.title); 
    }

    @Override
    public String toString() {
        return 
                " " + id +
                ", '" + title + '\'' +
                ", '" + category + '\'' +
                ", " + cost;
    }
    
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new Comparator<Media>() {
        @Override
        public int compare(Media m1, Media m2) {
            int titleComparison = m1.getTitle().compareToIgnoreCase(m2.getTitle());
            if (titleComparison != 0) {
                return titleComparison;
            }
            return Double.compare(m2.getCost(), m1.getCost());
        }
    };

    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new Comparator<Media>() {
        @Override
        public int compare(Media m1, Media m2) {
            int costComparison = Double.compare(m2.getCost(), m1.getCost());
            if (costComparison != 0) {
                return costComparison;
            }
            return m1.getTitle().compareToIgnoreCase(m2.getTitle());
        }
    };
}
