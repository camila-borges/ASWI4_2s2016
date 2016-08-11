public class Main {

    public static void main(String[] args) {
        Author author = new Author("Batman", 13);
        Publisher pub = new Publisher("Gothan City Letters", 999);

        Book book = new Book("As aventuras loucas de Batman e Robin", "123.456.788.9",
                             100.0, author, pub);


        book.print();
        System.out.println("\n");

        book.applyDiscount(0.5);
        book.print();
    }
}






