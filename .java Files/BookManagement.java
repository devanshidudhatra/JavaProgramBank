import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Serializable {
    private String bookTitle;
    private double bookPrice;
    private int bookId;

    public Book(String bookTitle, double bookPrice, int bookId) {
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "Book [Title=" + bookTitle + ", Price=" + bookPrice + ", ID=" + bookId + "]";
    }
}

public class BookManagement {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", 25.99, 1));
        books.add(new Book("Book2", 19.99, 2));
        books.add(new Book("Book3", 35.50, 3));
        books.add(new Book("Book4", 12.99, 4));
        books.add(new Book("Book5", 42.75, 5));

        // Serialize and save the books to the file "bookdetails.dat"
        saveBooks(books);

        // Read the books from the file and perform operations
        List<Book> savedBooks = loadBooks();
        searchBookByTitle(savedBooks, "Book3");
        printBookWithHighestPrice(savedBooks);
    }

    public static void saveBooks(List<Book> books) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bookdetails.dat"))) {
            oos.writeObject(books);
            System.out.println("Books saved to 'bookdetails.dat'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Book> loadBooks() {
        List<Book> books = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bookdetails.dat"))) {
            books = (List<Book>) ois.readObject();
            System.out.println("Books loaded from 'bookdetails.dat'.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }

    public static void searchBookByTitle(List<Book> books, String titleToSearch) {
        for (Book book : books) {
            if (book.getBookTitle().equals(titleToSearch)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
        System.out.println("Book with title '" + titleToSearch + "' not found.");
    }

    public static void printBookWithHighestPrice(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books to compare.");
            return;
        }

        Book maxPriceBook = Collections.max(books, (b1, b2) -> Double.compare(b1.getBookPrice(), b2.getBookPrice()));
        System.out.println("Book with the highest price: " + maxPriceBook.getBookTitle());
    }
}
