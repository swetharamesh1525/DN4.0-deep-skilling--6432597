import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Sample products
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shirt", "Clothing"),
            new Product(4, "Book", "Stationery"),
            new Product(5, "Watch", "Accessories")
        };

        // Linear Search
        Product result1 = SearchAlgorithms.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));

        // Sort products for binary search (Sort by product name)
        Arrays.sort(products, new Comparator<Product>() {
            //@Override
            public int compare(Product a, Product b) {
                return a.getProductName().compareToIgnoreCase(b.getProductName());
            }
        });

        // Binary Search
        Product result2 = SearchAlgorithms.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product not found"));
    }
}
