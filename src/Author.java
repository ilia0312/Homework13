import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author (String name, String surname) {
        this.authorName = name;
        this.authorSurname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

    public String toString() {
        return ", автор " + authorName + " " + authorSurname;
    }
}

