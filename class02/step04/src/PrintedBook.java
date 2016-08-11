/**
 * Created by sbmmartins on 8/5/16.
 */
public class PrintedBook extends Book {
    private double cost;

    public PrintedBook(String title, String isbn, double price, Author author,
                       Publisher publisher, double cost) {
        super(title, isbn, price, author, publisher);
        this.cost = cost;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("- cost: " + this.cost);
        System.out.println("---------------");
    }
}
