public class SetBitsCounter {
    // Function to count the number of set bits
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); // removes the lowest set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 29; // Binary: 11101
        System.out.println("Number of set bits: " + countSetBits(number));
    }
}
