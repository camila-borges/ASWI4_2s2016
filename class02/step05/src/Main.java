public class Main {

    public static void main(String[] args) {
        Author author = new Author("Batman", 13);
        Publisher pub = new Publisher("Gothan City Letters", 999);

        EBook ebook = new EBook("As aventuras loucas de Batman e Robin", "123.456.788.9",
                                 100.0, author, pub, "AAAAAAAAAA");


        System.out.println("\n");

        Author author2 = new Author("Tiririca", 171);
        PrintedBook pbook = new PrintedBook("A vida de um Abestado", "9999999999",
                                100.0, author2, pub, 50.0);

        Order cart = new Order();
        cart.add(ebook, 0.15);
        cart.add(pbook, 0.15);

    }
}






