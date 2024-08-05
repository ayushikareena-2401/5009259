
public class LibraryManagementSystem {
    private Book[] books;

    public LibraryManagementSystem(Book[] books) {
        this.books = books;
    }

    // Method to perform linear search by title
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Method to perform binary search by title (assuming the array is sorted by title)
    public Book binarySearchByTitle(String title) {
        int low = 0;
        int high = books.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            Book midBook = books[mid];
            int comparison = midBook.getTitle().compareToIgnoreCase(title);
            
            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; // Book not found
    }
}
