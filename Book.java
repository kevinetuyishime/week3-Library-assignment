public class Book {

    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter
    public String getAuthor() {
        return author;
    }

    // Setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter
    public String getIsbn() {
        return isbn;
    }

    // Setter
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // toString
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}