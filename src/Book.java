public class Book {
    private final String title;

    private int publicationYear;

    public String author;

    public Book(String title, int publicationYear, String author) {
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

    public String getAuthor() {
        return author;
    }


    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}