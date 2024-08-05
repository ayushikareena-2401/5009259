
public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("001", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("002", "Moby Dick", "Herman Melville"),
            new Book("003", "To Kill a Mockingbird", "Harper Lee"),
            new Book("004", "1984", "George Orwell"),
            new Book("005", "Pride and Prejudice", "Jane Austen")
        };

        // Sort books array by title for binary search
        Arrays.sort(books, Comparator.comparing(Book::getTitle));

        LibraryManagementSystem library = new LibraryManagementSystem(books);

        // Linear Search
        System.out.println("Linear Search:");
        Book book = library.linearSearchByTitle("1984");
        if (book != null) {
            System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Book not found.");
        }

        // Binary Search
        System.out.println("Binary Search:");
        book = library.binarySearchByTitle("1984");
        if (book != null) {
            System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
    }
}
