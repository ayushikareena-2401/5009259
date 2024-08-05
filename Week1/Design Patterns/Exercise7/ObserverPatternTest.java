public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create a stock market instance
        StockMarket stockMarket = new StockMarket("TechCorp");

        // Create observer instances
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers with the stock market
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        stockMarket.setStockPrice(150.75);

        // Deregister one observer and update stock price
        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice(155.00);
    }
}
