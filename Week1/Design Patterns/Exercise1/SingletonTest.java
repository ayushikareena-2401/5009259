public class SingletonTest {
    public static void main(String[] args) {
        // Get the instance of Logger and log a message
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Get another instance of Logger and log another message
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Verify that both logger instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different logger instances.");
        }
    }
}
