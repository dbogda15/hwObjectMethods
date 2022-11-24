import java.util.Objects;

public class Author {
    private final String authorsFirstName;
    private final String authorsSurname;



    public Author (String authorsFirstName, String authorsSurname) {
        this.authorsFirstName = authorsFirstName;
        this.authorsSurname = authorsSurname;
    }

    public String getAuthorsFirstName () {
        return this.authorsFirstName;
    }

    public String getAuthorsSurname () {
        return this.authorsSurname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorsFirstName, authorsSurname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorsFirstName, author.authorsFirstName) && Objects.equals(authorsSurname, author.authorsSurname);
    }

    @Override
    public String toString() {
        return authorsFirstName + " " + authorsSurname ;
    }
}
