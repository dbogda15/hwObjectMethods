import java.util.Objects;
public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Franklin Patrick", "Herbert");
        Book book1 = new Book("Dune", author1, 1965);
        book1.setPublicationYear(2021);
        System.out.println(book1);

        Author author2 = new Author("J.K.", "Rowling");
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", author2, 1997);
        System.out.println(book2);

        Author author3 = new Author("Lev", "Tolstoy");
        Book book3 = new Book("War and Peace", author3, 1990);
        System.out.println(book3);
        System.out.println(author3);
    }
}