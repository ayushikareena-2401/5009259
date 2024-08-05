public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        // Base case: if no more years left, return the current value
        if (years == 0) {
            return currentValue;
        }
        // Recursive case: calculate future value for the next year
        double nextValue = currentValue * (1 + growthRate / 100);
        return predictFutureValue(nextValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0; // Initial value
        double growthRate = 5.0; // Annual growth rate in percentage
        int years = 10; // Number of years to forecast

        double futureValue = predictFutureValue(currentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}
