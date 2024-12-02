package AimsProject.src.hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class Book {
    private int bookId;
    private String bookTitle;
    private String bookCategory;
    private float bookCost;
    private ArrayList<String> bookAuthors;

    // Constructor
    public Book(int bookId, String bookTitle, String bookCategory, float bookCost) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookCategory = bookCategory;
        this.bookCost = bookCost;
        this.bookAuthors = new ArrayList<>();
    }

    // Getters and setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public float getBookCost() {
        return bookCost;
    }

    public void setBookCost(float bookCost) {
        this.bookCost = bookCost;
    }

    public ArrayList<String> getBookAuthors() {
        return bookAuthors;
    }

    // Methods for managing authors
    public void addBookAuthor(String authorName) {
        if (!bookAuthors.contains(authorName)) {
            bookAuthors.add(authorName);
            System.out.println("Author added: " + authorName);
        } else {
            System.out.println("Author already exists: " + authorName);
        }
    }

    public void removeBookAuthor(String authorName) {
        if (bookAuthors.contains(authorName)) {
            bookAuthors.remove(authorName);
            System.out.println("Author removed: " + authorName);
        } else {
            System.out.println("Author not found: " + authorName);
        }
    }
}
