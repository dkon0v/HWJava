import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String authorLastName;
    private double price;
    private int yearPublished;
    private int pageCount;

    public Book(String title, String authorLastName, double price, int yearPublished, int pageCount) {
        this.title = title;
        this.authorLastName = authorLastName;
        this.price = price;
        this.yearPublished = yearPublished;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getPageCount() {
        return pageCount;
    }
}

public class Task10 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book A", "Author1", 9.99, 2015, 200));
        books.add(new Book("Book B", "Author2", 12.99, 2012, 250));
        books.add(new Book("Book C", "Author3", 14.99, 2018, 180));
        books.add(new Book("Book D", "Author4", 10.99, 2011, 300));

        List<String> selectedTitles = new ArrayList<>();

        for (Book book : books) {
            if (isPrime(book.getPageCount()) &&
                    book.getAuthorLastName().contains("A") &&
                    book.getYearPublished() >= 2010) {
                selectedTitles.add(book.getTitle());
            }
        }

        if (!selectedTitles.isEmpty()) {
            System.out.println("Selected books:");
            for (String title : selectedTitles) {
                System.out.println(title);
            }
        } else {
            System.out.println("No books found matching the criteria.");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
