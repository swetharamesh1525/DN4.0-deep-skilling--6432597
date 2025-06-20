import java.util.HashMap;
public class FinancialForecast {
    // Recursive method with memoization
    public static double calculateFutureValueOptimized(double presentValue, double growthRate, int periods, HashMap<Integer, Double> memo) {
        // Check if result is already computed
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }

        // Base case
        if (periods == 0) {
            return presentValue;
        }

        // Recursive case
        double result = calculateFutureValueOptimized(presentValue, growthRate, periods - 1, memo) * (1 + growthRate);

        // Store result in memoization map
        memo.put(periods, result);
        return result;
    }

    public static void main(String[] args) {
        // data
        double presentValue = 20000;  // Initial investment
        double growthRate = 0.06;     // 6% annual growth rate
        int periods = 10;              // Predict for 5 years

        // Memoization map
        HashMap<Integer, Double> memo = new HashMap<>();

        // Calculate future value using optimized recursion
        double futureValue = calculateFutureValueOptimized(presentValue, growthRate, periods, memo);

        // Display the result
        System.out.printf("Future Value after %d years: %.2f%n", periods, futureValue);
    }
}
