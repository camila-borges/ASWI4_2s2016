import java.util.ArrayList;

/**
 * Created by sbmmartins on 8/5/16.
 */
public class Order {
    private ArrayList<Book> books = new ArrayList<Book>();

    public void add(Book book, double perc) {
        System.out.println("--> Adding Book");
        book.applyDiscount(perc);
        this.books.add(book);
        book.print();
    }
}
