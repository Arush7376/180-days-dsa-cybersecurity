public class factorial {
    public static int factorial(int n) {
        if (n == 0) return 1;        // base case
        return n * factorial(n - 1); // recursive step
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}
