public class Main {

    public static void main(String[] args) {
        Author author = new Author("Batman", 13);
        Publisher pub = new Publisher("Gothan City Letters", 999);

        EBook ebook = new EBook("As aventuras loucas de Batman e Robin", "123.456.788.9",
                                 100.0, author, pub, "AAAAAAAAAA");


        ebook.print();
        System.out.println("\n");

        ebook.applyDiscount(0.15);
        ebook.print();
    }
}






