public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("001", "Alice", 250.50),
            new Order("002", "Bob", 100.00),
            new Order("003", "Charlie", 175.75),
            new Order("004", "David", 300.00),
            new Order("005", "Eve", 150.20)
        };

        // Bubble Sort
        System.out.println("Before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + " - " + order.getTotalPrice());
        }
        SortingAlgorithms.bubbleSort(orders);
        System.out.println("After Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + " - " + order.getTotalPrice());
        }

        // Reset orders array
        orders = new Order[]{
            new Order("001", "Alice", 250.50),
            new Order("002", "Bob", 100.00),
            new Order("003", "Charlie", 175.75),
            new Order("004", "David", 300.00),
            new Order("005", "Eve", 150.20)
        };

        // Quick Sort
        System.out.println("Before Quick Sort:");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + " - " + order.getTotalPrice());
        }
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("After Quick Sort:");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + " - " + order.getTotalPrice());
        }
    }
}
