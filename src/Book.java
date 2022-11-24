import java.util.Objects;

public class Book {
    private final String booksName;
    private final Author author;
    private int publicationYear;

    public Book (String booksName, Author author, int publicationYear) {
        this.booksName = booksName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBooksName () {
        return this.booksName;
    }

    public String getAuthor () {
        return author.getAuthorsFirstName() + " " + author.getAuthorsSurname();
    }

    public int getPublicationYear () {
        return publicationYear;
    }

    public void setPublicationYear (int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(booksName, author, publicationYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(booksName, book.booksName) && Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return booksName + ", " + author + ", " + publicationYear;
    }
}
