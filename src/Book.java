import java.util.Objects;

public class Book {
    private final String title;

    private int publicationYear;

    public Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;

        this.publicationYear = publicationYear;

        this.author = author;
    }

    @Override
    public String toString() {
        return "название книги: \"" + title + "\" " + author + " год публикации: " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publicationYear, book.publicationYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}

