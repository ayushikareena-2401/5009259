import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("001", "Laptop", "Electronics"),
            new Product("002", "Smartphone", "Electronics"),
            new Product("003", "Table", "Furniture"),
            new Product("004", "Chair", "Furniture"),
            new Product("005", "Headphones", "Accessories")
        };

        // Linear Search
        int linearSearchIndex = SearchAlgorithms.linearSearch(products, "003");
        System.out.println("Linear Search - Product found at index: " + linearSearchIndex);

        // Binary Search (Note: The array must be sorted by productId for binary search)
        Arrays.sort(products, (a, b) -> a.getProductId().compareTo(b.getProductId()));
        int binarySearchIndex = SearchAlgorithms.binarySearch(products, "003");
        System.out.println("Binary Search - Product found at index: " + binarySearchIndex);
    }
}
