/**
 * Created by sbmmartins on 8/16/16.
 */
//@FunctionalInterface
public interface Product {
    public abstract void abc();

    public default void test() {
        EBook ebook = new EBook("As aventuras loucas de Batman e Robin", "123.456.788.9",
                                100.0, null, null, "AAAAAAAAAA");
    }
}
