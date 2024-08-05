
public class SearchAlgorithms {
    // Linear search algorithm
    public static int linearSearch(Product[] products, String targetProductId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId().equals(targetProductId)) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Binary search algorithm
    public static int binarySearch(Product[] products, String targetProductId) {
        int left = 0;
        int right = products.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(targetProductId);
            
            if (comparison == 0) {
                return mid; // Return the index if found
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if not found
    }
}
