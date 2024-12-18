package AimsProject.src.hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors;

    // Default constructor
    public Book() {
        super();
        this.authors = new ArrayList<>();
    }

    public Book(int id, String title, String category, double cost) {
        super(id, title, category, cost);
        this.authors = new ArrayList<>();
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String author) {
        if (author != null && !author.isEmpty() && !this.authors.contains(author)) {
            this.authors.add(author);
            System.out.println("Author added: " + author);
        } else {
            System.out.println("Author is either null, empty, or already exists.");
        }
    }

    public void removeAuthor(String author) {
        if (this.authors.contains(author)) {
            this.authors.remove(author);
            System.out.println("Author removed: " + author);
        } else {
            System.out.println("Author not found: " + author);
        }
    }

    @Override
    public String toString() {
        return "Book: " + super.toString() + ", " + authors;
    }
}

