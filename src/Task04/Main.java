package Task04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    static Map<Book, String> library = new HashMap<>();

    public static void main(String[] args) {
        Book jaime = new Book("Jaime Lannister", "Tirion Lannister", 159);
        Book serseya = new Book("Serseya Lannister", "Tirion Lannister", 159);
        Book tyvin = new Book("Tyvin Lannister", "Tirion Lannister", 159);

        library.put(jaime, "Upper shelf");
        library.put(serseya, "Middle shelf");
        library.put(tyvin, "Lower shelf");

        System.out.println(library.size());

        addBook("Tirion Lannister", "Tirion Lannister", 159, "Lower shelf");
        System.out.println(library.size());
        printAllBooks();

        deleteBook("Tirion Lannister", "Tirion Lannister", 159);
        System.out.println(library.size());

        System.out.println(searchInLibrary("Jaime Lannister", "Tirion Lannister", 159));
        System.out.println(searchInLibrary("Tirion Lannister", "Tirion Lannister", 159));

        printAllBooks();
    }
    public static void addBook(String name, String author, int year, String location) {
        library.put(new Book(name, author, year), location);
    }

    public static void deleteBook(String name, String author, int year) {
        Iterator<Map.Entry<Book, String>> iterator = library.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, String> next = iterator.next();
            Book key = next.getKey();
            if (key.equals(new Book(name, author, year))) {
                iterator.remove();
                break;
            }
        }
    }

    public static String searchInLibrary(String name, String author, int year) {
        for (Book book : library.keySet()) {
            if (book.equals(new Book(name, author, year))) {
                return library.get(book);
            }
        }
        return new String("Book not found");
    }
    public static void printAllBooks() {
        for (Book book : library.keySet()) {
            System.out.printf("Title: %s author: %s year: %d location: %s\n", book.getTitle(), book.getAuthor(), book.getYear(), library.get(book));
        }
    }
}
