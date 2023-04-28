public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Robert Kiyosaki");
        Book book1 = new Book("RICH DAD poor dad", 2005, author1);
        Author author2 = new Author("Stephen King");
        Book book2 = new Book("The Shining", 1977, author2);
        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
        System.out.println();
        System.out.println("это одна и та же книга? - " + book1.equals(book2));
        System.out.println();
        System.out.println("хэш-код первой книги - " + book1.hashCode());
        System.out.println("хэш-код второй книги - " + book2.hashCode());
        System.out.println();
        System.out.println("хэш-код первого автора - " + author1.hashCode());
        System.out.println("хэш-код второого автора - " + author2.hashCode());
        System.out.println();
        book1.setPublicationYear(2017);
        System.out.println("год последней публикации для первой книги: " + book1.getPublicationYear());
    }
}