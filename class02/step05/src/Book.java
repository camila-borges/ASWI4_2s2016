/**
 * Created by sbmmartins on 8/5/16.
 */
public abstract class Book {
    private String title;
    private String isbn;
    private double price;
    private Author author;
    private Publisher publisher;

    public Book(String title, String isbn, double price, Author author, Publisher publisher) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }

    public Book(Author author) {
        this("", "000.0000.000", 0.0, author, null);
    }

    public Author getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double perc) {
        if (perc <= 0.3) {
            double discount = this.price * perc;
            this.price -= discount;
        }
    }


    public void print() {
        System.out.println("---------------");
        System.out.println("- title: " + this.title);
        System.out.println("- isbn: " + this.isbn);
        System.out.println("- price: " + this.price);
        System.out.println("---------------");
        this.author.print();
        if (this.publisher != null) {
            this.publisher.print();
        }
    }
}




















