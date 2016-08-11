/**
 * Created by sbmmartins on 8/5/16.
 */
public class EBook extends Book {
    private String watermark;

    public EBook(String title, String isbn, double price,
                 Author author, Publisher publisher, String watermark) {
        super(title, isbn, price, author, publisher);
        this.watermark = watermark;
    }

    @Override
    public void applyDiscount(double perc) {
        if (perc <= 0.15) {
            double discount = this.getPrice() * perc;
            this.setPrice(this.getPrice() - discount);
        }
    }


    @Override
    public void print() {
        super.print();
        System.out.println("- watermark: " + this.watermark);
        System.out.println("---------------");
    }
}
