public class FinancialForecasting {
    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: No periods left
        if (periods == 0) {
            return presentValue;
        }
        // Recursive case: Reduce periods and apply growth rate
        return calculateFutureValue(presentValue, growthRate, periods - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        // Example data
        double presentValue = 20000;  // Initial investment
        double growthRate = 0.06;     // 6% annual growth rate
        int periods = 5;              // Predict for 5 years

        // Calculate future value using recursion
        double futureValue = calculateFutureValue(presentValue, growthRate, periods);

        // Display the result
        System.out.printf("Future Value after %d years: %.2f%n", periods, futureValue);
    }
}


