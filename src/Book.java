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

    public final String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "название книги: \"" + this.getTitle() + "\" " + getAuthor() + " год публикации: " + this.getPublicationYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.getTitle()) &&
                Objects.equals(author, book.getAuthor()) &&
                Objects.equals(publicationYear, book.getPublicationYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getPublicationYear());
    }


    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

