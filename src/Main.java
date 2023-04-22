public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Rober Kiyosaki");
        Book book1 = new Book("RICH DAD poor dad", 2005, "роберт");
        Author author2 = new Author("Stephen King");
        Book book2 = new Book("The Shining", 1977, "author2");
        System.out.println("название первой книги: " + book1.getTitle() + ", автор: " + book1.getAuthor() + ", год публикации: " + book1.getPublicationYear());
        System.out.println();
        System.out.println("название второй книги: " + book2.getTitle() + ", автор: " + book2.getAuthor() + ", год публикации: " + book2.getPublicationYear());
        System.out.println();
        book1.setPublicationYear(2017);
        System.out.println("Год публикации последнего издания первой книги: " + book1.getPublicationYear());
    }
}