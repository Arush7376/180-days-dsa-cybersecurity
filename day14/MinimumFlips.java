public class MinimumFlips {
    public static int minFlips(int a, int b, int c) {
        int flips = 0;
        for (int i = 0; i < 32; i++) {
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int bitC = (c >> i) & 1;

            if ((bitA | bitB) != bitC) {
                if (bitC == 1) {
                    flips++; // Flip either bitA or bitB to 1
                } else {
                    flips += bitA + bitB; // Flip both 1s to 0s
                }
            }
        }
        return flips;
    }

    public static void main(String[] args) {
        // Test cases
        int a1 = 2, b1 = 6, c1 = 5;
        System.out.println("Input: a = " + a1 + ", b = " + b1 + ", c = " + c1);
        System.out.println("Output: " + minFlips(a1, b1, c1)); // Expected: 3

        int a2 = 4, b2 = 2, c2 = 7;
        System.out.println("\nInput: a = " + a2 + ", b = " + b2 + ", c = " + c2);
        System.out.println("Output: " + minFlips(a2, b2, c2)); // Expected: 1

        int a3 = 1, b3 = 2, c3 = 3;
        System.out.println("\nInput: a = " + a3 + ", b = " + b3 + ", c = " + c3);
        System.out.println("Output: " + minFlips(a3, b3, c3)); // Expected: 0
    }
}