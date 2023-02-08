import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int agePublisher;

    public Book(String nameBook, Author author, int agePublisher) {
        this.nameBook = nameBook;
        this.author = author;
        this.agePublisher = agePublisher;
    }

    public void setAgePublisher(int agePublisher) {
        this.agePublisher = agePublisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return agePublisher == book.agePublisher && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, agePublisher);
    }

    public String toString() {
        return "Книга: " + this.nameBook + " " + this.author + ", выпущена в " + this.agePublisher;
    }
}
