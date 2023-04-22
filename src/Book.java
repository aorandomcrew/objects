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


    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}