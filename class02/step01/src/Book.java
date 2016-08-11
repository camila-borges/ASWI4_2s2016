/**
 * Created by sbmmartins on 8/5/16.
 */
public class Book {
    private String title;
    private String isbn;
    private Author author;
    private Publisher publisher;

    public Book(String title, String isbn, Author author, Publisher publisher) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }

    public Book(Author author) {
        this("", "000.0000.000", author, null);
    }

    public Author getAuthor() {
        return this.author;
    }

    public void print() {
        System.out.println("---------------");
        System.out.println("- title: " + this.title);
        System.out.println("- isbn: " + this.isbn);
        System.out.println("---------------");
        this.author.print();
        if (this.publisher != null) {
            this.publisher.print();
        }
    }
}




















