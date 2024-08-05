public class Logger {
    // Private static instance of Logger class
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Initialize logger resources
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
